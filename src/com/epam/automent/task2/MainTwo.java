package com.epam.automent.task2;

import com.epam.automent.task2.services.InOut;
import com.epam.automent.task2.utils.Calculation;
import com.epam.automent.task2.utils.MatrixCreator;

import java.util.Scanner;


public class MainTwo {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arrOne;
        int[][] arrTwo;
        int[][] arrResult;
        String variant;

        Calculation arrCalc = new Calculation();
        InOut scanValue = new InOut();
        MatrixCreator getMatrix = new MatrixCreator();
        arrOne = getMatrix.creator();
        arrTwo = getMatrix.creatorWithRow(arrOne[0].length);
        System.out.println("Please choose one of the variant:" + "\n" +
                "1. Generate matrix by random " + "\n" +
                "2. Type matrix manually ");
        while (!sc.hasNextLine()) {
            sc.next();
            System.out.println("Please enter amount of column");
        }
        variant = sc.nextLine();
        switch (variant){
            case "1":
                arrOne = getMatrix.arrGenerator(arrOne);
                arrTwo = getMatrix.arrGenerator(arrTwo);
                break;
            case "2":
                arrOne = scanValue.fillArr(arrOne);
                arrTwo = scanValue.fillArr(arrTwo);
                break;
        }
        scanValue.printArray(arrOne);
        scanValue.printArray(arrTwo);
        arrResult = arrCalc.ArrCalc(arrOne,arrTwo);
        scanValue.printArray(arrResult);
    }
}
