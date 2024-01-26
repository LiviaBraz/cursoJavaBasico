package labs;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora: ");
		double salario = scan.nextDouble();
		System.out.println("Digite por quantas horas trabalhou: ");
		double hora = scan.nextDouble();
		
		double mes = hora * salario;
		
		System.out.println("Seu salário do mês é: \n" + mes);
		
	}

}
