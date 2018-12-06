package com.epam.automent.task1.services;


public class Calculation {

    private double value = 0;

    public double calcResult (double number1, double number2, String action){
         switch (action){
             case "+":
                 value = number1 + number2;
                 break;
             case "-":
                 value = number1 + number2;
                 break;
             case "*":
                 value = number1 * number2;
                 break;
             case "/":
                 value = number1 / number2;
                 break;
         }
        return value;
    }
}
