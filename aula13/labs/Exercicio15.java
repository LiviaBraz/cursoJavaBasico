package labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto ganha por hora e o número de horas trabalhadas no mês");
		double salario = scan.nextDouble();
		int horas = scan.nextInt();
		
		double salarioBruto = salario * horas;
		double inss = (salarioBruto / 100) * 8.0;
		double sindicato = (salarioBruto / 100) * 5.0;
		double imposto = (salarioBruto / 100) * 11.0;
		double descontos = (inss + sindicato + imposto);
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto : " + salarioBruto);
		System.out.println("Pago ao INSS: " + inss);
		System.out.println("Pago ao sindicato: " + sindicato);
		System.out.println("Pago Imposto de Renda: " + imposto);
		System.out.println("Total de descontos: " + descontos);
		System.out.println("Salário Líquido: " + salarioLiquido);
		
	}

}
