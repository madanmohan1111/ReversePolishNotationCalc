package com.rpn.in;

public class Test {

	public static void main(String[] args) {
		int a =3;
		double x, y;
		double value=0.0;
		String result,p = "";
		String s1="5";	
		String s2="3";
		x=Double.parseDouble(s1);
		y=Double.parseDouble(s2);
		value=x-y;
		value = (int) Math.round(value);
		result = p + value;
		
		System.out.println("Hello World="+Integer.parseInt(result));

	}

}
