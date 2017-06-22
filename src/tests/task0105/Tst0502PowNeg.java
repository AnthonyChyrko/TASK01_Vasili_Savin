package tests.task0105;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import main.java.com.epam.Task0105.Exs05;

import org.testng.annotations.DataProvider;

public class Tst0502PowNeg {	
  @Test(dataProvider = "dp")
  public void f(double a, double b, double c, double[] expected) throws Exception {	  
	  double[] actual = Exs05.pow(a,b,c);
	  assertTrue(Arrays.equals(actual, expected));
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {   
      new Object[] { -2.0, 2.0, 2.0, new double[]{ 16.0, 4.0, 4.0}},
      new Object[] {  3.0, -2.0, 3.0, new double[]{ 9.0, 16.0, 9.0}},
      new Object[] {  4.0, 3.0, -4.0, new double[]{ 16.0, 9.0, 256.0}},          
      
    };
  }  

}
