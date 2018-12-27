package test.java.recursive;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.recursive.TripleStep;

public class TripleStepTest {
    TripleStep tripleStep;
    
    @Before
    public void setUp() throws Exception {
        tripleStep = new TripleStep();
    }

    @Test
    public void test() {
        int result = tripleStep.calculate(3);
        assertEquals(4, result);
    }

    @Test
    public void test2() {
        int result = tripleStep.calculate(4);
        assertEquals(7, result);
    }
}
