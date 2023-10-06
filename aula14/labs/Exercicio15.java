package labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro lado");
		double ladoA = scan.nextDouble();
		System.out.println("Insira o segundo lado");
		double ladoB = scan.nextDouble();
		System.out.println("Insira o terceiro lado");
		double ladoC = scan.nextDouble();
		
		if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
			if (ladoA == ladoB && ladoB == ladoC && ladoA == ladoC) {
				System.out.println("Triângulo Equilátero");
			} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				System.out.println("Triângulo Isósceles");
			} else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é um triângulo");
		}
	}

}
