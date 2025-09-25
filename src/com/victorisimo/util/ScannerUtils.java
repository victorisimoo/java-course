package com.victorisimo.util;

import java.util.Scanner;

public class ScannerUtils {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String readStringInput(String text) {
        System.out.print(text + ": ");
        return SCANNER.nextLine();
    }

    public static int readIntInput(String text) {
        System.out.println(text + ": ");
        int data = SCANNER.nextInt();
        SCANNER.nextLine(); // Clear the buffer
        return data;
    }

    public static double readDoubleInput(String text) {
        System.out.println(text + ": ");
        double data = SCANNER.nextDouble();
        SCANNER.nextLine(); // Clear the buffer
        return data;
    }
}
