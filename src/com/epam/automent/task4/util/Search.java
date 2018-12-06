package com.epam.automent.task4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Yevhen_Harnyi on 10/2/2018.
 */
public class Search {


    public static int searcher(Collection<Integer> list, int value) {
        int number = 0;
        //boolean result = false;
        for (int check : list) {
            if (check == value) {
                number++;
            }
        }
//        System.out.println(number);
        return number;
    }

    public static int searcher(Map<Integer, Integer> map, int value) {
        int result = 0;
       for (Integer numberSearch: map.values()) {
            if (numberSearch.equals(value)){
                result++;
            }
        }
        /*for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue().equals(value)){
                result++;
            }
        }*/

//        for (int v : sad) {
//            System.out.println(v + " collection");
//        }
//        for (int mapValue : map.values()) {
//            if (mapValue == value) {
//                return mapValue;
//            }
//        }


//        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
//        while (entries.hasNext()){
//            Map.Entry<Integer, Integer> entry = entries.next();
//            if (entry.getValue().equals(value)){
//                result++;
//            }
//        }

//        System.out.println(result);
        return result;
    }
}
