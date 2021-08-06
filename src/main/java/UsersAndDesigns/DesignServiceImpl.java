package UsersAndDesigns;

import java.util.*;

public class DesignServiceImpl implements DesignService {

    Map<String, Map<String, DesignEntity>> database = new HashMap<>();

    @Override
    public String createDesign(AuthContext ctx, String designContent) {
        DesignEntity newDesign = new DesignEntity(UUID.randomUUID().toString(), ctx.userId);
        newDesign.setContent(designContent);

        Map<String, DesignEntity> designs = database.getOrDefault(ctx.userId, new HashMap<>());
        designs.put(newDesign.designId, newDesign);
        database.put(ctx.userId, designs);
        return newDesign.designId;
    }

    @Override
    public String getDesign(AuthContext ctx, String designId) throws RuntimeException{
        Map<String, DesignEntity> designs = database.get(ctx.userId);
        if (designs != null && !designs.isEmpty()) {
            DesignEntity design = designs.get(designId);
            if(design != null) {
                return design.content;
            } else {
                throw new RuntimeException("Resource not found or does not have accessibility");
            }
        } else {
            throw new RuntimeException("Resource not found or does not have accessibility");
        }
    }

    @Override
    public List<String> findDesigns(AuthContext ctx) {
        Map<String, DesignEntity> designs = database.get(ctx.userId);
        if(designs != null && !designs.isEmpty()) {
            List<String> res = new ArrayList<>();
            res.addAll(designs.keySet());
            return res;
        } else {
            throw new RuntimeException("Resource not found or does not have accessibility");
        }
    }

}
//
//designId: design;
//userId: HashMap<deisngID, Design>

