package se.lexicon.CalcApp;

import org.junit.Test;

import junit.framework.Assert;

public class CalcTest {
	
	@Test
	public void calc_Addition() {
		double num1=4,num2=5.1,expected=9.1;
		
		//"+"
		char operation='+';
		
		double actual=App.calc(num1, num2, operation);
				
		Assert.assertEquals(expected, actual, 0.1);
	}
	@Test
	public void calc_multiplication() {
		double num1=2.2,num2=0.3,expected=0.66;

		//"*"
		char operation='*';
		
		double actual=App.calc(num1, num2, operation);
				
		Assert.assertEquals(expected, actual, 0.1);
	}

	@Test
	public void count_Subtraction() {
		double num1=3 ,num2=2,expected=1;
		
		//"-"
		char operation='-';
		
		double actual=App.calc(num1, num2, operation);
				
		Assert.assertEquals(actual, expected, 0.1);
	}
	
	@Test
	public void coun_Division() {
		double num1=2,num2=8,expected=0.25;
		
		//"/"
		char operation='/';
		
		double actual=App.calc(num1, num2, operation);
				
		Assert.assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void coun_Division0() {
		double num1=2,num2=0,expected=0;
		
		//"/"
		char operation='/';
		
		double actual=App.calc(num1, num2, operation);
				
		Assert.assertEquals(expected, actual, 0.1);
	}

}
