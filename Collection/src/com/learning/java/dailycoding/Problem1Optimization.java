package com.learning.java.dailycoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Problem1Optimization {

    HashSet<Integer> set = new HashSet<Integer>();

    public  boolean findPairforSum(Integer[] inputArr, int sumValue) {

        for (int i = 0; i < inputArr.length; i++) {

            int secondComponent = sumValue-inputArr[i];
            if (set.contains(secondComponent)){
                System.out.println(
                        "Pair with given sum "
                                + sumValue + " is (" + inputArr[i]
                                + ", " + secondComponent + ")");

                return true;
            }
                set.add(inputArr[i]);

        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 15, 3, 7};

        Problem1Optimization optimization = new Problem1Optimization();
        boolean result = optimization.findPairforSum(arr,17);
        System.out.println("result ::" +result);
    }

}
