package aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Usuário:");
		String user = scan.nextLine();
		System.out.println("\nSenha:");
		String senha = scan.nextLine();
		
		do {
			System.out.println("\nDados inválidos!\nInsira novamente.\n");
			System.out.println("Usuário:");
			user = scan.nextLine();
			System.out.println("\nSenha:");
			senha = scan.nextLine();
		} while (user == senha);
		
		System.out.println("\nUsuário criado com sucesso!");
	
		scan.close();
	}

}
