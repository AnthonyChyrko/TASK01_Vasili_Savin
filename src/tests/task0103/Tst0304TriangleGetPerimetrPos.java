package tests.task0103;

import org.testng.annotations.Test;

import main.java.com.epam.Task0103.Triangle;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class Tst0304TriangleGetPerimetrPos {
	Triangle triangle;
  @Test(dataProvider = "dp")
  public void f(double a, double b, double expected) throws Exception {	  
		  triangle = new Triangle(a, b);
		  double actual = triangle.getPerimeter();
		  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { 1.0, 1.0, Math.sqrt(1.0 + 1.0) + 1.0 + 1.0},
      new Object[] { 2.5, 2.5, Math.sqrt(Math.pow(2.5, 2) + Math.pow(2.5, 2)) + 2.5 + 2.5},
      new Object[] { 3.5, 4.5, Math.sqrt(Math.pow(3.5, 2)+Math.pow(4.5, 2)) + 3.5 + 4.5},   
      new Object[] { Double.MIN_VALUE, Double.MIN_VALUE, Math.sqrt(Math.pow(Double.MIN_VALUE, 2)+Math.pow(Double.MIN_VALUE, 2)) 
    		  + Double.MIN_VALUE + Double.MIN_VALUE},
    };
  }  

}
