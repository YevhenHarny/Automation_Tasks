package com.epam.automent.task2.utils;


public class Calculation {

    public int[][] ArrCalc(int[][] arr1, int[][] arr2) {
        int[][] resultArr = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int value =0; value < arr1.length; value++) {
                    resultArr[i][j] = resultArr[i][j] + arr1[i][value]*arr2[value][j];
                }

            }
        }
        return resultArr;
    }
}