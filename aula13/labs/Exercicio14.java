package labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		double peso = scan.nextDouble();
		
		if (peso > 50.0) {
			
			boolean excesso = true;
			double multa = (peso - 50.0) * 4.0;
			System.out.println("Excesso = " + excesso);
			System.out.println("Valor da multa: " + multa);
			
		} else {
	
			String excesso = "ZERO";
			System.out.println("Excesso = " + excesso);
			
		}
		
	}

}
