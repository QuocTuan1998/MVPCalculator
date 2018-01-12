package com.example.admin.mvpcalculator.logic;

import com.example.admin.mvpcalculator.View.ViewSub;
import com.example.admin.mvpcalculator.View.ViewSum;
import com.example.admin.mvpcalculator.funcInterface.FuncSub;

/**
 * Created by Quoc Tuan on 1/11/2018.
 */

public class LogicSub implements FuncSub {

    ViewSub sub;

    public LogicSub(ViewSub rs){
        this.sub = rs;
    }


    @Override
    public void handleSub(double a, double b) {
        double rs = a - b;
        sub.returnSub(rs);
    }
}
