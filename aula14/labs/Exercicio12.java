package labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto ganha por hora e o número de horas trabalhadas no mês");
		double salario = scan.nextDouble();
		int horas = scan.nextInt();
		
		double imposto;
		int percentual;
		
		double salarioBruto = salario * horas;
		double fgts = (salarioBruto / 100) * 11.0;
		double inss = (salarioBruto / 100) * 10.0;
		
		if(salarioBruto <= 900) {
			percentual = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentual = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentual = 10;
		} else {
			percentual = 20;
		}
		
		imposto = (salarioBruto / 100) * percentual;

		double descontos = (inss + imposto);
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto : " + salarioBruto);
		System.out.println("IR : " + imposto);
		System.out.println("INSS (10%) : " + inss);
		System.out.println("FGTS (11%) : " + fgts);
		System.out.println("Total de descontos: " + descontos);
		System.out.println("Salário Líquido: " + salarioLiquido);
		
		
	}

}
