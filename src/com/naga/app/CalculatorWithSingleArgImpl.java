package com.naga.app;

@FunctionalInterface
interface Calc {

	void sum(int input1, int input2);
}

public class CalculatorWithSingleArgImpl {

	public static void main(String[] args) {

		Calc cal = (input1,input2) -> System.out.println("sum oftwo input numbers are : " + (input1 + input2));

		cal.sum(20, 30);
	}
	
	
	

}
