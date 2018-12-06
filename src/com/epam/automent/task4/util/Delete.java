package com.epam.automent.task4.util;


import java.util.Collection;
import java.util.Map;

public class Delete {

    public static int deleting(Collection<Integer> collection, int value) {
        int number = 1;
        //boolean result = false;
        collection.remove(value);
//        for (int check : collection) {
//            if (check == value) {
//                number--;
//            }
//        }
//        System.out.println(number);
        return number;
    }

    public static int deleting(Map<Integer, Integer> map, int value) {
        int result = 1;
        map.values().remove(value);
//        for (Integer numberSearch : map.values()) {
//            if (numberSearch.equals(value)) {
//                map.values().remove(numberSearch);
//                result--;
//            }
//        }
        return result;
    }
}
