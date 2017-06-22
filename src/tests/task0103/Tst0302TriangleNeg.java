package tests.task0103;

import org.testng.annotations.Test;

import main.java.com.epam.Task0103.Triangle;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class Tst0302TriangleNeg {
	Triangle triangle;
  @Test(dataProvider = "dp")
  public void f(double a, double b){	  
	  
	  try{
		  triangle = new Triangle(a, b);
		  assertTrue(true);
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be greater than 0.");		
	  }	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
    	new Object[] { Double.MAX_VALUE, Double.MAX_VALUE},    	
    	new Object[] { 0.1, 0.1},    	          
    };
  }  

}
