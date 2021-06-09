package com.learning.java;



    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    class Result {

        /*
         * Complete the 'sockMerchant' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY ar
         */

        public static int sockMerchant(int n, List<Integer> ar) {
            // Write your code here
            Map<Integer,Integer> counter = new HashMap<Integer,Integer>();
            int pairs =0;
            for (int i = 0; i<n;i++)
            {
                if (counter.containsKey(ar.get(i))){
                    int count = counter.get(ar.get(i));
                    counter.put(ar.get(i),++count);
                }
                else{
                    counter.put(ar.get(i),1);
                }
            }
            for(int i : counter.values()){
                pairs=pairs+(i/2);
            }
            return pairs;
        }

    }

