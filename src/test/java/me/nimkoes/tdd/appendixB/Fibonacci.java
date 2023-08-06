package me.nimkoes.tdd.appendixB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fibonacci {

    @Test
    public void testFibonacci() {
        int cases[][] = {{0, 0}, {1, 1}};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(cases[i][1], fib(cases[i][0]));
        }
    }

    int fib(int n) {
        if (n == 0) {
            return 0;
        }
        return 1;
    }
}
