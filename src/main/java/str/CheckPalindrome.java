package str;

public class CheckPalindrome {
    public boolean isPalindrome(String s) {
        char[] table = new char[128];
        for (int i=0; i<s.length(); i++) {
            table[s.charAt(i)]++;
        }
        int oddCount = 0; //奇数の数を数える
        for (int i=0; i<128; i++) {
            if (table[i] % 2 == 1) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }
}
