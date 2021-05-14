package com.learning.java.dailycoding;

/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17. */

public class problem1 {

    public static boolean findPairforSum(Integer[] inputArr, int sumValue){

        for(int i = 0; i<inputArr.length;i++){
            for (int j = i+1; j<inputArr.length;j++){
                if (inputArr[i] + inputArr[j] == sumValue)
                    return true;

                }
            }
        return false;
        }

    public static void main(String[] args) {
        Integer[] arr = {10, 15, 3, 7};
        boolean result = findPairforSum(arr,20);
        System.out.println("result ::" +result);

    }

    }



