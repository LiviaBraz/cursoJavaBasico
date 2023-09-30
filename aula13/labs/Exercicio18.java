package labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo (em MB): ");
		double tamanho = scan.nextDouble();
		System.out.println("Digite a velocidade do link (em Mbps): ");
		double velocidade = scan.nextDouble();
		
		double tempoDownload = tamanho / velocidade;
		
		System.out.println("O tempo aproximado de download será de " + tempoDownload + " minutos");
		
	}

}
