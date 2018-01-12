package com.example.admin.mvpcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.mvpcalculator.View.ViewDiv;
import com.example.admin.mvpcalculator.View.ViewMulti;
import com.example.admin.mvpcalculator.View.ViewSub;
import com.example.admin.mvpcalculator.View.ViewSum;
import com.example.admin.mvpcalculator.logic.LogicDiv;
import com.example.admin.mvpcalculator.logic.LogicMulti;
import com.example.admin.mvpcalculator.logic.LogicSub;
import com.example.admin.mvpcalculator.logic.LogicSum;

public class MainActivity extends AppCompatActivity
        implements ViewSum, ViewSub, ViewMulti, ViewDiv, View.OnClickListener{
    EditText edA, edB;
    Button btnSum, btnSub, btnDiv, btnMul;

    LogicDiv logicDiv;
    LogicSum logicSum;
    LogicMulti logicMulti;
    LogicSub logicSub;

    double resultSum, resultSub, resultDiv, resultMulti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edA = findViewById(R.id.edA);
        edB = findViewById(R.id.edB);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnSub = findViewById(R.id.btnSub);
        btnSum = findViewById(R.id.btnSum);

        logicDiv = new LogicDiv(this);
        logicSub = new LogicSub(this);
        logicMulti = new LogicMulti(this);
        logicSum = new LogicSum(this);

        btnSum.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        double a = Double.parseDouble(edA.getText().toString());
        double b = Double.parseDouble(edB.getText().toString());

        int id = view.getId();
        if (R.id.btnSum == id){
            logicSum.handleSum(a,b);
        }else if (R.id.btnSub == id){
            logicSub.handleSub(a,b);
        }else if (R.id.btnMul == id){
            logicMulti.handleMulti(a,b);
        }else if (R.id.btnDiv == id){
            logicDiv.handleDiv(a,b);
        }

    }


    @Override
    public void returnDiv(double div) {
        Toast.makeText(this, "div = " +div, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void returnSum(double sum) {
        Toast.makeText(this, "sum = " + sum, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void returnMulti(double multi) {
        Toast.makeText(this, "multi = " + multi, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void returnSub(double sub) {
        Toast.makeText(this, "sub = " + sub, Toast.LENGTH_SHORT).show();
    }
}
