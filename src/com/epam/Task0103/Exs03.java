package com.epam.Task0103;

public class Exs03 {
    private double a, b, c;

    public Exs03(double a, double b){
        if (a <= 0 || b <= 0){
            throw new IllegalArgumentException("Catheters must be greater than 0");
        }
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a*a + b*b);
    }

    public double getArea(){
        return (a + b)/2;
    }

    public double getPerimeter(){
        return a + b + c;
    }

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        Exs03 triangle = new Exs03(a, b);
        System.out.println("S = " + triangle.getArea());
        System.out.println("P = " + triangle.getPerimeter());
    }
}
