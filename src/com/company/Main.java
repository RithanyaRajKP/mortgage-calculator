package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    private int p;

    public static void main(String[] args) {
	// write your code here
        final byte year = 12;
        final byte percent = 100;
        int p=0;
        float s=0;
        byte years=0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Principal: ");
             p = scanner.nextInt();
            if (p>=1000 && p<=1_000_000)
                break;
            System.out.println("Enter a value btwn 1k n 1m");
            continue;
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
             s = scanner.nextFloat();
            if (s > 0 && s <= 30)
                break;
            System.out.println("Enter a value btwn 0 n 30");
            continue;
        }
        float r = s / year / percent;
        while (true){
            System.out.print("Period(Years): ");
             years = scanner.nextByte();
            if(years>0 && years<=30)
                break;
            System.out.println("Enter a value btwn 0 n 30");
            continue;

        }

        float rs = r + 1;
        int n = years * 12;
        double rate = Math.pow(rs, n);
        double mor = (r * rate) / (rate - 1);
        double mort = p * (double) mor;
        String result = NumberFormat.getCurrencyInstance().format(mort);
        System.out.println(result);
    }
}
