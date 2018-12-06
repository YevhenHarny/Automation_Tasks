package com.epam.automent.task1;

import com.epam.automent.task1.services.Calculation;
import com.epam.automent.task1.services.InOut;

/**
 * Created by Yevhen_Harnyi on 8/9/2018.
 */
class MainOne {
    public static void main (String[]args){
        String action;
        double first_number = 0;
        double second_number = 0;
        double result = 0;

        InOut get = new InOut();
        first_number = get.inOutValue();
        second_number = get.inOutValue();
        action = get.inOutAction();
        Calculation calc = new Calculation();
        result = calc.calcResult(first_number,second_number,action);
        get.showResult(result);

    }
}
