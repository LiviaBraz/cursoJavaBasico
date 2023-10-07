package labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double preco = 0;
		
		System.out.println("Quantos litros comprará?");
		int litros = scan.nextInt();
		System.out.println("Qual combustível vai querer?");
		System.out.println("A - Álcool");
		System.out.println("G - Gasolina");
		String combustivel = scan.next();
		
		if (combustivel.equalsIgnoreCase("g")) {
			if (litros <= 20 && litros >= 0) {
				preco = litros * 2.5 - (2.5 * 0.04);
				
			} else if (litros > 20){
				preco = litros * 2.5 - (2.5 * 0.06);	
			}
		} else if (combustivel.equalsIgnoreCase("a")){ 
			if (litros <= 20 && litros >= 0) {
				preco = litros * 1.9 -(1.9 * 0.03);
				
			} else if (litros > 20){
				preco = litros * 1.9 -(1.9 * 0.05);
				
			}
		} else {
			System.out.println("Caracter inválido.");
		}
		
		System.out.printf("Você pagará: %.2f", preco);
		
	}

}
