package org.practice.variables.context;

public class MainClass6 {

	public static void main(String[] args) {
		// To Understand context of a Variable
		// ***DEFECTIVE PROGRAM
		
		int x = 20;
		{
			int y = 30;
			System.out.println(x);
			System.out.println(y);
		}
		
		System.out.println(x);
		System.out.println(y);
		

	}

}
