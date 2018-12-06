package com.epam.automent.task4.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Creator {

    public static void fill(Collection<Integer> list, int length) {
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
    }

    public static void fill(Map<Integer, Integer> map, int length) {
        int value;
        int key;
        for (value = 0, key = 0; value < length; value++, key++) {
            map.put(key, value);
        }
    }
}
