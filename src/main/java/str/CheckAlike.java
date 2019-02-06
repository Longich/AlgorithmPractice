package str;

public class CheckAlike {
    public boolean isAlike(String str1, String str2) {
        if (str1.equals(str2)) return true;
        return checkAlike(str1, str2);
    }

    /**
     * @param str1 longerString
     * @param str2 shorterString
     * @return result
     */
    private boolean checkAlike(String s1, String s2) {
    	if (s1.length() == s2.length()) {
    		for (int i = 0; i < s1.length(); i++) {
    			String newStr1 = s1.substring(0, i) + s1.substring(i + 1, s1.length());
    			String newStr2 = s2.substring(0, i) + s2.substring(i + 1, s2.length());
    			if (newStr1.equals(newStr2)) {
    				return true;
    			}
    		}
    		return false;
    	}
    	String str1 = "", str2 ="";
    	if (s1.length() > s2.length()) {
    		str1 = s1;
    		str2 = s2;
    	} else if (s1.length() < s2.length()) {
    		str1 = s2;
    		str2 = s1;
    	}
        for (int i = 0; i < str1.length(); i++) {
        	System.out.println(i);
            String newString = str1.substring(0, i) + str1.substring(i + 1, str1.length());
            if (newString.equals(str2)) return true;
        }
        return false;
    }
}
