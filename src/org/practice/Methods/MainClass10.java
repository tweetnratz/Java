package org.practice.Methods;
// Program to show How to pass arguments to a method
public class MainClass10 {
	
	static void test2(int arg)
	{
		System.out.println("Running test2() method ");
		System.out.println("arg value: "+arg);
		return;
	}

	public static void main(String[] args) {
		// Calling method by passing argument
		
		test2(23);
		test2(58);

	}

}
