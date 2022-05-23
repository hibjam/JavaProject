package com.sparta.jh.BubbleSort;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args){
        int[] arr = {63,29,63,34365,23,45,320,5,546,59,74};

        for(int i=0; i < arr.length; i++) {
            for(int x=0; x <arr.length -1; x++){
                if (arr[x] > (arr[x + 1])) {
                    arr[x] = (arr[x] + arr[x+1]) - (arr[x+1] = arr[x]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
