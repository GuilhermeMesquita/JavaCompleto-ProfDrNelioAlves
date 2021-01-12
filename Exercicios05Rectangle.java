package curso_java;

import java.util.Scanner;



public class Exercicios05Rectangle {
	public static double b;
	public static double h;
	
	
	public static double area(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width: ");
		b = sc.nextDouble();
		System.out.print("Height: ");
		h = sc.nextDouble();
		double res = b * h;
		System.out.printf("\nAREA = %.2f ", res);
		return res;
	}
	
	public static double perimeter(){
		double res = 2 * (b + h);
		System.out.printf("\nPERIMETER = %.2f ", res);
		return res;
		
	}
	
	public static double diagonal(){
		double res = Math.sqrt(b * b + h * h);
		System.out.printf("\nDIAGONAL = %.2f ", res);
		return res;
		
	}

}
