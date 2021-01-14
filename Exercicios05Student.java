package curso_java;

import java.util.Scanner;

public class Exercicios05Student {
	public String name;
	public double grade;
	public double finalGrade = 0;
	
	
	Scanner sc = new Scanner(System.in);
	
	public void Student(){
		System.out.printf("\nEnter your name: ");
		name = sc.next();
		
		for(int i = 1; i <= 3; i++){
			System.out.printf("\nEnter your " + i + "ºgrade: ");
			grade = sc.nextDouble();
			finalGrade += grade;
		}
		
		System.out.printf("\nFINAL GRADE = %.2f", finalGrade);
		if(finalGrade >= 60){
			System.out.printf("\nPASS");
		} else {
			double failedVal = 60 - finalGrade;
			System.out.printf("\nFAILED");
			System.out.printf("\nMISSING %.2f POINTS", failedVal);
		}
		
	}
}
