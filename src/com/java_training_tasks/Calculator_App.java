package com.java_training_tasks;

import java.util.Scanner;

public class Calculator_App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Power");
			System.out.println("7. Square root");
			System.out.println("8. Exit");
			
			int operations = sc.nextInt();
			switch (operations) {
			
			case 1: {
				System.out.println("Enter First Number : ");
				num1 = sc.nextDouble();
				System.out.println("Enter Second Number : ");
				num2 = sc.nextDouble();
				double sum = num1 + num2;
				System.out.println("Addition Result : "+sum);
				break;
			}
			case 2: {
				System.out.println("Enter First Number : ");
				num1 = sc.nextDouble();
				System.out.println("Enter Second Number : ");
				num2 = sc.nextDouble();
				double sub = num1 - num2;
				System.out.println("Subtraction Result : "+sub);
				break;
			}
			case 3: {
				System.out.println("Enter First Number : ");
				num1 = sc.nextDouble();
				System.out.println("Enter Second Number : ");
				num2 = sc.nextDouble();
				double mul = num1 * num2;
				System.out.println("Multiplication Result : "+mul);
				break;
			}
			case 4: {
				System.out.println("Enter First Number : ");
				num1 = sc.nextDouble();
				System.out.println("Enter Second Number : ");
				num2 = sc.nextDouble();
				if(num2 == 0) {
					System.out.println("Not divsible by 0");
				} else {
					double div = num1 / num2;
					System.out.println("Division Result : "+div);
				}
				break;
			}
			case 5: {
				System.out.println("Enter First Number : ");
				num1 = sc.nextDouble();
				System.out.println("Enter Second Number : ");
				num2 = sc.nextDouble();
				double mod = num1 % num2;
				System.out.println("Modulus Result : "+mod);
				break;
			}
			case 6: {
				System.out.println("Enter First Number : ");
				num1 = sc.nextDouble();
				System.out.println("Enter Second Number : ");
				num2 = sc.nextDouble();
				double pow = Math.pow(num1, num2); 
				System.out.println("Square root Result : "+pow);
				break;
			}
			case 7: {
				System.out.println("Enter First Number : ");
				num1 = sc.nextDouble();
				if(num1 < 0) {
					System.out.println("Square with negative numbers not posible");
				} else {
					double sqrt = Math.sqrt(num1);
					System.out.println("Result : "+sqrt);
				}
				break;
			}
			case 8: {
				System.out.println("Exit Calculation....");
				return;
			}
			default:
				System.out.println("Invalid operation:");
				break;
			}
		}
}
