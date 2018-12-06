package com.epam.automent.task3.service;

import com.epam.automent.task3.entity.Plane;
import com.epam.automent.task3.utils.RangeCompare;

import java.util.List;

/**
 * Created by Yevhen_Harnyi on 9/10/2018.
 */
public class PlaneCompareService {
    public List<Plane> compare(List<Plane> sortList){
        sortList.sort(new RangeCompare());
        return sortList;
    }
}
