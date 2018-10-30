package com.example;
import java.util.Scanner;

public class kalk {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double oneNumb, twoNumb;
		String operator;
		System.out.println("Operation(+, -, *, /): ");
		operator = in.nextLine();
		System.out.println("First number");
		oneNumb = in.nextDouble();
		System.out.println("Second number");
		twoNumb = in.nextDouble();
		switch(operator){
			case "+":{
			System.out.println("Result: " + (String.valueOf(oneNumb + twoNumb)));
			break;
			}
			case "-":{
				System.out.println("Result: " + (String.valueOf(oneNumb - twoNumb)));
				break;
			}
			case "*":{
				System.out.println("Result: " + (String.valueOf(oneNumb * twoNumb)));
				break;
			}
			case "/":{
				if(twoNumb != 0){
					System.out.println("Result: " + (String.valueOf(oneNumb / twoNumb)));
				}
				break;
			}
			default:{
				System.out.println("Operation not supported");
				break;
			}		
		}
	}
}