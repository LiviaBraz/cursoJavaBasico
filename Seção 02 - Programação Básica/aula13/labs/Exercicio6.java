package labs;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		double raio = scan.nextDouble();
		
		double area = 3.14 * (raio * raio);
		
		System.out.println("Valor da área: \n" + area);
		
	}

}
