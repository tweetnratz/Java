package org.practice.variables.context;

public class MainClass7 {

	public static void main(String[] args) {
		// Context example 2
		// ***DEFECTIVE PROGRAM
		
		int x = 10;
		{
			int y = 38;
			System.out.println(x);
			System.out.println(y);
		}
		{
			int z = 84;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
