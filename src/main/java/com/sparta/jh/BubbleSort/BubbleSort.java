package com.sparta.jh.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] ={29,34365,63,12,23,45,320,5};
        bubbleSort(array);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        //iterates over every item in the array and prints on same line with space in between
    }
    public static void bubbleSort(int[] array) {
        int swap = 0;
        for(int i=0; i < array.length; i++){
            for(int x=1; x < (array.length-i); x++){
                if(array[x-1] > array[x]){
                    swap = array[x-1]; // swap variable becomes no. located a x// -1
                    array[x-1] = array[x]; // x-1 becomes number located ahead of it
                    array[x] = swap; // x becomes number that was located behind it (prev assigned to swap var)
                }
            }
        }
    }
}