package tests.task0101;

import org.testng.annotations.Test;

import main.java.com.epam.task0101.Statement;

import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class Tst0103StatementIsStatmentCorrectPos {
	Statement statement;
	
  @Test(dataProvider = "dp")
  public void f(int number){	 	 
	  statement = new Statement(number);	
	  assertTrue(statement.isStatementCorrect());
  }   
  
  @DataProvider
  public Object[][] dp() {	  
    return new Object[][] {    		
      new Object[]{1111},      
      new Object[]{2222},
      new Object[]{3333},
      new Object[]{4444},
      new Object[]{5555},     
      new Object[]{6666},
      new Object[]{7777},
      new Object[]{8888},
      new Object[]{9999},           
      new Object[]{1221},     
    };	
  }
}
