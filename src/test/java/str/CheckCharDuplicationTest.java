package str;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckCharDuplicationTest {
    CheckCharDuplication checkCharDuplication;

    @Before
    public void initialize() {
        checkCharDuplication = new CheckCharDuplication();
    }

    @Test
    public void testTrue() {
        String str = "hello";
        assertTrue(checkCharDuplication.isDuplicated(str));
    }

    @Test
    public void testTrue2() {
        String str = "heLlo";
        assertFalse(checkCharDuplication.isDuplicated(str));
    }

    @Test
    public void testFalse() {
        String str = "jakob";
        assertFalse(checkCharDuplication.isDuplicated(str));
    }
}
