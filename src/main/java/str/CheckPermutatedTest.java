package main.java.str;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckPermutatedTest {
    CheckPermutated checkPermutated;
    
    @Before
    public void setUp() throws Exception {
        checkPermutated = new CheckPermutated();
    }

    @Test
    public void test() {
        assertTrue(checkPermutated.isPermutated("test", "estt"));
    }

    @Test
    public void testFalse() {
        assertFalse(checkPermutated.isPermutated("test", "tesst"));
    }
}
