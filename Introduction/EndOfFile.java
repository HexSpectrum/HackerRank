/*
Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.
*/


import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        String phrase = "";
        while(input.hasNext()){
            phrase = input.nextLine();
            System.out.println(counter++ + " " + phrase);
        }
        
    }
}
