package labs;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço de três produtos: ");
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		double valor3 = scan.nextDouble();
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.printf("Você deveria comprar o primeiro, o valor é de R$R$%.2f", valor1);
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.printf("Você deveria comprar o segundo, o valor é de R$R$%.2f", valor2);
		} else if (valor3 < valor1 && valor3 < valor2){
			System.out.printf("Você deveria comprar o terceiro, o valor é de R$%.2f", valor3);
		}
		
	}

}
