package labs;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		double resultado = 0;
		
		System.out.println("Digite um número");
		double numero1 = scan.nextDouble();
		System.out.println("Digite outro número");
		double numero2 = scan.nextDouble();
		
		System.out.println("\n\nQual operação deseja fazer?");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Sair");
		int menu = scan.nextInt();
		
		switch(menu){
		
			case 1:
				resultado = numero1 + numero2;
				System.out.println("O resultado é: " + resultado);
				Thread.sleep(1000);
			break;
			
			case 2:
				resultado = numero1 - numero2;
				System.out.println("O resultado é: " + resultado);
				Thread.sleep(1000);
			break;
			
			case 3:
				resultado = numero1 * numero2;
				System.out.println("O resultado é: " + resultado);
				Thread.sleep(1000);
			break;
	
			case 4:
				resultado = numero1 / numero2;
				System.out.println("O resultado é: " + resultado);
				Thread.sleep(1000);
			break;
			
		}		
		if (resultado % 2 == 0) {
			System.out.println("\nPar.");
		} else {
			System.out.println("\nImpar.");
		}
		
		if (resultado > 0) {
			System.out.println("Positivo.");
		} else if (resultado < 0) {
			System.out.println("Negativo.");
		} else {
			System.out.println("Este número é 0 :]");
		}
		
		if (resultado % 1 == 0) {
			System.out.println("Inteiro.");
		} else {
			System.out.println("Decimal.");
		}
		
	}

}
