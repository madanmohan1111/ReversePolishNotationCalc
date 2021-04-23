package com.rpn.in;

import java.util.Stack;

public class Calculator {
	
	public int add(int n1, int n2) {
		
		return n1+n2;
	}
	
public int power(int n1, int n2) {
		
		return (int) Math.pow(n1, n2);
	}

public int stacky(String[] tokens)throws ArithmeticException
{

	// Intialize the stack and the variable
	Stack<Double> stack = new Stack<Double>();
	double x, y;
	
	String choice;
	double value = 0.0;
	String p = "";

	// Iterating to the each character
	// in the array of the string
	for (int i = 0; i < tokens.length; i++) {

		// If the character is not the special character
		// ('+', '-' ,'*' , '/')
		// then push the character to the stack
		if (tokens[i] != "+" && tokens[i] != "-"
			&& tokens[i] != "*" && tokens[i] != "/" && tokens[i] != "^"
			&& tokens[i] != "%" && tokens[i] != "!") {
			double temp = Double.parseDouble(tokens[i]);
			stack.push(temp);
			continue;
		}
		else {
			// else if the character is the special
			// character then use the switch method to
			// perform the action
			choice = tokens[i];
		}

		// Switch-Case
		switch (choice) {
		case "+":

			// Performing the "+" operation by poping
			// put the first two character
			// and then again store back to the stack

			x = stack.pop();
			y = stack.pop();
			value = x + y;
			
			stack.push(value);
			break;

		case "-":

			// Performing the "-" operation by poping
			// put the first two character
			// and then again store back to the stack
			x = stack.pop();
			y = stack.pop();
			
			value = y - x;
			
			stack.push(value);
			break;

		case "*":

			// Performing the "*" operation
			// by poping put the first two character
			// and then again store back to the stack

			x = stack.pop();
			y = stack.pop();
			value = x * y;
			
			stack.push(value);
			break;

		case "/":

			// Performing the "/" operation by poping
			// put the first two character
			// and then again store back to the stack

			x = stack.pop();
			y = stack.pop();
			if(y==0.0 || y==0) {
				throw new ArithmeticException("no cannot be divided by 0");
			}else {
			value = y / x;
			stack.push(value);
			}
			
			
			break;
			
		case "^":

			// Performing the power operation by poping
			// put the first two character
			// and then again store back to the stack

			x = stack.pop();
			y = stack.pop();
			if(x==0.0 && y==0.0) {
	            throw new ArithmeticException("x and y should not be zero.");
	        } else if(x<0.0 || y<0.0) {
	            throw new ArithmeticException("x and y should not be negative.");
	        } else {
	        	value =   Math.pow(y, x);
	        	stack.push(value);
	        }
			
			
			
			
			break;
			
		case "%":

			// Performing the power operation by poping
			// put the first two character
			// and then again store back to the stack

			x = stack.pop();
			if(x==0.0 || x==0) {
				throw new ArithmeticException("no cannot be divided by 0");
			}else {
			value =  x/100;
			stack.push(value);
			}
			
			break;
			
		case "!":

			// Performing the power operation by poping
			// put the first two character
			// and then again store back to the stack

			x = stack.pop();
			if(x<0.0 ) {
	            throw new ArithmeticException("The factorial of a negative number doesn't exist");
	        } else {
			
			
			int temp = (int) Math.round(x);
			 int r = 1;
			    for ( int start = 1; start <=temp; start++ ) 
			    {
			        r*=start;
			    }
			    value=r;
			
			stack.push(value);
	        }
			break;
		default:
			continue;
		}
	}
	int t = (int) Math.round(stack.pop());
	// Method to convert the String to integer
	return t;
}

public static void main(String[] args)
{
    // String Input
    String[] s = { "10", "6", "9",  "3", "+", "-11", "*", "/",  "*", "17", "+", "5", "+" };
    String [] s2 ={"1","2","3","+","-"};
	String [] s3 =	{"6","2","*","3","/"};
	String [] s4 =	{"2","3","^","4","5","+","+"};
	String[] s5= {"50","%","2","*"};
	String[] s6= {"3","!","4","5","*","+"};
	String[] s7 = {"12","3","/","!"};
	String[] s8 = {"5","1","2","+","4","*","+","3","-"};
    Calculator str = new Calculator();
    int result = str.stacky(s8);
    System.out.println(result);
}

}
