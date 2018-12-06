package com.epam.automent.task3.utils;

import com.epam.automent.task3.entity.PassengersPlane;
import com.epam.automent.task3.entity.TransportPlane;

import java.util.List;

public class Calculation {
    private int capacitySum;
    private int seatsAmountSum;

        public int capacityCalc (List <TransportPlane> list) {
            for (TransportPlane aList : list) {
                capacitySum = capacitySum + aList.getCapacity();
            }
            return capacitySum;
        }


    public int seatsCalc (List<PassengersPlane> list){
        for (int i = 0; i <list.size() ; i++) {
            seatsAmountSum = seatsAmountSum + list.get(i).getSeatsAmount();
        }
        return seatsAmountSum;
    }

    public int getCapacitySum() {
        return capacitySum;
    }

    public int getSeatsAmountSum() {
        return seatsAmountSum;
    }

}
