package curso_java;

import java.util.Scanner;

public class Exercicios05Employee {
	public static String name;
	public static double grossSal;
	public static double tax;
	
	static Scanner sc = new Scanner (System.in);
	
	public static void employee(){
		System.out.printf("\nName: ");
		name = sc.next();
		
		System.out.printf("\nGross salary: ");
		grossSal = sc.nextDouble();
		
		System.out.printf("\nTax: ");
		tax = sc.nextDouble();
		
		grossSal -= tax;
		
		System.out.println("Employee: " + name + ", $ " + grossSal);
	}
	
	public static void employeeIncrease(){
		System.out.println("Which percentage to increase salary? ");
		double per;
		per = sc.nextDouble();
		
		double updateVal = ((per/100) * grossSal) + grossSal;
		System.out.println("Update data: " + name + ", $ " + updateVal);
	}
	
}
