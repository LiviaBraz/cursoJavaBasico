package labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Informe seu sexo: (F ou M)");
		String sexo = scan.next();
		
		if (sexo == "F"){
			
			double pesoIdeal = (62.1 * altura) - 44.7;
			
			System.out.println("Digite seu peso:");	
			double peso = scan.nextDouble();
			
			if (peso >= pesoIdeal){
				
				System.out.println("Voce está acima do peso");
			
			} else if (peso < pesoIdeal){
				
				System.out.println("Voce está abaixo do peso");
			
			} else {
				
					System.out.println("Voce tem o peso ideal :]");
				
			}
			
		} else {
			
			double pesoIdeal = (72.7 * altura) - 58;
			
			System.out.println("Digite seu peso:");	
			double peso = scan.nextDouble();
			
			if (peso >= pesoIdeal){
				
				System.out.println("Voce está acima do peso");
			
			} else if (peso <= pesoIdeal){
				
				System.out.println("Voce está abaixo do peso");
			
			} else {
				
					System.out.println("Voce tem o peso ideal :]");
				
			}
			
		} 
		
	}

}
