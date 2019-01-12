package str;

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
    public void testTrue() {
        assertTrue(checkPermutated.isPermutated("test", "estt"));
    }

    @Test
    public void testFalse() {
        assertFalse(checkPermutated.isPermutated("test", "tesst"));
    }

    @Test
    public void testTrue2() {
        assertTrue(checkPermutated.isPermutated("hello", "loelh"));
    }
}
