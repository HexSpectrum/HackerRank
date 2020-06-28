/*
 * @author Hex
 * 
 * Given a double-precision number, , denoting an amount of money, use the
 * NumberFormat class' getCurrencyInstance method to convert into the US,
 * Indian, Chinese, and French currency formats. Then print the formatted values
 * as follows: US: formattedPayment India: formattedPayment China:
 * formattedPayment France: formattedPayment
 */

import java.util.*;

import java.text.*;

public class Solution {

    public static void main(String[] args) {
        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Locale india2 = new Locale("en", "in");
        NumberFormat in = NumberFormat.getCurrencyInstance(india2);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        String us = usa.format(payment);
        String india = in.format(payment);
        String china = chi.format(payment);
        String france = fr.format(payment);

        scanner.close();

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}