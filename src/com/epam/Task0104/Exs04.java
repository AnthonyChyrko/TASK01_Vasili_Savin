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
    	if(args.length < 2){
    		System.err.println("ERROR! Enter 2 parameters with type \"double\"");
    	}else{
    		if(args.length > 2){
    			System.err.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
    		}
    		
    		try{
    			double x = Double.parseDouble(args[0]);
    	        double y = Double.parseDouble(args[1]);
    	        
    	        Point point = new Point(x, y);
    	        
    	        System.out.println(point.isPointInArea());
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}      
        
    }
}
