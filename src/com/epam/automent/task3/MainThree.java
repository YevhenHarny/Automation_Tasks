package com.epam.automent.task3;

import com.epam.automent.task3.entity.AirCompany;
import com.epam.automent.task3.entity.PassengersPlane;
import com.epam.automent.task3.entity.Plane;
import com.epam.automent.task3.entity.TransportPlane;
import com.epam.automent.task3.service.*;
import com.epam.automent.task3.utils.Calculation;

import java.util.ArrayList;
import java.util.List;



public class MainThree {
    static int capacitySum;
    static int seatsAmount;

    public static void main(String[] args) {

        PlaneSearcherService toSearch = new PlaneSearcherService();
        Calculation calc = new Calculation();
        AirCompany myAirCompany = new AirCompany();
        PlaneCompareService comparator = new PlaneCompareService();
        List<Plane> sortResult = new ArrayList<>();




        List<TransportPlane> transPlaneList = new ArrayList<>();
        List<PassengersPlane> passPlaneList = new ArrayList<>();

        transPlaneList.add(new TransportPlane("Airbus A400 ", 6400, 37000));
        transPlaneList.add(new TransportPlane("C 130 ", 3800, 27000));
        transPlaneList.add(new TransportPlane("AN 70 ", 6000, 47000));
        passPlaneList.add(new PassengersPlane("Boeing 747 ", 9800, 452));
        passPlaneList.add(new PassengersPlane("Airbus A380", 15200, 525));
        passPlaneList.add(new PassengersPlane("Concorde ", 6470, 100));

        myAirCompany.add(transPlaneList);
        myAirCompany.add(passPlaneList);
        List<Plane> lists = myAirCompany.getAirCompLst();

        print(new PrintList(), lists);
        seatsAmount = calc.seatsCalc(passPlaneList);
        capacitySum = calc.capacityCalc(transPlaneList);
        print(new PrintList(), capacitySum, seatsAmount);
        sortResult = comparator.compare(lists);
        print(new PrintList(), sortResult);
        AirCompany filteredPlane = toSearch.searchByType(transPlaneList,passPlaneList,lists);
        List<Plane> searchResultList = filteredPlane.getAirCompLst();
        print(new PrintList(), searchResultList);

    }

    public static void print(Printer toPrintLst, List<Plane> lists) {
        toPrintLst.print(lists);
    }

    public static void print(Printer toPrintValue, int capacitySum, int seatsAmount) {
        toPrintValue.printValue(capacitySum, seatsAmount);
    }

}



