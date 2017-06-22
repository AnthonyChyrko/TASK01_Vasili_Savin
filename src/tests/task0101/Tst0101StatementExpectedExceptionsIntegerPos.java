package tests.task0101;

import org.testng.annotations.Test;

import main.java.com.epam.task0101.Statement;

import org.testng.annotations.DataProvider;

public class Tst0101StatementExpectedExceptionsIntegerPos {
	Statement statement;
	
  @Test(dataProvider = "dp", expectedExceptions = IllegalArgumentException.class)
  public void f(int number) throws Exception {	 
	  try {
		  statement = new Statement(number);	
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Argument must be a 4-digit pisitive number.");		
	}
		  		 
  } 
  
  
  @DataProvider
  public Object dp() {
    return new Object[] {
      new Integer(999),      
      new Integer(10000),
      new Integer(Integer.MIN_VALUE),
      new Integer(Integer.MAX_VALUE),      
    };
  }
}
