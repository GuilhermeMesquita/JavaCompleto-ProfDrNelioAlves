package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios06Fixação {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Locale.setDefault(Locale.US);
		
		double dollar;
		double val;
		
		System.out.print("What is the dollar price?");
		dollar = sc.nextDouble();
		
		System.out.printf("\nHow many dollars will be bought?");
		val = sc.nextDouble();
		
		double res = Exercicios06CurrencyConverter.calcConverter(dollar, val);
		System.out.printf("\nAmount to be paid in R$: %.2f", res);
		
	}
	
	

}
