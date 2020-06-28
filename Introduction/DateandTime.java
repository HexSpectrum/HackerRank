/*
 * @author Hex
 * 
 * The Calendar class is an abstract class that provides methods for converting
 * between a specific instant in time and a set of calendar fields such as YEAR,
 * MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar
 * fields, such as getting the date of the next week.
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
     */
    private static int dayNum = 0;

    public static String findDay(int month, int day, int year) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);

        dayNum = myCalendar.get(Calendar.DAY_OF_WEEK);
        switch (dayNum) {
            case 1:
                return "SUNDAY";

            case 2:
                return "MONDAY";

            case 3:
                return "TUESDAY";

            case 4:
                return "WEDNESDAY";

            case 5:
                return "THURSDAY";

            case 6:
                return "FRIDAY";

            case 7:
                return "SATURDAY";

        }
        return "";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
