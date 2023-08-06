package me.nimkoes.tdd.appendixB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Fibonacci {

    @Test
    public void testFibonacci() {
        Assertions.assertEquals(0, fib(0));
        Assertions.assertEquals(1, fib(1));
    }

    int fib(int n) {
        if (n == 0) {
            return 0;
        }
        return 1;
    }
}
