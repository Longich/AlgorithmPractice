package str;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReplaceSpaceTest {
    ReplaceSpace replaceSpace;

    @Before
    public void setUp() throws Exception {
        replaceSpace = new ReplaceSpace();
    }

    @Test
    public void replace() {
        String a = "hello, my name is John.";
        String expected = "hello,%20my%20name%20is%20John.";
        assertTrue(replaceSpace.replace(a).equals(expected));
    }

}
