package tests.task0104;

import org.testng.annotations.Test;

import main.java.com.epam.Task0104.Point;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class Tst0401PointIsPointInAreaPos {
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
      new Object[] { 1.0, 1.0, true},
      new Object[] { -1.0, 1.0, true},
      new Object[] { -1.0, -1.0, true},
      new Object[] { 1.0, -1.0, true},   
      
      new Object[] { 0.0, 4.0, true},      
      new Object[] { 1.0, 4.0, true},
      new Object[] { 2.0, 4.0, true},
      
      new Object[] { 2.0, 3.0, true},
      new Object[] { 2.0, 2.0, true},
      new Object[] { 2.0, 1.0, true},
      new Object[] { 2.0, 0.0, true},
      
      new Object[] { 3.0, 0.0, true},
      new Object[] { 4.0, 0.0, true},
      
      new Object[] { 4.0, -1.0, true},
      new Object[] { 4.0, -2.0, true},
      new Object[] { 4.0, -3.0, true},
      
      new Object[] { 3.0, -3.0, true},
      new Object[] { 2.0, -3.0, true},
      new Object[] { 1.0, -3.0, true},
      new Object[] { 0.0, -3.0, true},
      new Object[] { -1.0, -3.0, true},
      new Object[] { -2.0, -3.0, true},
      new Object[] { -3.0, -3.0, true},
      new Object[] { -4.0, -3.0, true},
      
      new Object[] { -4.0, -2.0, true},
      new Object[] { -4.0, -1.0, true},
      new Object[] { -4.0, 0.0, true},
      
      new Object[] { -3.0, 0.0, true},
      new Object[] { -2.0, 0.0, true},
      
      new Object[] { -2.0, 1.0, true},
      new Object[] { -2.0, 2.0, true},
      new Object[] { -2.0, 3.0, true},
      new Object[] { -2.0, 4.0, true},
      
      new Object[] { -1.0, 4.0, true},
      
      new Object[] { 0.0, -1.6, true},
      new Object[] { 0.0, -0.4, true},
      new Object[] { 0.6, -1.0, true},
      new Object[] { -0.6, -1.0, true},
    };
  }  

}
