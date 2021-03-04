package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o valor na posição " + i + ": ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		System.out.printf("A Média Aritmética é: %.2f", sum / n);
		sc.close();
	}

}
