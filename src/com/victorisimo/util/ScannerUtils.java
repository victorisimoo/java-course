package com.victorisimo.util;

import java.util.Scanner;

public class ScannerUtils {

    public static Scanner scanner = new Scanner(System.in);

    public static String readStringInput(String text) {
        System.out.print(text + ": ");
        return scanner.nextLine();
    }

    public static int readIntInput(String text) {
        System.out.println(text + ": ");
        int data = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        return data;
    }

    public static double readDoubleInput(String text) {
        System.out.println(text + ": ");
        double data = scanner.nextDouble();
        scanner.nextLine(); // Clear the buffer
        return data;
    }
}
