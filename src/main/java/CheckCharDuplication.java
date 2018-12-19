package main.java;

public class CheckCharDuplication {
    public boolean checkDuplication(String s) {
        int length = s.length();
        for (int i=0; i < length; i++) {
            char c = s.charAt(i);
            for (int j=i+1; j < length; j++) {
                if (c == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
