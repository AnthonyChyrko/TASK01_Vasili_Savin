package tests.task0102;

import org.testng.annotations.Test;

import main.java.com.epam.Task0102.Expression;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class Tst0205ExpressionResolvePos {
	Expression express;
  @Test(dataProvider = "dp")
  public void f(double a, double b, double c, double expected) {	  
	  express = new Expression(a, b, c);	  
		  double actual = express.resolve();	
		  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { 1, 2, 3, 0.25},
      new Object[] { 4, 5, 6, -381.96},
      new Object[] { -1, -2, -3, -3.75},
    };
  }  

}
