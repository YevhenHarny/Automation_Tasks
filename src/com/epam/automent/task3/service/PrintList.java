package com.epam.automent.task3.service;

import com.epam.automent.task3.entity.Plane;

import java.util.List;


public class PrintList implements Printer {
    @Override
    public void print(List<Plane> unit) {
        System.out.println("Here is your Air Company: ");
        for (Plane plainList: unit) {
            plainList.printInfo();
        }
    }

    @Override
    public void printValue(int capacityValue, int seatsAmount) {
        System.out.println("Capacity of the company is " + capacityValue + "\n" + "Seats amount of the company is " + seatsAmount);
    }
}
