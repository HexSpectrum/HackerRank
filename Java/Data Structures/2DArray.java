
/*
@author Hex
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[][] coord = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 0 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
        List<Integer> hourglassValues = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int validCounter = 0;
                int total = 0;

                System.out.print(arr[i][j] + " ");

                for (int a = 0; a < coord.length; a++) {
                    if (i + coord[a][0] < 0 || i + coord[a][0] > arr.length - 1 || j + coord[a][1] < 0
                            || j + coord[a][1] > arr[0].length - 1) {
                        System.out.println("invalid");
                    } else {
                        System.out.println("Valid Counter" + validCounter + "Valid at coord (" + i + "," + j + ")"
                                + "Valid Coordinate: (" + (i + coord[a][0]) + "," + (j + coord[a][1]) + ")");
                        validCounter++; // this can change according to the number of coordinates tested. e.g.,
                                        // Hourglass = 6

                    }
                    if (validCounter == 6) {
                        System.out.println("Valid at coord (" + i + "," + j + ")");
                        // get the 6 hourglass coordinates put them inside an array
                        total = arr[i + coord[0][0]][j + coord[0][1]] + arr[i + coord[1][0]][j + coord[1][1]]
                                + arr[i + coord[2][0]][j + coord[2][1]] + arr[i + coord[3][0]][j + coord[3][1]]
                                + arr[i + coord[4][0]][j + coord[4][1]] + arr[i + coord[5][0]][j + coord[5][1]]
                                + arr[i + coord[6][0]][j + coord[6][1]];

                        System.out.println("total for coord (" + i + "," + j + ") = " + total);
                        hourglassValues.add(total);
                    }
                }
            }
            System.out.println();
        }

        int max = -10000000;
        for (int i : hourglassValues) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max is: " + max);
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        scanner.close();
    }
}
