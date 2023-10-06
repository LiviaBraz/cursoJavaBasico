package labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println("Insira a segunda nota");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2.0;
		String conceito = "X";
		
		System.out.println("\nPrimeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Média: " + media);
		
		
		
		if (media >= 9.0 && media <= 10.0) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9.0) {
			conceito = "B";
		} else if (media >= 6.0 && media < 7.5) {
			conceito = "C";
		}else if (media >= 4.0 && media < 6.0) {
			conceito = "D";
		}else {
			conceito = "E";
		}
		
		System.out.println("Conceito: " + conceito);
		
		switch (conceito) {
			
			case "A":
			case "B":
			case "C": System.out.println("APROVADO");
			break;
			case "D":
			case "E": System.out.println("REPROVADO");
			break;
		
		}
		
	}

}
