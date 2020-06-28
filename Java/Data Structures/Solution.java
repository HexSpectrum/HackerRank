/*
 * 
 * @author Hex
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY. The function accepts
     * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
     */
    // int lastAnswer = 0;
    // static int x = 0;
    // static List<Integer> arr = new ArrayList<>();

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        // Write your code here
        // x = queries.get(0).get(0); // [0,1,1]
        List<Integer> arr = new ArrayList<>();
        return arr;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String[] firstMultipleInput = input.nextLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = input.nextLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                System.out.println("\n");
            }
        }

    }
}
