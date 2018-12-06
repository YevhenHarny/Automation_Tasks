package com.epam.automent.task3.service;

import com.epam.automent.task3.entity.AirCompany;
import com.epam.automent.task3.entity.PassengersPlane;
import com.epam.automent.task3.entity.Plane;
import com.epam.automent.task3.entity.TransportPlane;
import com.epam.automent.task3.utils.Searcher;

import java.util.ArrayList;
import java.util.List;


public class PlaneSearcherService {

    AirCompany searchRes = new AirCompany();
    Searcher searchMod = new Searcher();

    public AirCompany searchByType(List<TransportPlane> transportPlaneList, List<PassengersPlane> passengersPlaneList, List<Plane> commonPlaneList) {
        String optionMessages = "Please choose one of the searching variant:\n"
                + "1. By Range\n"
                + "2. By Capacity\n"
                + "3. By Seats Amount\n"
                + "4. By Range and Capacity\n"
                + "5. By Range and Seats Amount";
        System.out.println(optionMessages);

        blackLabel:
        while (true)
            switch (getVariant()) {
                case 1:
                    searchRes.add(searchMod.searcherByRange(commonPlaneList));
                    break blackLabel;
                case 2:
                    searchRes.add(searchMod.searcherByCapacity(transportPlaneList));
                    break blackLabel;
                case 3:
                    searchRes.add(searchMod.searcherBySeats(passengersPlaneList));
                    break blackLabel;
                case 4:
                    searchRes.add(searchMod.searchByCapacityAndRange(transportPlaneList));
                    break blackLabel;
                case 5:
                    searchRes.add(searchMod.searcherBySeatsAndRange(passengersPlaneList));
                    break blackLabel;
                default:
                    System.out.println(optionMessages);
            }
        return searchRes;

    }

    private int getVariant (){
        return ScannerService.scanIntValue("Please choose one of the options");
    }
}
