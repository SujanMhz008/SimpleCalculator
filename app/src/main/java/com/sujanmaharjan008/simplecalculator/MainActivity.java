package com.sujanmaharjan008.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sujanmaharjan008.simplecalculator.Functions.Calculations;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView edtNumber;
    private Button btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0, btnPlus, btnSub, btnMultiply, btnDivide, btnPercent, btnEquals, btnClear;
    private boolean checkAdd, checkSubtract, checkMultiply, checkDivide, checkPercentage;
    private int firstNumber, secondNumber, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber = findViewById(R.id.edtNumber);
        btnNum1 = findViewById(R.id.btnNumber1);
        btnNum2 = findViewById(R.id.btnNumber2);
        btnNum3 = findViewById(R.id.btnNumber3);
        btnNum4 = findViewById(R.id.btnNumber4);
        btnNum5 = findViewById(R.id.btnNumber5);
        btnNum6 = findViewById(R.id.btnNumber6);
        btnNum7 = findViewById(R.id.btnNumber7);
        btnNum8 = findViewById(R.id.btnNumber8);
        btnNum9 = findViewById(R.id.btnNumber9);
        btnNum0 = findViewById(R.id.btnZero);
        btnClear = findViewById(R.id.btnClear);
        btnPlus = findViewById(R.id.btnPlus);
        btnSub = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnPercent = findViewById(R.id.btnPercent);
        btnEquals = findViewById(R.id.btnEqual);

        btnNum1.setOnClickListener(this);
        btnNum2.setOnClickListener(this);
        btnNum3.setOnClickListener(this);
        btnNum4.setOnClickListener(this);
        btnNum5.setOnClickListener(this);
        btnNum6.setOnClickListener(this);
        btnNum7.setOnClickListener(this);
        btnNum8.setOnClickListener(this);
        btnNum9.setOnClickListener(this);
        btnNum0.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String number = edtNumber.getText().toString();
        if (number.equals("0")) {
            edtNumber.getText();
            edtNumber.setText("");
            number = edtNumber.getText().toString();
        }
        switch (v.getId()) {
            case R.id.btnZero:
                edtNumber.setText(number + "0");
                break;
            case R.id.btnNumber1:
                edtNumber.setText(number + "1");
                break;
            case R.id.btnNumber2:
                edtNumber.setText(number + "2");
                break;
            case R.id.btnNumber3:
                edtNumber.setText(number + "3");
                break;
            case R.id.btnNumber4:
                edtNumber.setText(number + "4");
                break;
            case R.id.btnNumber5:
                edtNumber.setText(number + "5");
                break;
            case R.id.btnNumber6:
                edtNumber.setText(number + "6");
                break;
            case R.id.btnNumber7:
                edtNumber.setText(number + "7");
                break;
            case R.id.btnNumber8:
                edtNumber.setText(number + "8");
                break;
            case R.id.btnNumber9:
                edtNumber.setText(number + "9");
                break;
            case R.id.btnPlus:
                firstNumber = Integer.parseInt(edtNumber.getText().toString());
                checkAdd = true;
                edtNumber.setText("0");
                break;
            case R.id.btnSubtract:
                firstNumber = Integer.parseInt(edtNumber.getText().toString());
                checkSubtract = true;
                edtNumber.setText("0");
                break;
            case R.id.btnMultiply:
                firstNumber = Integer.parseInt(edtNumber.getText().toString());
                checkMultiply = true;
                edtNumber.setText("0");
                break;
            case R.id.btnDivide:
                firstNumber = Integer.parseInt(edtNumber.getText().toString());
                checkDivide = true;
                edtNumber.setText("0");
                break;
            case R.id.btnPercent:
                firstNumber = Integer.parseInt(edtNumber.getText().toString());
                checkPercentage = true;
                edtNumber.setText("0");
                break;
            case R.id.btnEqual:
                secondNumber = Integer.parseInt(edtNumber.getText().toString());
                Calculations Calc = new Calculations(firstNumber, secondNumber);
                if (checkAdd == true) {
                    result = Calc.Add();
                    edtNumber.setText(Integer.toString(result));
                    checkAdd = false;
                }
                if (checkSubtract == true) {
                    result = Calc.Subtract();
                    edtNumber.setText(Integer.toString(result));
                    checkSubtract = false;
                }
                if (checkMultiply == true) {
                    result = Calc.Multiply();
                    edtNumber.setText(Integer.toString(result));
                    checkMultiply = false;
                }
                if (checkDivide == true) {
                    result = Calc.Divide();
                    edtNumber.setText(Integer.toString(result));
                    checkDivide = false;
                }
                if (checkPercentage == true) {
                    result = Calc.Percent();
                    edtNumber.setText(Integer.toString(result));
                    checkPercentage = false;
                }
                if(!checkAdd || !checkSubtract || !checkMultiply ||!checkDivide || !checkPercentage){
                    edtNumber.setText(edtNumber.getText().toString());
                }
                break;
            case R.id.btnClear:
                edtNumber.setText("0");
                break;
        }
    }
}
