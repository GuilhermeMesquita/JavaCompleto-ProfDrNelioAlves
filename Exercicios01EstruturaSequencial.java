import java.util.Scanner;


public class ListaDeExercicios1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,soma,difA,difB,difC,difD,dif,num,hour,cod,quant,cod2,quant2;
		double  pi, area, raio,formula,perHour,totSal,valUni,valUni2,totalCompra;
		
		//Soma
		a = scan.nextInt();
		b = scan.nextInt();
		soma = a+b;
		//Fim Soma
		
		//Área do Círculo
		raio = scan.nextDouble();
		pi = 3.14159;
		area = pi * raio * raio;
		//Fim Área do Círculo
		
		//Diferença
		difA = scan.nextInt();
		difB = scan.nextInt();
		difC = scan.nextInt();
		difD = scan.nextInt();

		dif = (difA * difB - difC * difD);
		//Fim diferença
		
		//Horas trabalhadas
		num = scan.nextInt();
		hour = scan.nextInt();
		perHour = scan.nextDouble();
		totSal = hour * perHour;
		//Fim Horas trabalhadas
		
		//Lojinha
		cod = scan.nextInt();
		quant = scan.nextInt();
		valUni = scan.nextDouble();
		
		
		cod2 = scan.nextInt();
		quant2 = scan.nextInt();
		valUni2 = scan.nextDouble();
		totalCompra = (quant * valUni + (quant2 * valUni2));
		//Fim lojinha

		
		
		
		//Output
		System.out.println("1. O resultado da soma de A e B é: " + soma);
		System.out.printf("2. A área do círculo é: %.4f%n", area);
		System.out.printf("3. A diferença é:" + dif + "%n");
		System.out.printf("4. NUMBER = %d%n4. SALARY = %s%n",num,totSal);
		System.out.println("5. VALOR A PAGAR = R$ " + totalCompra);
		//Fim do Output


	}

}
