package com.sparta.jh;
import java.awt.*;
import java.security.Key;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class mergeArray {
    // Function to merge arrays
    public static ArrayList<Integer> mergeArrays(int firstArray[], int secondArray[], int lengthOfArray1, int lengthOfArray2) {
        Map<Integer,Boolean> newMap = new TreeMap<Integer,Boolean>();

        // Inserting values to a map.
        for(int currentIndexInArray = 0; currentIndexInArray < lengthOfArray1; currentIndexInArray++) {
            newMap.put(firstArray[currentIndexInArray], true);
        } for(int i = 0;i < lengthOfArray2;i++) {
            newMap.put(secondArray[i], true);
        }
        ArrayList<Integer> mergedArray = new ArrayList<>(newMap.keySet());
        return mergedArray;
    }
       // return mergedArray;


    // Driver Code
    public static void main (String[] args)
    {
        int a[] = {}, b[] = {};
        int size = a.length;
        int size1 = b.length;

        // Function call
        System.out.println(mergeArrays(a, b, size, size1));
    }
}

