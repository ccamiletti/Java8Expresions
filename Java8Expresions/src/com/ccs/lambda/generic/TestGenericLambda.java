package com.ccs.lambda.generic;

public class TestGenericLambda {

	public static void main(String[] args) {
		
		
		GenericLambda<String> genString = (in) -> {
			
			return "hi " + in + " i am generic lambda";
			
		};
		
		GenericLambda<Integer> genInt = (in) -> {
			System.out.println("i am going to sum 1 to you param: param value = " + in + ". result= "); 
			return 1 + in;
		};
		
		System.out.println(genString.compute("carlo"));
		System.out.println(genInt.compute(234));
	}

}
