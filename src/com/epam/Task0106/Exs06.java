package com.epam.Task0106;

public class Exs06 {
    public static double sumMinAndMax(double a, double b, double c){
        double min = min(min(a, b), c);
        double max = max(max(a, b), c);
        return min + max;
    }

    public static double min(double a, double b){
        return a <= b ? a : b;
    }

    public static double max(double a, double b){
        return a >= b ? a : b;
    }

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        System.out.println(sumMinAndMax(a, b, c));
    }
}








