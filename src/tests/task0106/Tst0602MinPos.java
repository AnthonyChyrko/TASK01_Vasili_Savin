package tests.task0106;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import main.java.com.epam.Task0106.Exs06;

import org.testng.annotations.DataProvider;

public class Tst0602MinPos {	
  @Test(dataProvider = "dp")
  public void f(double a, double b, double expected) throws Exception {	  
	  double actual = Exs06.min(a,b);
	  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
    	new Object[] { 0.0, 0.0, 0.0},    	
    	new Object[] { -1.0, -2.0, -2.0},
    	new Object[] { -1.0, 2.0, -1.0}  ,
    	new Object[] { 1.0, 2.0, 1.0}       
    };
  }  

}
