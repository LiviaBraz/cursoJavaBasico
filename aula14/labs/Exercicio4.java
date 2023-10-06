package labs;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma letra (maiúscula)");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a") 
			|| letra.equalsIgnoreCase("e") 
			|| letra.equalsIgnoreCase("i") 
			|| letra.equalsIgnoreCase("o") 
			|| letra.equalsIgnoreCase("u")){
			System.out.println("É uma vogal");
		} else {
			System.out.println("É uma consoante");
		}
		
		switch(letra) {
		
			case "A":
			case "E": 
			case "I": 
			case "O": 
			case "U": System.out.println("É uma vogal");
			break;
			default: System.out.println("É uma consoante");
			
		}
		
	}

}
