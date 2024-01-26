package labs;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		 	Scanner scan = new Scanner(System.in);

	        System.out.print("Digite a quantidade de morangos (kg): ");
	        int morangos = scan.nextInt();

	        System.out.print("Digite a quantidade de maçãs (kg): ");
	        int macas = scan.nextInt();

	        double precoMorango1 = morangos * 2.50;
	        double precoMorango2 = morangos * 2.20;

	        double precoMaca1 = macas * 1.80;
	        double precoMaca2 = macas * 1.50;

	        System.out.println("Quantidade de maçãs: " + macas);
	        System.out.println("Quantidade de morangos: " + morangos);

	        double precoTotal = precoMaca1 + precoMorango1;

	        if (morangos > 5) {
	            precoTotal = precoMorango2;
	        }

	        if (macas > 5) {
	            precoTotal += precoMaca2;
	        }

	        if (precoTotal > 25 || (macas + morangos) > 8) {
	            precoTotal *= 0.9;
	        }

	        System.out.printf("Preço final: %.2f", precoTotal);
	    }
		
}
