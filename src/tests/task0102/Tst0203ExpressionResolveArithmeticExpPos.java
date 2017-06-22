package tests.task0102;

import org.testng.annotations.Test;

import main.java.com.epam.Task0102.Expression;

import org.testng.annotations.DataProvider;

public class Tst0203ExpressionResolveArithmeticExpPos {
	Expression express;
  @Test(dataProvider = "dp", expectedExceptions = ArithmeticException.class)
  public void f(double a, double b, double c) throws Exception {	  
	  express = new Expression(a, b, c);
	  try{
		  express.resolve();
	  } catch (ArithmeticException e) {
			throw new ArithmeticException("Discriminant must be greater than 0.");		
	  }	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { -100, 1, 3},
      new Object[] { 1, 1, -3},
      new Object[] { -1, -1, 7},
      new Object[] { Double.NaN, Double.NaN, Double.NaN},
    };
  }  

}
