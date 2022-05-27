package com.sparta.jh.Fibonacci;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(12));
        System.out.println(getFibonacciSequence(7));
    }

    public static Integer getFibonacciNumber(Integer fibonacciNumber) {
        if (fibonacciNumber < 0) {
            return 0;
        } else if (fibonacciNumber == 0 || fibonacciNumber == 1) {
            return fibonacciNumber;
        } else {
            return getFibonacciNumber(fibonacciNumber - 1)
                    + getFibonacciNumber(fibonacciNumber - 2);
        }
    }
    public static ArrayList<Integer> getFibonacciSequence(Integer fibonacciNumber) {
            ArrayList<Integer> sequenceOfFibonacciNumbers = new ArrayList<>();
            for (int i = 1; i <= fibonacciNumber; i++){
                sequenceOfFibonacciNumbers.add(getFibonacciNumber(i));
            }
            return sequenceOfFibonacciNumbers;
        }
}


