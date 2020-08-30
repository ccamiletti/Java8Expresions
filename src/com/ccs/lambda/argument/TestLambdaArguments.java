package com.ccs.lambda.argument;

public class TestLambdaArguments {

	
	
	static MyLambda find = (str, find) -> {
		
		return str.contains(find);
		
	};

	public static boolean callLamnbdaFunction(MyLambda lambda, String txt, CharSequence chr) {
		
		return lambda.myFunction(txt, chr);
		
	}
	
	public static void main(String...strings) {
		CharSequence cs = "1";
		System.out.println(callLamnbdaFunction(find, "abcdefghijklmnñopqrstuvwxyz0123456789", cs));
		
	}
	
	
}
