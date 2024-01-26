package labs;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado: ");
		double lado = scan.nextDouble();
		
		double area = lado * lado;
		
		System.out.println("O dobro da área é: \n" + area * 2);
		
	}

}
