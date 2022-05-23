package com.sparta.jh.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={29,34365,63,12,23,45,320,5};
        bubbleSort(arr);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //iterates over every item in the array and prints on same line with space in between
    }
    public static void bubbleSort(int[] arr) {
        int swap = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    swap = arr[j-1]; // swap variable becomes no. located a j-1
                    arr[j-1] = arr[j]; // j-1 becomes number located ahead of it
                    arr[j] = swap; // j becomes number that was located behind it (prev assigned to swap var)
                }
            }
        }
    }
}