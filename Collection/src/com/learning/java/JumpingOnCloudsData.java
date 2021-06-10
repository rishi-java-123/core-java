package com.learning.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JumpingOnCloudsData {


        public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }*/
            int n  =9;
            List ar = new ArrayList();
            ar.add(0);
            ar.add(0);
            ar.add(1);
            ar.add(0);
            ar.add(0);
            ar.add(1);
            ar.add(0);
            ar.add(0);
            ar.add(0);




            int result = Result.sockMerchant(n, ar);

            System.out.println(result);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        }
    }



