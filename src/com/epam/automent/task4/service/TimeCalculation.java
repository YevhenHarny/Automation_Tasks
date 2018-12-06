package com.epam.automent.task4.service;


import com.epam.automent.task4.util.Delete;
import com.epam.automent.task4.util.Search;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class TimeCalculation {
    private int length;
    private int value;

    public TimeCalculation(int length, int value) {
        this.length = length;
        this.value = value;
    }

    public int calculateTimefill(Collection<Integer> collection) {
        long startTime = System.currentTimeMillis();
        long endTime;


        Creator.fill(collection, length);
        endTime = System.currentTimeMillis();

        return (int) (endTime - startTime);
    }

    public int calculateTimefill(Map<Integer, Integer> map) {
        long startTime = System.currentTimeMillis();
        long endTime;


        Creator.fill(map, length);
        endTime = System.currentTimeMillis();

        return (int) (endTime - startTime);
    }

    public int calculateTimeSearch(Collection<Integer> collection) {
        int timeResult = 0;
        int searchResult;
        long startTime = System.currentTimeMillis();
        long endTime;
        searchResult = Search.searcher(collection, value);
        endTime = System.currentTimeMillis();
        if (searchResult > 0) {
            timeResult = (int) (endTime - startTime);
        }
        return timeResult;
    }

    public int calculateTimeSearch(Map<Integer, Integer> map) {
        int timeResult = 0;
        int searchResult;
        long startTime = System.currentTimeMillis();
        long endTime;
        searchResult = Search.searcher(map, value);
        endTime = System.currentTimeMillis();
        if (searchResult > 0) {
            timeResult = (int) (endTime - startTime);
        }
        return timeResult;
    }

    public int calculateTimeDelete(Collection<Integer> collection) {
        int timeResult = 0;
        int searchResult;
        long startTime = System.nanoTime();
        long endTime;
        searchResult = Delete.deleting(collection, value);
        endTime = System.nanoTime();
        if (searchResult > 0) {
            timeResult = (int) (endTime - startTime);
        }
        return timeResult;
    }

    public int calculateTimeDelete(Map<Integer, Integer> map) {
        int timeResult = 0;
        int searchResult;
        long startTime = System.currentTimeMillis();
        long endTime;
        searchResult = Delete.deleting(map, value);
        endTime = System.currentTimeMillis();
        if (searchResult > 0) {
            timeResult = (int) (endTime - startTime);
        }
        return timeResult;
    }
}