package tests.task0103;

import org.testng.annotations.Test;

import main.java.com.epam.Task0103.Triangle;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class Tst0303TriangleGetAreaPos {
	Triangle triangle;
  @Test(dataProvider = "dp")
  public void f(double a, double b, double expected) throws Exception {	  
		  triangle = new Triangle(a, b);
		  double actual = triangle.getArea();
		  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { 1, 1, 0.5},
      new Object[] { 2, 2, 2},
      new Object[] { 3, 4, 6},             
    };
  }  

}
