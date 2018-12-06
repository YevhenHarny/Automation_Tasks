package com.epam.automent.task3.utils;

import com.epam.automent.task3.entity.Plane;

import java.util.Comparator;

public class RangeCompare implements Comparator<Plane>{

    @Override
    public int compare(Plane o1, Plane o2) {
        int range1 = o1.getRange();
        int range2 = o2.getRange();
        if (range1< range2){
            return -1;
        } else if (range1 == range2) {
            return 0;
        } else {
            return 1;
        }
    }
}
