package labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double delta = 0;
		double x1, x2;
		
		System.out.println("Insira o valor a");
		double a = scan.nextDouble();
		
		if (a != 0) {
			System.out.println("Insira o valor b");
			double b = scan.nextDouble();
			System.out.println("Insira o valor c");
			double c = scan.nextDouble();
			
			delta = (Math.pow(b, 2)) + (-4 * (a * c));
			
			if (delta > 0.0) {
				x1 = ((-(b) + Math.sqrt(delta))/ 2 * a);
				x2 = ((-(b) - Math.sqrt(delta))/ 2 * a);
				System.out.println("As raízes são:" + x1 + " e " + x2);
			} else if (delta == 0){
				x1 = ((-(b) + Math.sqrt(delta))/ 2 * a);
				System.out.println("A raíz deste número é: " + x1);
			} else {
				System.out.println("A equação não possui raízes reais.");
			}
		
		} else {
			System.out.println("A equação não é de segundo grau.");;
		}
		
	}

}
