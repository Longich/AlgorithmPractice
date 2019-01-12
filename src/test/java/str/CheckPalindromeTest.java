package str;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {
    CheckPalindrome checkPalindrome;

    @Before
    public void setUp() throws Exception {
        checkPalindrome = new CheckPalindrome();
    }

    @Test
    public void test() {
        String str = "Tact Coa";
        assertTrue(checkPalindrome.isPalindrome(str));
    }

}
