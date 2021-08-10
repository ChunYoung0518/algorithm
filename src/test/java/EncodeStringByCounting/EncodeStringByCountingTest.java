package EncodeStringByCounting;

import org.junit.jupiter.api.Test;

import static EncodeStringByCounting.EncodeStringByCounting.solution;
import static org.junit.jupiter.api.Assertions.*;

class EncodeStringByCountingTest {

    @Test
    public void whenInput_aaaabbcccaa_thenReturn_a4b2c3a2() {
        assertEquals("a4b2c3a2", solution("aaaabbcccaa"));
    }

    @Test
    public void whenInput_a_thenReturn_a1() {
        assertEquals("a1", solution("a"));
    }

    @Test
    public void whenInput_aaaabbcccaaz_thenReturn_a4b2c3a2z1() {
        assertEquals("a4b2c3a2z1", solution("aaaabbcccaaz"));
    }

}