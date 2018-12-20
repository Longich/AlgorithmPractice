package main.java.str;

public class CheckCharDuplication {
    public boolean isDuplicated(String s) {
        // ASCII準拠で128文字とする
        if (s.length() > 128) {
            return false;
        }
        boolean[] box = new boolean[128];
        for (int i=0; i < s.length(); i++) {
            int chara = s.charAt(i);
            if(box[chara]) {
                return true;
            }
            box[chara] = true;
        }
        return false;
    }
}
