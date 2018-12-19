package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.CheckCharDuplication;

public class CheckCharDuplicationTest {
    @Test
    public void testTrue() {
        String str = "hello";
        CheckCharDuplication checkCharDuplication = new CheckCharDuplication();
        assertTrue(checkCharDuplication.checkDuplication(str));
    }
    
    @Test
    public void testTrue2() {
        String str = "heLlo";
        CheckCharDuplication checkCharDuplication = new CheckCharDuplication();
        assertFalse(checkCharDuplication.checkDuplication(str));
    }
}
