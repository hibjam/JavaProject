package com.sparta.jh.BubbleSort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("Check returns number")
    void bubbleSortNumber() {
        int sortedArray[] = {5};
        int array[] = {5};
        assertArrayEquals(sortedArray, BubbleSort.bubbleSort(array));
    }


    @Test
    @DisplayName("Check Sorts numbers")
    void bubbleSortReturn() {
        int sortedArray[] = {5, 12, 23, 29, 45, 63, 320, 34365};
        int array[] = {29, 34365, 63, 12, 23, 45, 320, 5};
        assertArrayEquals(sortedArray, BubbleSort.bubbleSort(array));
    }
    @Test
    @DisplayName("Check Sorts negative numbers!")
    void bubbleSortNegative(){
        int sortedArray[] = {-320, -73, -45, -23, -19, -6, -5, 42};
        int unSortedArray[] = {-320, -19, -6, -5, 42, -73, -45, -23,};
        assertArrayEquals(sortedArray, BubbleSort.bubbleSort(unSortedArray));
    }
}