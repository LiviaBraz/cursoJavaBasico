package labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois números inteiros: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		System.out.println("Informe um número real: ");
		double numero3 = scan.nextDouble();
		
		int produto = (numero1 * 2) + (numero2 / 2);
		double soma = (numero1 * 3) + numero3;
		double cubo = numero3 * numero3 * numero3;
		
		System.out.println("Os resultados são: \n");
		System.out.println("O produto do dobro do 1º com metade do 2º: \n" + produto);
		System.out.println("A soma do triplo do 1º + 3º: \n" + soma);
		System.out.println("3º número ao cubo: \n" + cubo);
		
	}

}
