package tests.task0104;

import org.testng.annotations.Test;

import main.java.com.epam.Task0104.Point;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class Tst0402PointIsPointInAreaNeg {
	Point point;
  @Test(dataProvider = "dp")
  public void f(double a, double b, boolean expected) throws Exception {	  
	  point = new Point(a, b);
		  boolean actual = point.isPointInArea();
		  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { 5.0, -5.0, false},  
      new Object[] { -5.0, -5.0, false},
      new Object[] { -5.0, 5.0, false},
      new Object[] { 5.0, 5.0, false},
      
      new Object[] { 0.0, 4.1, false},      
      new Object[] { 1.0, 4.1, false},
      new Object[] { 2.0, 4.1, false},
      
      new Object[] { 2.1, 3.0, false},
      new Object[] { 2.1, 2.0, false},
      new Object[] { 2.1, 1.0, false},
      new Object[] { 2.1, 0.1, false},
      
      new Object[] { 3.0, 0.1, false},
      new Object[] { 4.0, 0.1, false},
      
      new Object[] { 4.1, -1.0, false},
      new Object[] { 4.1, -2.0, false},
      new Object[] { 4.1, -3.0, false},
      
      new Object[] { 3.0, -3.1, false},
      new Object[] { 2.0, -3.1, false},
      new Object[] { 1.0, -3.1, false},
      new Object[] { 0.0, -3.1, false},
      new Object[] { -1.0, -3.1, false},
      new Object[] { -2.0, -3.1, false},
      new Object[] { -3.0, -3.1, false},
      new Object[] { -4.0, -3.1, false},
      
      new Object[] { -4.1, -2.0, false},
      new Object[] { -4.1, -1.0, false},
      new Object[] { -4.1, 0.0, false},
      
      new Object[] { -3.0, 0.1, false},
      new Object[] { -2.1, 0.1, false},
      
      new Object[] { -2.1, 1.0, false},
      new Object[] { -2.1, 2.0, false},
      new Object[] { -2.1, 3.0, false},
      new Object[] { -2.1, 4.0, false},
      
      new Object[] { -1.0, 4.1, false},
      
      new Object[] { 0.0, -1.5, false},
      new Object[] { 0.0, -0.5, false},
      new Object[] { 0.5, -1.0, false},
      new Object[] { -0.5, -1.0, false},
    };
  }  

}
