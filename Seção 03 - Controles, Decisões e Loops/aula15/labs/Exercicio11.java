package labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salario, aumento, novoSalario;
		int percentual;
		
		System.out.println("Digite o valor do salário: ");
		salario = scan.nextDouble();
		
		if (salario <= 280.0) {			
			percentual = 20;
		} else if (salario > 280.0 && salario < 700.0) {		
			percentual = 15;
		}else if (salario >= 700.0 && salario < 1500.0) {			
			percentual = 10;
		} else {			
			percentual = 5;
		}
		
		aumento = (salario / 100) * percentual;
		novoSalario = salario + aumento;
		
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual do aumento: " + percentual);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Novo salário: " + novoSalario);
		
		
	}

}
