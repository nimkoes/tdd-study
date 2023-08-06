package me.nimkoes.tdd.appendixB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Fibonacci {

    @Test
    public void testFibonacci() {
        Assertions.assertEquals(0, fib(0));
    }

    int fib(int n) {
        return 0;
    }
}
