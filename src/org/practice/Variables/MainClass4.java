package org.practice.variables;

public class MainClass4 {

	public static void main(String[] args) {
		// Copy one variable to another
		
		int n1 = 39;
		int n2 = 45;
		int n3 = 0;
		
		System.out.println("n1 value: "+n1);
		System.out.println("n2 value: "+n2);
		System.out.println("n3 value: "+n3);
		
		n2 = n1; // Copy n1 to n2
		n3 = n2; // Copy n2 to n3
		System.out.println("* * * Values after Copy * * *");
		System.out.println("n1 value: "+n1);
		System.out.println("n2 value: "+n2);
		System.out.println("n3 value: "+n3);
	}

}
