package main.java.recursive;

public class TripleStep {

    
    public int calculate(int i) {
        if (i == 0) return 1;
        if (i == 1) return 1;
        if (i == 2) return 2;
        int result = calculate(i - 3) + calculate(i - 2) + calculate(i - 1);
        return result;
    }

}
