package tests.task0106;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import main.java.com.epam.Task0106.Exs06;

import org.testng.annotations.DataProvider;

public class Tst0601SumMinAndMaxPos {	
  @Test(dataProvider = "dp")
  public void f(double a, double b, double c, double expected) throws Exception {	  
	  double actual = Exs06.sumMinAndMax(a,b,c);
	  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
    	new Object[] { 0.0, 0.0, 0.0, 0.0},    	
    	new Object[] { -1.0, -2.0, -3.0, -4.0},
    	new Object[] { -1.0, 0.0, 3.0, 2.0}       
    };
  }  

}
