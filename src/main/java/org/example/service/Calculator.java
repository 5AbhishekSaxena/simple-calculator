package org.example.service;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1,int num2){
        return num1*num2;
    }

    public int divide(int num1,int num2)
    {
        float num=num2;
        if(num2!=0)
        {
            return num1/num;
        }
        else{
            System.out.println("denominator can't be zero");
            return 0;
        }
    }
}
