package tests.task0102;

import org.testng.annotations.Test;

import main.java.com.epam.Task0102.Expression;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class Tst0204ExpressionResolveArithmeticExpNeg {
	Expression express;
  @Test(dataProvider = "dp")
  public void f(double a, double b, double c) throws Exception {	  
	  express = new Expression(a, b, c);
	  try{
		  express.resolve();
		  assertTrue(true);
	  } catch (ArithmeticException e) {
			throw new ArithmeticException("Discriminant must be greater than 0.");		
	  }	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { -1, -2, -33},
      new Object[] { -2, -1, 0},
      new Object[] { Double.MAX_VALUE,Double.MIN_VALUE , 0},
    };
  }  

}
