package curso_java;

import java.util.Scanner;

public class Exercicios06CurrencyConverter {
	
	public static final double iof = 0.06;
	
	
	
	
	public static double calcConverter(double dol, double hmany) {
		return ((iof * dol) + dol) * hmany;
		
	}
	
	
}
