package org.practice.variables.context;

public class MainClass8 {

	public static void main(String[] args) {
		// Context Program
		
		int x = 10;
		{
			int y = 20;
			x = 100; // Re-Assign not declaration
			System.out.println(x);
			System.out.println(y);
			int x = 30; // Prefers only local variables
			System.out.println(x);
		}
		System.out.println(x);

	}

}
