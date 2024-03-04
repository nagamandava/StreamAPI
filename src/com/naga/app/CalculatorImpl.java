package com.naga.app;

interface Calculator {
	void switchOn();
}

public class CalculatorImpl{

	public static void main(String[] args) {
		
//		Calculator calculator=()-> System.out.println("switchon"); If we have only one statement to print we can remove the body 
			
		Calculator calculator=()-> {
			System.out.println("switchon");
			System.out.println("Started learing Functional Interface with SAM");
			System.out.println("I did one sample Programme");
			
		};
		
		calculator.switchOn();
	}

}
