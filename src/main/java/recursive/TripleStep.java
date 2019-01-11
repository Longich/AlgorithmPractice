package main.java.recursive;

import java.util.HashMap;
import java.util.Map;

public class TripleStep {
    private Map<Integer, Integer> map = new HashMap<>();
    
    public int calculate(int i) {
        if (i <  0) return 0;
        if (i == 0) return 1;
        if (map.containsKey(i)) return map.get(i);
        int result = calculate(i - 3) + calculate(i - 2) + calculate(i - 1);
        return result;
    }

//    3^n logic
//    public int calculate(int i) {
//        if (i < 0) return 0;
//        if (i == 0) return 1;
//        int result = calculate(i - 3) + calculate(i - 2) + calculate(i - 1);
//        return result;
//    }
}
