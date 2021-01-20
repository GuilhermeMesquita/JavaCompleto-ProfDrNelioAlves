package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class EncapsulamentoProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
	
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		System.out.println(product.toString());
	
	}

}
