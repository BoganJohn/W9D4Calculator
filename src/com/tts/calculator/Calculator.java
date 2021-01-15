package com.tts.calculator;

public class Calculator {
    public int add(int num1, int num2){
       return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public int division(int num1, int num2) {
        return num1 / num2;
    }
    public double PowerOf(double powerOf, double num) {
        return Math.pow(powerOf, num);
    }
    public int square(int num){
        return num * num;
    }


}
