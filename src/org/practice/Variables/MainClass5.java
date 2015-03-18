package org.practice.variables;

public class MainClass5 {

	public static void main(String[] args) {
		// Area and Circumference with Variables
		
		final double pi = 3.14;
		double rad = 2.1;
		double area;
		double circum;
		
		area = pi*rad*rad;
		circum = 2*pi*rad;
		
		System.out.println("Area of circle: "+area);
		System.out.println("Circumference of circle: "+circum);

	}

}
