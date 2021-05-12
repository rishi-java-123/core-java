package com.learning.java;

import java.util.Arrays;

public class ArrayExercise2 {

    public static void main(String[] args){
        Integer[] odd_Array = { 1,3,7,9,11 };
        System.out.println("Original Array:" + Arrays.toString(odd_Array));

        int val = 5;
        int index = 2;
        Integer[] destArray = new Integer [odd_Array.length+1];
        int j = 0;

        for (int i = 0; i < destArray.length;i++){
            if(i == index ){
                destArray[i]=val;
            }else{
                destArray[i]=odd_Array[j] ;
                j++;
            }

        }
        System.out.println("\nArray after adding element " + val + " at index " + index +":"
                + Arrays.toString(destArray));
    }
}
