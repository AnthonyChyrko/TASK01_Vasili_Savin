package tests.task0107;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.com.epam.Task0107.Exs07;

import org.testng.annotations.DataProvider;

public class Tst0701SolvePos {	
  @Test(dataProvider = "dp")
  public void f(double a, double b, double h, ArrayList<Double[]> expected) throws Exception {	  
	  ArrayList<Double[]> actual = (ArrayList<Double[]>) Exs07.solve(a,b,h);
	  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
	  List<double[]> expected;
    return new Object[][] {   
    	new Object[] { 0.0, 2.0, 1.0,expected = Arrays.asList(new double[]{0.0, -1.0},
    			new double[]{1.0, 1.124}, new double[]{2.0, 1.48})},    	
//    	new Object[] { -1.0, -2.0, -3.0, -4.0},
//    	new Object[] { -1.0, 0.0, 3.0, 2.0}       
    };
  }  

}
