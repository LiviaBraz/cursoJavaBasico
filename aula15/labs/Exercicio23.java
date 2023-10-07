package labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = scan.nextDouble();
		
		if (numero % 1 == 0) {
			System.out.println("Inteiro");
		} else {
			System.out.println("Decimal");
		}
		
	}

}
