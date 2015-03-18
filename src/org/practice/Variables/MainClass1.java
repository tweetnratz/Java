package org.practice.variables;

public class MainClass1 {

	public static void main(String[] args) {
		// Variable Declaration, Initialization and utilization
		System.out.println("************"); // Just to mention Starting of a Program
		
		//Variable Declaration
		int empId;
		double empSal;
		char empGrade;
		
		//Variable Initialization
		empId = 7284;
		empSal = 58934.00;
		empGrade = 'A';
		
		//Variable Utilization
		System.out.println("Employee ID:"+empId);
		System.out.println("Employee Salary:"+empSal);
		System.out.println("Employee Grade:"+empGrade);
		System.out.println("Employee CTC:"+(empSal*12));
		
		System.out.println("************"); // Just to mention Ending of a Program
	}

}
