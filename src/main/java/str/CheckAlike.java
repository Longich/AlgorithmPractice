package str;

public class CheckAlike {
    public boolean isAlike(String str1, String str2) {
        if (str1.equals(str2)) return true;
        if (str1.length() > str2.length()) {
            return checkAlike(str1, str2);
        } else if (str1.length() < str2.length()) {
            return checkAlike(str2, str1);
        } else {
            return false;
        }
    }
    
    /**
     * @param str1 longerString
     * @param str2 shorterString
     * @return result
     */
    private boolean checkAlike(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            String newString = str1.substring(0, i) + str2.substring(i + 1, str1.length());
            if (newString.equals(str2)) return true;
        }
        return false;
    }
}
