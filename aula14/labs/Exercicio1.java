package labs;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira dois números");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("O maior é: " + numero1);
		} else if (numero2 > numero1) {
			System.out.println("O maior é: " + numero2);
		} else {
			System.out.println("Números iguais :]");
		}
	}

}
