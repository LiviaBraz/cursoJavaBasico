package labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho (em metros quadrados) da área a ser pintada: ");
		double area = scan.nextDouble();
		
		double qtdLatas = (area/54);
		double preco = 80.0;
		double total = 0;
		
		qtdLatas = (int)Math.ceil(qtdLatas);
		total = (qtdLatas * preco);
		
		
		System.out.printf("Voce precisa de %.1f latas e custará %.2f reais." , qtdLatas, total);
		
	}

}
