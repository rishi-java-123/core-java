package com.learning.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayExercise3 {

    public static void main(String[] args)  {
        int[] oddArray = { 1, 3,5,7,9,11};     // define array of odd numbers

        System.out.println("Original Array: " + Arrays.toString(oddArray));   // Print the resultant array
        int index = 2;   // index at which element is to be removed
        System.out.println("Element to be removed at index: " + index);  // display index

        // function call removeArrayElement
        oddArray = removeArrayElement(oddArray, index);

        // Print the resultant array
        System.out.println("Array after deleting element: "  + Arrays.toString(oddArray));
    }

    private static int[] removeArrayElement(int[] oddArray, int index) {
        if(oddArray ==  null || index < 0 || index >= oddArray.length ){
            return oddArray;
        }
        return IntStream.range(0,oddArray.length).filter(i -> i != index).map(i -> oddArray[i]).toArray();

    }
}
