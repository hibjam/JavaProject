package com.sparta.jh.mergeArrat;

import com.sparta.jh.mergeArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mergeArrayTest {

    @Test
    @DisplayName("Method returns an array")
    void doesReturnArray() {
        int[] array1 = {1};
        int[] array2 = {2};
        int l1 = array1.length;
        int l2 = array2.length;
        Integer[] merged = {1, 2};
        Assertions.assertArrayEquals(merged, mergeArray.mergeArrays(array1, array2, l1, l2).toArray());
    }

    // Method does not need to worry about null values as uses primitive datatypes
    @Test
    @DisplayName("Able to take two sorted arrays and return one large sorted array")
    void doesReturnSortedArray() {
        int[] array1 = {2, 4, 6, 8, 10}, array2 = {1, 3, 5, 7, 9};
        int l1 = array1.length;
        int l2 = array2.length;
        Integer[] merged = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(merged, mergeArray.mergeArrays(array1, array2, l1, l2).toArray());
    }

    @Test
    @DisplayName("Able to have negative numbers and the number 0 as an input")
    void canSortNegativesAndZero() {
        int[] array1 = {-4, -2, 0, 2, 4}, array2 = {-5, -3, -1, 1, 3};
        int l1 = array1.length;
        int l2 = array2.length;
        Integer[] merged = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4};
        Assertions.assertArrayEquals(merged, mergeArray.mergeArrays(array1, array2, l1, l2).toArray());
    }

    @Test
    @DisplayName("Check no error if one or more of the Arrays is empty")
    void emptyArray() {
        int array1[] = {}, array2[] = {};
        int l1 = array1.length;
        int l2 = array2.length;
        Integer[] merged = {};
        Assertions.assertArrayEquals(merged, mergeArray.mergeArrays(array1, array2, l1, l2).toArray());
    }

    @Test
    @DisplayName("Check no error if one or more of the Arrays is empty")
    void oneEmptyArray() {
        int array1[] = {}, array2[] = {2};
        int l1 = array1.length;
        int l2 = array2.length;
        Integer[] merged = {2};
        Assertions.assertArrayEquals(merged, mergeArray.mergeArrays(array1, array2, l1, l2).toArray());


    }
}

