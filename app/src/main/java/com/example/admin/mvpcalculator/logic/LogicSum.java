package com.example.admin.mvpcalculator.logic;

import com.example.admin.mvpcalculator.View.ViewSum;
import com.example.admin.mvpcalculator.funcInterface.FuncSum;

/**
 * Created by Quoc Tuan on 1/11/2018.
 */

public class LogicSum implements FuncSum {

    ViewSum sum;

    public LogicSum(ViewSum rs){
        this.sum = rs;
    }


    @Override
    public void handleSum(double a, double b) {
        double rs = a + b;
        sum.returnSum(rs);
    }
}
