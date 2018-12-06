package com.epam.automent.task1.services;

import java.util.Scanner;

/**
 * Created by Yevhen_Harnyi on 8/14/2018.
 */
public class InOut {
    public double inOutValue(){
        double value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        while (!sc.hasNextDouble()){
            sc.next();
            System.out.println("Please enter number");
        }
        value = sc.nextDouble();
        return value;
    }

    public String inOutAction() {
        String act;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter needed action");
        while (!sc.hasNextLine()){
            sc.next();
        System.out.println("Please enter action");
    }
        act = sc.nextLine();
        return act;
    }

    public void showResult(double res){
        System.out.println("Your result is " + res);
    }
}
