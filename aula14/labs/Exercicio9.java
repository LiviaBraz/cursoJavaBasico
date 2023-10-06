package labs;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira três números");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double numero3 = scan.nextDouble();
		
		System.out.println("");
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			System.out.printf("" + numero3 + "\n" + numero2 + "\n"+ numero1);
		} else if (numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
			System.out.printf("" + numero2 + "\n" + numero3 + "\n" + numero1);
		} else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3){
			System.out.printf("" + numero3 + "\n" + numero1 + "\n" + numero2);
		} else if (numero2 > numero1 && numero2 > numero3 && numero1 < numero3){
			System.out.printf("" + numero1 + "\n" + numero3 + "\n" + numero2);
		} else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2){
			System.out.printf("" + numero2 + "\n" + numero1 + "\n" + numero3);
		} else if (numero3 > numero1 && numero3 > numero3 && numero1 > numero2){
			System.out.printf("" + numero1 + "\n" + numero2 + "\n" + numero3);
		} 
		 
	}

}
