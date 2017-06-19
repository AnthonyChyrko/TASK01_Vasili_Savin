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
    	if(args.length < 3){
    		System.err.println("ERROR! Enter 3 parameters with type \"double\"");
    	}else{
    		if(args.length > 3){
    			System.err.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
    		}
    		
    		try{
    			double a = Double.parseDouble(args[0]);
    	        double b = Double.parseDouble(args[1]);
    	        double c = Double.parseDouble(args[2]);    	        
    	        
    	        System.out.println("a = " + pow(a));
    	        System.out.println("b = " + pow(b));
    	        System.out.println("c = " + pow(c));
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}         

    }
}
