package tests.task0103;

import org.testng.annotations.Test;

import main.java.com.epam.Task0103.Triangle;

import org.testng.annotations.DataProvider;

public class Tst0301TrianglePos {
	Triangle triangle;
  @Test(dataProvider = "dp", expectedExceptions = IllegalArgumentException.class)
  public void f(double a, double b) throws Exception {	  
	  
	  try{
		  triangle = new Triangle(a, b);
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be greater than 0.");		
	  }	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { 0, 0},
      new Object[] { -1, -1},
      new Object[] { 0, -1},
      new Object[] { -1, 0},
      new Object[] { 0.1, -1},
      new Object[] { -1, 0.1},
      new Object[] { -1.1, -1.1},
      new Object[] { -5E-324, -1},
      new Object[] { -Double.MIN_VALUE, -Double.MIN_VALUE},     
    };
  }  

}
