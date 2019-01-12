package str;

public class ReplaceSpace {
    public String replace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char letter = s.charAt(i);
            if ((" ").equals(letter)) {
                sb.append("%");
                sb.append("20");
            } else {
                sb.append(letter);
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
