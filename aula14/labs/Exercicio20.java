package labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println("Insira a segunda nota");
		double nota2 = scan.nextDouble();
		System.out.println("Insira a terceira nota");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3.0;
	
		if (media >= 7.0 && media < 10.0) {
			System.out.println("Aprovado :]");
		} else if (media == 10.0) {
			System.out.println("Aprovado com Distinção");
		} else {
			System.out.println("Reprovado");
		}
	}

}
