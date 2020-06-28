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

public class Solution {
    public static void main(String[] args) throws IOException {
        Result obj = new Result();

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
        List<Integer> result = obj.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                System.out.println("\n");
            }
        }
    }
}

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY. The function accepts
     * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
     */
    static int lastAnswer = 0;
    static int index = 0;
    static int index2 = 0;
    static int element = 0;
    static int x = 0;
    static List<Integer> arr = new ArrayList<>();

    static List<Integer> s0 = new ArrayList<>();
    static List<Integer> s1 = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> seqList = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        ArrayList<Integer>[] seqList = new ArrayList[n];

        for (int j = 0; j < n; j++) {
            seqList[j] = new ArrayList<>();
        }

        for (int i = 0; i < queries.size(); i++) {
            x = queries.get(i).get(1);
            ArrayList<Integer> sequence = seqList[index];
            if (queries.get(i).get(0) == 1) { // query 1 or 2
                // getting x value of the query
                index = ((x ^ lastAnswer) % n); // find the index
                sequence.add(queries.get(i)(2));
                // seq = seqList.get(index); // find the sequenceat that index

            } else if (queries.get(i).get(0) == 2) {
                // queries.get(0).get(0) == 2
                // when == 2 we dont add anything to the sequences

                index2 = ((x ^ lastAnswer) % n); // get the index
                int yValue = queries.get(i).get(2);

                // seq = seqList.get(index); // find the seq with that index
                System.out.println("SIZE OF index " + index2 + " " + seqList.get(index2).size());
                element = yValue % seqList.get(index2).size();
                lastAnswer = seqList.get(index2).get(element);
                System.out.println(
                        "INDEX: " + index2 + " X: " + x + "LAST ANSWER:  " + lastAnswer + "ELEMENT: " + element);
                System.out.println("last answer: " + lastAnswer);
                arr.add(lastAnswer);
            }
        }
        return arr;
    }
