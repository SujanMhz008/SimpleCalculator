package com.sujanmaharjan008.simplecalculator.Functions;

public class Calculations {
    private int firstNumber, secondNumber;

    public Calculations(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int Add(){
        return firstNumber + secondNumber;
    }
    public int Subtract(){
        return firstNumber - secondNumber;
    }
    public int Multiply(){
        return firstNumber * secondNumber;
    }
    public int Divide(){
        return firstNumber/secondNumber;
    }
    public int Percent(){
        return ((firstNumber*100)/secondNumber);
    }
}
