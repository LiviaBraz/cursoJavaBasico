package labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Digite um número inteiro:");
		numero = scan.nextInt();

		if (numero < 1000) {
			String numeroStr = String.valueOf(numero);
			int qtNumero = numeroStr.length();

			switch (qtNumero) {
			
				case 3: String centena = numeroStr.substring(0, 1);
						String dezena = numeroStr.substring(1, 2);
						String unidade = numeroStr.substring(2, 3);
						System.out.println(numeroStr + " = " + centena + " centena(s), " + dezena + " dezena(s), " + unidade + " unidade(s)");
				break;
				case 2: dezena = numeroStr.substring(0, 1);
	            		unidade = numeroStr.substring(1, 2);
	            		System.out.println(numeroStr + " = " + dezena + " dezena(s), " + unidade + " unidade(s)");
	            break;
				case 1: unidade = numeroStr.substring(0, 1);
	            		System.out.println(numeroStr + " = " + unidade + " unidade(s)");
	            break;
			}
        
		}
		
	}

}
