package labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do saque:");
		double valor = scan.nextDouble();
		
		if (valor >= 10 && valor <=600) {
			
			int nota100, nota50, nota10, nota5, nota1;
	        
	        nota100 = (int) (valor / 100);
	        valor -= 100 * nota100;

	        nota50 = (int) (valor / 50);
	        valor -= 50 * nota50;

	        nota10 = (int) (valor / 10);
	        valor -= 10 * nota10;

	        nota5 = (int) (valor / 5);
	        valor -= 5 * nota5;

	        nota1 = (int) (valor / 1);
	        valor -= 1 * nota1;

	        System.out.println("Você receberá:");
	        System.out.println(nota100 + " nota(s) de R$ 100.00");
	        System.out.println(nota50 + " nota(s) de R$ 50.00");
	        System.out.println(nota10 + " nota(s) de R$ 10.00");
	        System.out.println(nota5 + " nota(s) de R$ 5.00");
	        System.out.println(nota1 + " nota(s) de R$ 1.00");

		} else {
			System.out.println("Valor inválido. O saque só é válido com valores entre 10 e 600 reais.");
		}
		
	}

}