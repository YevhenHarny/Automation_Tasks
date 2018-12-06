package com.epam.automent.task3.utils;


import com.epam.automent.task3.entity.PassengersPlane;
import com.epam.automent.task3.entity.Plane;
import com.epam.automent.task3.entity.TransportPlane;
import com.epam.automent.task3.service.ScannerService;

import java.util.ArrayList;
import java.util.List;

public class Searcher {



    public List<Plane> searcherByRange(List<Plane> planesList) {
        int value;
        List<Plane> searchResultPlane = new ArrayList<>();
        System.out.println("Please enter range that you want to find");
        value = ScannerService.scanIntValue("Please type range");
        for (Plane plane : planesList) {
            if (plane.getRange() == value) {
                searchResultPlane.add(plane);
            }
        }
        return searchResultPlane;
    }

    public List<TransportPlane> searcherByCapacity(List<TransportPlane> planeList) {
        int value;
        System.out.println("Please type Capacity");
        value = ScannerService.scanIntValue("Please type Capacity");
        List<TransportPlane> searchResult = new ArrayList<>();
        for (TransportPlane plane: planeList){
            if (plane.getCapacity() == value){
                searchResult.add(plane);
            }
        }
        return searchResult;
    }

    public List<PassengersPlane> searcherBySeats (List<PassengersPlane> planeList){
        int value;
        System.out.println("Please type Seats amount");
        value = ScannerService.scanIntValue("Please type Seats amount");
        List<PassengersPlane> searchResult = new ArrayList<>();
        for (PassengersPlane plane: planeList){
            if(plane.getSeatsAmount() == value){
                searchResult.add(plane);
            }
        }
        return searchResult;
    }

    public List<TransportPlane> searchByCapacityAndRange (List<TransportPlane> planeList) {
        int valueRange;
        int valueCapacity;
        System.out.println("Please type Range");
        valueRange = ScannerService.scanIntValue("Please type Range");
        System.out.println("Please type Capacity");
        valueCapacity = ScannerService.scanIntValue("Please type Capacity");
        List<TransportPlane> searchResult = new ArrayList<>();
        for (TransportPlane plane: planeList){
            if (plane.getRange() == valueRange && plane.getCapacity() == valueCapacity){
                searchResult.add(plane);
            }
        }
        return searchResult;
    }

    public List<PassengersPlane> searcherBySeatsAndRange (List<PassengersPlane> planeList){
        int valueRange;
        int valueSeats;
        System.out.println("Please type Range");
        valueRange = ScannerService.scanIntValue("Please type Range");
        System.out.println("Please type Seats amount");
        valueSeats = ScannerService.scanIntValue("Please type Seats amount");
        List<PassengersPlane> searchResult = new ArrayList<>();
        for (PassengersPlane plane: planeList){
            if(plane.getRange() == valueRange && plane.getSeatsAmount() == valueSeats){
                searchResult.add(plane);
            }
        }
        return searchResult;
    }
}
