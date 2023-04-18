package com.java_training_tasks;


class Operations {
	int result;
	public int addition(int num1 ,int num2) {
		result = num1 + num2;
		return result;
	}
	
	public int substract(int num1 ,int num2) {
		result = num1 - num2;
		return result;
	}
	
	public int mulitiply(int num1 ,int num2) {
		result = num1 * num2;
		return result;
	}
	
	public int divison(int num1 ,int num2) {
		result = num1 / num2;
		return result;
	}
}
public class Calculator {

	public static void main(String[] args) {
		int num1 = 12, num2 = 10;
		Operations ope = new Operations();
		System.out.println(" Addition of two numbers : "+ope.addition(num1, num2));
		System.out.println(" Substract of two numbers : "+ope.substract(num1, num2));
		System.out.println(" Multiply of two numbers : "+ope.mulitiply(num1, num2));
		System.out.println(" Divison of two numbers : "+ope.divison(num1, num2));
	}
}
