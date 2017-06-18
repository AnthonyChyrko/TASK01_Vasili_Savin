package com.epam.Task0107;

public class Exs07 {
    private double a, b, h;

    public Exs07(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void calculate(){
        double x = a;
        double y;
        System.out.printf("|%10s %2$10s %3$10s %2$9s\n", "x", "|", "y");
        while (x <= b){
            y = Math.pow(Math.sin(x), 2) + Math.cos(2 * x);
            System.out.printf("|%20.3f|%20.3f|\n", x, y);
            x += h;
        }
    }

    public static void main(String[] args) {
        double a = -1;
        double b = 1;
        double h = 0.1;
        Exs07 function = new Exs07(a, b, h);
        function.calculate();
    }
}
