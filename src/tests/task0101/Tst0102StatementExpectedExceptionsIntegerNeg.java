package tests.task0101;

import org.testng.annotations.Test;

import main.java.com.epam.task0101.Statement;

import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class Tst0102StatementExpectedExceptionsIntegerNeg {
	Statement statement;
	
  @Test(dataProvider = "dp")
  public void f(int number) throws Exception {	 
	  try {
		  statement = new Statement(number);
		  assertTrue(true);
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Argument must be a 4-digit pisitive number.");		
	}
		  		 
  } 
  
  
  @DataProvider
  public Object dp() {
    return new Object[] {      
      new Integer(1000),
      new Integer(9999),
      new Integer(5555),           
    };
  }
}
