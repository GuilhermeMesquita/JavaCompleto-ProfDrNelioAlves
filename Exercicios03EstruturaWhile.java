package curso_java;

import java.util.Scanner;

public class Exercicios03EstruturaWhile {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 01 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob
		 * /master/src/uri1114.java Escreva um programa que repita a leitura de
		 * uma senha at� que ela seja v�lida. Para cada leitura de senha
		 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a
		 * senha for informada corretamente deve ser impressa a mensagem
		 * "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta � o valor 2002.
		 */

		int pass; // Exercicio 1
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		pass = sc.nextInt();

		while (pass != 2002) {
			System.out.println("Senha inv�lida!");
			pass = sc.nextInt();

		}
		System.out.println("Acesso permitido!");
		

		/*
		 * Exerc�cio 02 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob
		 * /master/src/uri1115.java Escreva um programa para ler as coordenadas
		 * (X,Y) de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
		 * O algoritmo ser� encerrado quando pelo menos uma de duas coordenadas
		 * for NULA (nesta situa��o sem escrever mensagem alguma)
		 */
		double x;
		double y;
		String quadrante = null;
		
	    System.out.println("Digite uma coordenada para X: ");
	    x=sc.nextDouble();
	    System.out.println("Digite uma coordenada para Y: ");
	    y=sc.nextDouble();
	    
	    

	    while(x != 0 && y != 0){
	    	if(x > 0 && y > 0 ){
		    	quadrante = "primeiro";
		    } else if(x < 0 && y > 0){
		    	quadrante = "segundo";
		    } else if(x < 0 && y < 0){
		    	quadrante = "terceiro";
		    } else {
		    	quadrante = "quarto";
		    }
	    	System.out.println("Coordenada X: " + x);
	    	System.out.println("Coordenada Y: " + y);
	    	System.out.println("Pertence ao " + quadrante + " quadrante.");
	    	System.out.println("Digite uma coordenada para X: ");
		    x=sc.nextDouble();
		    System.out.println("Digite uma coordenada para Y: ");
		    y=sc.nextDouble();
	    }
	    System.out.println("Valor NULO! favor reiniciar o programa");
	    
	    /*Exerc�cio 03
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java
Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva 
um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� 
que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme 
exemplo.*/
	    int escolha;
	    int ia = 0;
	    int ig = 0;
	    int id = 0;
	    System.out.println("Exerc�cio 3 - Escolha um produto(de 1 a 4): ");
	    escolha = sc.nextInt();
	    while(escolha < 1 || escolha > 4){
	    	System.out.println("Favor escolher entre 1 a 4!");
	    	escolha = sc.nextInt();
	    } 
	    while(escolha >= 1 && escolha <= 3){
	    	if(escolha == 1){
	    		ia+=1;
	    		System.out.println("Servi�o escolhido -> 1.�lcool");
	    	    System.out.println("Exerc�cio 3 - Escolha um produto(de 1 a 4): ");
	    		escolha = sc.nextInt();
	    	} else if(escolha == 2){
	    		System.out.println("Servi�o escolhido -> 2.Gasolina");
	    		System.out.println("Exerc�cio 3 - Escolha um produto(de 1 a 4): ");
	    		ig+=1;
	    		escolha = sc.nextInt();
	    	} else if(escolha == 3){
	    		System.out.println("Servi�o escolhido -> Diesel");
	    		System.out.println("Exerc�cio 3 - Escolha um produto(de 1 a 4): ");
	    		id+=1;
	    		escolha = sc.nextInt();
	    	} 
	    }
	    
	    if(escolha == 4){
	    System.out.println("MUITO OBRIGADO - Total de Servi�os escolhidos: ");
		System.out.println("1. �lcool: " + ia);
		System.out.println("2. Gasolina: " + ig);
		System.out.println("3. Diesel: " + id);
	    } 
	}

}
