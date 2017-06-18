package com.epam.Task0104;

public class Exs04 {
    private double x, y;

    public Exs04(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean isPointInArea(){
        if ((x*x + Math.pow((y+1), 2)) <= 0.5*0.5){
            return false;
        }else if(y >= -3 && y <= 0 && x >= -4 && x <= 4){
            return true;
        }else if (y >= 0 && y <= 4 && x >= -2 && x <= 2){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        Exs04 point = new Exs04(x, y);
        System.out.println(point.isPointInArea());
    }
}
