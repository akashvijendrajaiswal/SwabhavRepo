package com.techlabs.basics;

public class TestArguments {

	public static void main(String[] args) {
		int length;
		length = args.length;
		System.out.println(args.length);
		
		if(length>0)
		{
		String s = args[0];
		System.out.println("hello "+s);
		}
		else
		{
			System.out.println("thanks");
		}

	}

}
