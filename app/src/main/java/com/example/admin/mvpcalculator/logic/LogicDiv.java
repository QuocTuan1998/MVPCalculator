package com.example.admin.mvpcalculator.logic;

import com.example.admin.mvpcalculator.View.ViewDiv;
import com.example.admin.mvpcalculator.View.ViewSum;
import com.example.admin.mvpcalculator.funcInterface.FuncDiv;

/**
 * Created by Quoc Tuan on 1/11/2018.
 */

public class LogicDiv implements FuncDiv{

    ViewDiv div;

    public LogicDiv(ViewDiv div){
        this.div = div;
    }

    @Override
    public void handleDiv(double a, double b) {
        double rs = a / b;
        div.returnDiv(rs);
    }
}
