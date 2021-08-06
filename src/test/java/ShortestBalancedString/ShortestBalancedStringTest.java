package ShortestBalancedString;

import org.junit.jupiter.api.Test;

import static ShortestBalancedString.ShortestBalancedString.solution;
import static org.junit.jupiter.api.Assertions.*;

class ShortestBalancedStringTest {

    @Test
    public void whenInput_azABaabba_thenReturn_5forABaab() {
        assertEquals(5, solution("azABaabba"));
    }

    @Test
    public void whenInput_Technocat_thenReturn_none() {
        assertEquals(-1, solution("Technocat"));
    }

    @Test
    public void whenInput_A_thenReturn_none() {
        assertEquals(-1, solution("A"));
    }

    @Test
    public void whenInput_AbBa_thenReturn_2forbB() {
        assertEquals(2, solution("AbBa"));
    }

}