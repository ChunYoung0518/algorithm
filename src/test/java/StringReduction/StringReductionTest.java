package StringReduction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringReductionTest {

    @Test
    public void whenUsingStackToReduct_abcabc_thenReturnCorrectResult() {
        assertEquals(2, StringReduction.reductByUsingStack("abcabc"));
    }

    @Test
    public void whenUsingStackToReduct_cab_thenReturnCorrectResult() {
        assertEquals(2, StringReduction.reductByUsingStack("cab"));
    }

    @Test
    public void whenUsingStackToReduct_cccc_thenReturnCorrectResult() {
        assertEquals(4, StringReduction.reductByUsingStack("cccc"));
    }

    @Test
    public void whenUsingLoopToReduct_abcabc_thenReturnCorrectResult() {
        assertEquals(2, StringReduction.reductByUsingLoop("abcabc"));
    }

    @Test
    public void whenUsingLoopToReduct_cab_thenReturnCorrectResult() {
        assertEquals(2, StringReduction.reductByUsingLoop("cab"));
    }

    @Test
    public void whenUsingLoopToReduct_cccc_thenReturnCorrectResult() {
        assertEquals(4, StringReduction.reductByUsingLoop("cccc"));
    }

}