package com.ccs.lambda.simple;

public class TestLamda {

	public static void main(String[] args) {
		
		Operations ope = (x,y) -> (x + y);
		System.out.println("SUM: " + ope.operation(4, 3));
		
		ope = (x,y) -> (x - y);
		System.out.println("subtract: " + ope.operation(4, 3));

		ope = (x,y) -> (x * y);
		System.out.println("multiplication: " + ope.operation(4, 3));

		ope = (x,y) -> (x / y);
		System.out.println("division: " + ope.operation(4, 3));
	}

}
