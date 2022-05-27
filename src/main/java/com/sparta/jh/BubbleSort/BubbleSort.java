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
        int largerNum = 0;
        for(int i=0; i < array.length; i++){
            for(int index=1; index < (array.length-i); index++){
                if(array[index-1] > array[index]){
                    largerNum = array[index-1]; // swap variable becomes no. located a x// -1
                    array[index-1] = array[index]; // x-1 becomes number located ahead of it
                    array[index] = largerNum; // x becomes number that was located behind it (prev assigned to swap var)
                }
            }
        }
        return array;
    }
}
