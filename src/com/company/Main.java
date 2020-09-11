package com.company;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final byte year = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        Integer p = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        Float s = scanner.nextFloat();
        Float r = s / year / percent;
        System.out.print("Period(Years): ");
        Integer years = scanner.nextInt();
        Float rs = r + 1;
        Integer n = years * 12;
        Double rate = Math.pow(rs, n);
        Double mor = (r * rate) / (rate - 1);
        Double mort = p * (Double) mor;
        String result = NumberFormat.getCurrencyInstance().format(mort);
        System.out.println(result);


    }
}