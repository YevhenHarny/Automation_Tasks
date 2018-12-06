package com.epam.automent.task3.service;

import java.util.Scanner;


public class ScannerService {
    private static Scanner scanner = new Scanner(System.in);

    public static int scanIntValue (String message){

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(message);
        }
        return scanner.nextInt();
    }


}
