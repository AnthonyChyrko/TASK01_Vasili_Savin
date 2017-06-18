package com.epam.Task0105;

public class Exs05 {
    public static double pow(double x){
        if (x >= 0){
            return x*x;
        }else {
            return x*x*x*x;
        }
    }

    public static void main(String[] args) {
        double a = 3;
        double b = -3.4565767;
        double c = -2;

        System.out.println("a = " + pow(a));
        System.out.println("b = " + pow(b));
        System.out.println("c = " + pow(c));

    }
}
