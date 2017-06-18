package com.epam.Task0102;

public class Exs02 {
    private double a, b, c;

    public Exs02(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
       // checkParameters();
    }

    public double calculate(){
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    private void checkParameters(){
        if (a == 0) {
            throw new IllegalArgumentException("Parameter 'a' must be not 0.");
        } else if (b == 0) {
            throw new IllegalArgumentException("Parameter 'b' must be not 0.");
        } else if ((b * b + 4 * a * c) < 0) {
            throw new IllegalArgumentException("Discriminant must be >= 0.");
        }
    }

    public static void main(String[] args) {
        double a = 3;
        double b = 1;
        double c = 5;

        Exs02 fun = new Exs02(a, b, c);
        System.out.println(fun.calculate());
    }
}
