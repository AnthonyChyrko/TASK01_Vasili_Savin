package tests.task0101;

import org.testng.annotations.Test;

import main.java.com.epam.task0101.Statement;

import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class Tst0104StatementIsStatmentCorrectNeg {
	Statement statement;
	
  @Test(dataProvider = "dp")
  public void f(int number){	 	 
	  statement = new Statement(number);	
	  assertFalse(statement.isStatementCorrect());
  }   
  
  @DataProvider
  public Object dp() {	  
    return new Object[] {    		
      new Integer(1101),      
      new Integer(2220),
      new Integer(3133),
      new Integer(4442),
      new Integer(1234),
      new Integer(9991),
      new Integer(7234),
      new Integer(8234),
      new Integer(9235),           
      new Integer(1235),      
    };	
  }
}
