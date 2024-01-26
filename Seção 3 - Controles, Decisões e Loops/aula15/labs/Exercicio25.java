package labs;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int classificacao = 0;
		
		System.out.print("Telefonou para a vítima? (S ou N)");
	    String resposta = scan.nextLine();
	    
	    if (resposta.equalsIgnoreCase("S")) {
	    	classificacao++;
	    }
		
	    System.out.println("Esteve no local do crime? (S ou N)");
	    resposta = scan.nextLine();
	    
	    if (resposta.equalsIgnoreCase("S")) {
	    	classificacao++;
	    }
	    
		System.out.println("Mora perto da vítima? (S ou N)");
		resposta = scan.nextLine();
	    
	    if (resposta.equalsIgnoreCase("S")) {
	    	classificacao++;
	    }
	    System.out.println("Devia para a vítima? (S ou N)");
	    resposta = scan.nextLine();
	    
	    if (resposta.equalsIgnoreCase("S")) {
	    	classificacao++;
	    }
	    System.out.println("Já trabalhou com a vítima? (S ou N)");
	    resposta = scan.nextLine();
	    
	    if (resposta.equalsIgnoreCase("S")) {
	    	classificacao++;
	    }
		
	    switch(classificacao) {
	    
    		case 1: System.out.println("Inocente");
    		break;
    		case 2: System.out.println("Suspeita");
    		break;
    		case 3:
    		case 4: System.out.println("Cúmplice");
    		break;
    		case 5: System.out.println("Assassino");
    		break;
    		
	    }
	}

}
