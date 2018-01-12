package com.example.admin.mvpcalculator.logic;

import com.example.admin.mvpcalculator.View.ViewMulti;
import com.example.admin.mvpcalculator.View.ViewSum;
import com.example.admin.mvpcalculator.funcInterface.FuncMulti;

/**
 * Created by Quoc Tuan on 1/11/2018.
 */

public class LogicMulti implements FuncMulti {

    ViewMulti multi;

    public LogicMulti(ViewMulti rs){
        this.multi = rs;
    }


    @Override
    public void handleMulti(double a, double b) {
        double rs = a * b;
        multi.returnMulti(rs);
    }
}
