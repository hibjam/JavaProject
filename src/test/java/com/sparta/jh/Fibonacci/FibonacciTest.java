package com.sparta.jh.Fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    @DisplayName("Does return number?")
    void doesReturnNumber() {
        Assertions.assertEquals(1, Fibonacci.getFibonacciNumber(1));
    }

    @Test
    @DisplayName("Does return 12th Fibonacci number?")
    void doesReturnNthNumber() {
        Assertions.assertEquals(144, Fibonacci.getFibonacciNumber(12));
    }

    @Test
    @DisplayName("Does return 0?")
    void doesReturnZero() {
        Assertions.assertEquals(0, Fibonacci.getFibonacciNumber(0));
    }

    @Test
    @DisplayName("Does return 0 if negative?")
    void doesReturnZeroIfNegative() {
        Assertions.assertEquals(0, Fibonacci.getFibonacciNumber(-5));
    }
    @Test
    @DisplayName("Does return sequence?")
    void doesReturnFibonacciSequence() {
        ArrayList<Integer> sequenceToTest = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13));
        Assertions.assertArrayEquals(sequenceToTest.toArray(), Fibonacci.getFibonacciSequence(7).toArray());
    }
}
