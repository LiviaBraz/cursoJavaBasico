package aula17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre zero e dez:");
		int nota = scan.nextInt();
		
		do {
			System.out.println("Valor inválido. Digite novamente:");
			nota = scan.nextInt();
		} while (nota < 0 || nota > 10);
		
		System.out.println("Valor válido!");
		
		scan.close();
	}

}
