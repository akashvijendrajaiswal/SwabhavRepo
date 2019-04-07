package com.techlabs.basics;

public class TestOverloading {
	public static void printthis() {
		System.out.println("");
		System.out.println("overload 1");
	}

	public static void printthis(int i) {
		System.out.println("overload 2");
		System.out.println(i);
	}

	public static void printthis(String s) {
		System.out.println("overload 3");
		System.out.println(s);
	}

	public static void printthis(char f) {
		System.out.println("overload 4");
		System.out.println(f);
	}

	public static void printthis(TestOverloading tx) {
		System.out.println("overload 5");
		System.out.println(tx);
	}

	public static void main(String[] args) {
		boolean x = true;
		char c[] = { 'a', 'b', 'c' };
		float v;
		TestOverloading t = new TestOverloading();
		System.err.println();
		System.err.println("hii");
		System.err.println(x);
		System.err.println(10.00d);
		System.err.println(10);
		System.err.println(t);
		System.err.println('a');
		System.err.println(12.34f);
		System.err.println(10.5443536756);
		System.err.println(c);
		printthis();
		printthis(10);
		printthis("akash");
		printthis('c');
		printthis(t);

	}

}
