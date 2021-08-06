package UsersAndDesigns;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesignServiceImplTest {

    private static AuthContext context;

    @BeforeAll
    public static void init() {
        context = new AuthContext("1111");
    }

    @Test
    public void whenAUserCreatesANewDesign_thenASingleDesignSavedInTheDatabase() {
        DesignServiceImpl aSingleRun = new DesignServiceImpl();
        String designId = aSingleRun.createDesign(context, "content");

        String res = aSingleRun.getDesign(context, designId);
        assertEquals("content", res);
    }

    @Test
    public void whenAUserCreatesTwoNewDesigns_thenTwoDeisgnsSavedInTheDatabase() {
        DesignServiceImpl aSingleRun = new DesignServiceImpl();
        String designId1 = aSingleRun.createDesign(context, "content1");
        String designId2 = aSingleRun.createDesign(context, "content2");
        List<String> expectation = new ArrayList<>();
        expectation.add(designId1);
        expectation.add(designId2);

        List<String> ids = aSingleRun.findDesigns(context);
        assertEquals(expectation, ids);
    }

}