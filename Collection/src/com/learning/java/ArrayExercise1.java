package com.learning.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayExercise1 {

    public static int[] addElemnent(int n , int[] arr, int ele){


        int[] newArr = new  int[n+1];

        IntStream.range(0, n).forEach(i -> newArr[i] = arr[i]);

        newArr[n]  =ele;
        return newArr;

    }

    public static void main(String[] args)
    {
        int n = 5;
        int i;

        // Original array with size 5
        int myArray[] = { 1, 3, 5, 7, 9 };

        System.out.println("Original Array:\n"  + Arrays.toString(myArray));
        //new element to be added to array
        int ele = 11;

        myArray = addElemnent(n, myArray, ele);

        System.out.println("\nArray after adding " + ele + ":\n" + Arrays.toString(myArray));
    }
}
