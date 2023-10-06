package labs;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double numero = scan.nextDouble();
		
		if (numero > 0) {
			System.out.println("Este número é positivo.");
		} else if (numero < 0) {
			System.out.println("Este número é negativo.");
		} else {
			System.out.println("Este número é 0 :]");
		}
		
	}

}
