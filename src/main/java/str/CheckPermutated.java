package main.java.str;

public class CheckPermutated {
    public boolean isPermutated(String a, String b) {
        int[] box = new int[128];

        for (int i=0; i<a.length(); i++) {
            int cha = a.charAt(i);
            box[cha]++;
        }
        for (int i=0; i<b.length(); i++) {
            int cha = b.charAt(i);
            box[cha]--;
        }
        for (int i=0; i<128; i++) {
            if (box[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
}
