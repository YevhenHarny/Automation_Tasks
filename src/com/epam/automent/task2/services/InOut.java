package com.epam.automent.task2.services;

import java.util.Scanner;

/**
 * Created by Yevhen_Harnyi on 8/22/2018.
 */
public class InOut {
    private Scanner sc = new Scanner(System.in);
    private int[][] arr;

    public int getRow() {
        int rowAmount = 0;
        //Scanner sc = new Scanner(System.in);
        System.out.println("Please type size of the row in you matrix");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Please enter amount of the row");
        }
        rowAmount = sc.nextInt();
        return rowAmount;
    }

    public int getColumn() {
        int columnAmount = 0;
        //Scanner sc = new Scanner(System.in);
        System.out.println("Please type amount of column");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Please enter amount of column");
        }
        columnAmount = sc.nextInt();
        return columnAmount;
    }

    public int[][] fillArr(int[][] emptyArr) {
        arr = emptyArr;
        System.out.println("Please type first element of your matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                while (!sc.hasNextInt()) {
                    sc.next();
                    System.out.println("Please enter amount of column");
                }
                arr[i][j] = sc.nextInt();
                System.out.println("Please type next element of your matrix");
            }
        }
        return arr;
    }

    public void printArray(int[][] arrPrint) {
        System.out.println("Here is your Matrix: ");
        for (int i = 0; i < arrPrint.length; i++) {
            for (int j = 0; j < arrPrint[0].length; j++) {
                System.out.print(arrPrint[i][j] + "\t");
            }
            System.out.println();
        }
    }
}