package tests.task0102;

import org.testng.annotations.Test;

import main.java.com.epam.Task0102.Expression;

import org.testng.annotations.DataProvider;

public class Tst0201ExpressionResolveIllegalArgExpPos {
	Expression express;
  @Test(dataProvider = "dp", expectedExceptions = IllegalArgumentException.class)
  public void f(double a, double b, double c) throws Exception {	  
	  express = new Expression(a, b, c);
	  try{
		  express.resolve();
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be not 0.");		
	  }	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { 1, 0, 3},
      new Object[] { 0, -1, -3},
      new Object[] { 0, 0, 7},
      new Object[] { Double.NaN, Double.NaN, Double.NaN},
    };
  }  

}
