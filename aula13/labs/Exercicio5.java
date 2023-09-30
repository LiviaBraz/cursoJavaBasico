package labs;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println("Valor em centímetros: \n" + centimetros);
		
	}

}
