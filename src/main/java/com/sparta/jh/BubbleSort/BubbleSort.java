package com.sparta.jh.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {-6, -6, -5, -5, -23, -45, -320, -73};
        bubbleSort(array);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for (int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
        //iterates over every item in the array and prints on same line with space in between


    public static int[] bubbleSort(int[] array) {
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
        return array;
    }
}
