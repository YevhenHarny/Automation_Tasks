package com.epam.automent.task4;


import com.epam.automent.task4.service.TimeCalculation;

import java.util.*;

public class MainFour {

    public static void main(String[] args) {
        int value =  78545;
        int length = 100000;
        int resFirst;
        int resSecond;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();

        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> hashMap = new HashMap<>();

        TimeCalculation calc = new TimeCalculation(length,value);
        resFirst = calc.calculateTimefill(arrayList);
        resSecond = calc.calculateTimefill(linkedList);
        System.out.println("Creating time: ArrayList " + resFirst + " and LinkedList " + resSecond);
        resFirst = calc.calculateTimefill(treeSet);
        resSecond = calc.calculateTimefill(hashSet);
        System.out.println("Creating time: TreeSet " + resFirst + " and " + " HashSet " + resSecond);
        resFirst = calc.calculateTimefill(treeMap);
        resSecond = calc.calculateTimefill(hashMap);
        System.out.println("Creating time: TreeMap " + resFirst + " and HashMap " + resSecond);
        resFirst = calc.calculateTimeSearch(arrayList);
        resSecond = calc.calculateTimeSearch(linkedList);
        System.out.println("Searching time: ArrayList " + resFirst + " and LinkedList " + resSecond);
        resFirst= calc.calculateTimeSearch(treeSet);
        resSecond = calc.calculateTimeSearch(hashSet);
        System.out.println("Searching time TreeSat " + resFirst + " HashSet " + resSecond);
        resFirst = calc.calculateTimeSearch(treeMap);
        resSecond = calc.calculateTimeSearch(hashMap);
        System.out.println("Searching time TreeMap " + resFirst + " HashMap " + resSecond);
        resFirst = calc.calculateTimeDelete(arrayList);
        resSecond= calc.calculateTimeDelete(linkedList);
        System.out.println("Deleting time: ArrayList " + resFirst + " and LinkedList " + resSecond);
        resFirst = calc.calculateTimeDelete(treeSet);
        resSecond = calc.calculateTimeDelete(hashSet);
        System.out.println("Deleting time: TreeSet " + resFirst + " and HashSet " + resSecond);
        resFirst = calc.calculateTimeDelete(treeMap);
        resSecond = calc.calculateTimeDelete(hashMap);
        System.out.println("Deleting time: TreeMap " + resFirst + " and HashMap " + resSecond);
    }

}
