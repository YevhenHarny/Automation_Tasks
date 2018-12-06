package com.epam.automent.task2.utils;

import com.epam.automent.task2.services.InOut;

import java.util.Random;

public class MatrixCreator {

    Random rand = new Random();
    InOut getSize = new InOut();
    int[][] arr;
    private int row;
    private  int column;

    public int[][] creator() {
        row = getSize.getRow();
        column = getSize.getColumn();
        int[][] emptyArr = new int[row][column];
        return emptyArr;
    }

    public int[][] creatorWithRow(int length) {
        row = length;
        column = getSize.getColumn();
        int[][] emptyArr2 = new int[row][column];
        return emptyArr2;
    }

    public int[][] arrGenerator(int[][] emptyArr){
        arr = emptyArr;
        for (int i = 0; i< arr.length;i++){
            for (int j = 0;j<arr[0].length ; j++) {
                arr[i][j] = rand.nextInt(10);
                //arr[i][j] = (int) (Math.random()*100);
            }
        }
        return arr;
    }
}
