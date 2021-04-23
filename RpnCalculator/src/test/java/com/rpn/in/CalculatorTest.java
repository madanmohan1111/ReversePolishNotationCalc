package com.rpn.in;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		
		int expected =2;
		int actual = calc.add(1, 1);
		assertEquals("Add() should return addition of two no", expected, actual);
		
		
	}
	@Test
	public void testpower() {
		
		assertEquals("power() should return 2^3", 8, calc.power(2, 3));
		System.out.println(2^3);
		
		
	}
	
	@Test
	public void teststacky() {
		// String [] s = {"5","2","-"};
	// 	String [] s1 = { "10", "6", "9", "3", "+", "-11", "*","/", "*", "17", "+", "5", "+" };
		String [] s2 ={"1","2","3","+","-"};
		String [] s3 =	{"6","2","*","3","/"};
		String [] s4 =	{"2","3","^","4","5","+","+"};
		String[] s5= {"50","%","2","*"};
		String[] s6= {"3","!","4","5","*","+"};
		String[] s7 = {"12","3","/","!"};
		String[] s8 = {"5","1","2","+","4","*","+","3","-"};
		//assertEquals("s", 3, calc.stacky(s));
		//assertEquals("s", 3.0, calc.stacky(s));
		
		//assertEquals("s1", 22, calc.stacky(s1));
		assertEquals("s2", -4, calc.stacky(s2));
		assertEquals("s3", 4, calc.stacky(s3));
		assertEquals("s4", 17, calc.stacky(s4));
		assertEquals("s5", 1, calc.stacky(s5));
		assertEquals("s6", 26, calc.stacky(s6));
		assertEquals("s7", 24, calc.stacky(s7));
		assertEquals("s8", 14, calc.stacky(s8));
		
		
		
	}

}
