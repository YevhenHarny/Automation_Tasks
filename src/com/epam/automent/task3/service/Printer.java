package com.epam.automent.task3.service;


import com.epam.automent.task3.entity.Plane;

import java.util.List;


public interface Printer {
    void print(List<Plane> unit);
    void printValue(int Value, int Value2);
}
