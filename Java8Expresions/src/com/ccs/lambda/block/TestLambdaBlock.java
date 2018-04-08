package com.ccs.lambda.block;

import java.util.Arrays;

public class TestLambdaBlock {


	static StringFunction revert = (s) -> {
		String[] nums = s.split("");
		Arrays.stream(nums).forEach(num -> System.out.print(num));
		
		System.out.println("");
		for (int i = nums.length-1; i >= 0; i--) {
			System.out.print(nums[i]);
		}
		
		return "hola";
	};

	public static void main(String[] args) {

		revert.myFunction("hello");
		
	}
	
	
	
}
