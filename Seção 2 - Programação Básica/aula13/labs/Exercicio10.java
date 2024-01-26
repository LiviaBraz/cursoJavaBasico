package labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Cº: ");
		double celsius = scan.nextDouble();
		
		double farenheit = ((celsius * 9) / 5) + 32;
		
		System.out.println("Valor em ºF: \n" + farenheit);	
		
	}

}
