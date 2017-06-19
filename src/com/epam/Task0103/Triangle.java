package com.epam.Task0103;

public class Triangle {
	
	private double a, b, c;
	
	public Triangle(double a, double b){        
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
    
    public boolean areParametersCorrect(){
    	boolean flag = true;
        if (a <= 0) {
            System.err.println("Parameter 'a' must be greater than 0.");
            flag = false;
        } 
        
        if (b <= 0) {
        	System.err.println("Parameter 'b' must be greater than 0.");
        	flag = false;
        }        
        return flag;
    }

}
