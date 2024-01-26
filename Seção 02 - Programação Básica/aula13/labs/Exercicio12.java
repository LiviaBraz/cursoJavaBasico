package labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua altura: ");
		double altura = scan.nextDouble();
		
		double peso = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal seria: \n" + peso);	
		
	}

}
