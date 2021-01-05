import java.util.Scanner;
public class Exercicios04EstruturaFor {

	public static void main(String[] args) {
		/*Exerc�cio 01
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o 
X, se for o caso.*/
		
		int num = 0;
		int impares = 0;
		
		System.out.println("1. Digite o n�mero para visualizar a quantidade de n�meros �mpares: ");
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++){
			if(i%2 != 0){
				impares += 1;
				System.out.println("N�mero �mpar detectado: " + i );
			}
		}
		System.out.println("1. Total de n�meros �MPARES: " + impares);
		
		
		/*Exerc�cio 02
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java
Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando 
essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)*/
		int n = 0;
		int in = 0;
		int out = 0;
		int numero = 0;
		
		System.out.println("2. Digite a quantidade de n�meros � serem percorridos: ");
		n = sc.nextInt();
		for(int x = 1; x<=n; x++){
			System.out.println("Digite o " + x + "� n�mero:");
			numero = sc.nextInt();
			if(numero>=10 && numero<=20){
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println("2. "+ in + " in");
		System.out.println("2. "+ out + " out");
		
		/*Exerc�cio 03
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java
Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5.*/
		int valN;
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		int repeticao;
		double nota1;
		double nota2;
		double nota3;
		int volta =0;
		
		
		System.out.println("3. Digite a quantidade de casos de teste: ");
		valN = sc.nextInt();
		
		for(int i=0; i<valN; i++){
			System.out.println("\nDigite as tr�s notas: ");
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			volta+=1;
			System.out.println("3. " + volta +"�" + "M�dia ponderada: ");
			double expressaoFinal = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
			System.out.printf("%.2f", expressaoFinal);
			
		}
		
		/*Exerc�cio 04
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java
Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
		
		int numDiv1;
		double numDiv2;
		double qtdDiv;
		System.out.println("\n4. Digite a quantidade de voltas, para divis�o: ");
		qtdDiv = sc.nextInt();
		
		
		for(int i = 0; i < qtdDiv; i++){
			System.out.println("\n4. Digite o primeiro n�mero para divis�o: ");
			numDiv1 = sc.nextInt();
			System.out.println("\n4.Digite o segundo n�mero para divis�o: ");
			numDiv2 = sc.nextInt();
			if(numDiv1 < 0 && (numDiv2 == 0 || numDiv2 < 0)){
				System.out.println("divis�o imposs�vel");
			}
				else {
				System.out.printf("%.1f", numDiv1/numDiv2);
			}
		}
		
		/*Exerc�cio 05
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por defini��o, fatorial de 0 � 1.*/
		
		int fatN = 1;
		int qtdFat;
		System.out.println("\n5. Digite o n�mero a ser fatorado: ");
		qtdFat = sc.nextInt();

		for(int i = 1; i <= qtdFat; i++){
			fatN = fatN * i;
		}
		System.out.println("\n5. Valor de sa�da: " + fatN);
		
		/*Exerc�cio 06
		Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java
		Ler um n�mero inteiro N e calcular todos os seus divisores*/
			
			int numInt;
			System.out.println("\n6. Digite um n�mero para ver seus divisores: ");
			numInt = sc.nextInt();
			
			for(int i = 1; i<= numInt; i++){
				if(numInt % i == 0){
					System.out.println("\nDivisor: " + i);
				}
			}
		/*Exerc�cio 07
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java
Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas, 
come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.*/
			
			int numPos;
			System.out.println("\n7. Digite um n�mero inteiro positivo: ");
			numPos = sc.nextInt();
			
			for(int i = 1; i<= numPos; i++){
				System.out.printf("%.1f", (Math.pow(i, 1)));
				System.out.printf("%.1f", (Math.pow(i, 2)));
				System.out.printf("%.1f", (Math.pow(i, 3)));
				System.out.print("\n");
			}
	}
	


}
