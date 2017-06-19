package com.epam.Task0102;

public class Exs02 {
	
    public static double calculate(double a, double b, double c){
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static boolean areParametersCorrect(double a, double b, double c){
    	boolean flag = true;
        if (a == 0) {
            System.err.println("Parameter 'a' must be not 0.");
            flag = false;
        } 
        
        if (b == 0) {
        	System.err.println("Parameter 'b' must be not 0.");
        	flag = false;
        } 
        
        if ((b * b + 4 * a * c) < 0) {
        	System.err.println("Discriminant must be greater than 0.");
        	flag = false;
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
    	        double c = Double.parseDouble(args[2]);
    	        
    	        if(areParametersCorrect(a, b, c)){
    	        	System.out.println(calculate(a, b, c));    	        	
    	        }
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}          
    }
}
