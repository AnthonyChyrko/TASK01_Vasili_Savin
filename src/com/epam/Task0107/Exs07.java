package com.epam.Task0107;

public class Exs07 {    

    public static void calculate(double a, double b, double h){
    	double x = a;         
        double y;
        System.out.printf("|%10s %2$10s %3$10s %2$9s\n", "x", "|", "y");
        
        while (x <= b){
            y = Math.pow(Math.sin(x), 2) + Math.cos(2 * x);
            System.out.printf("|%20.3f|%20.3f|\n", x, y);
            x += h;
        }
    }
    
    public static boolean areParamCorrect(double a, double b, double h){
    	boolean flag = true;
    	if(b <= a){
    		flag = false;
    		System.err.println("Parameter 'b' must be greater than parameter 'a'");
    	}
    	
    	if(h <= 0){
    		flag = false;
    		System.err.println("Parameter 'h' must be greater than 0");
    	}    	
    	
    	return flag;
    }

    public static void main(String[] args) {
    	if(args.length < 3){
    		System.err.println("ERROR! Enter 3 parameters with type \"double\"");
    	}else{
    		if(args.length > 3){
    			System.err.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
    		}
    		
    		try{
    			double a = Double.parseDouble(args[0]);
    	        double b = Double.parseDouble(args[1]);
    	        double h = Double.parseDouble(args[2]);  
    	        
    	        System.out.println(a);
    	        System.out.println(b);
    	        System.out.println(h);
    	        System.out.println(Double.MIN_VALUE);
    	        
    	        if(areParamCorrect(a, b, h)){
    	        	calculate(a, b, h);
    	        }    	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}        
        
    }
}
