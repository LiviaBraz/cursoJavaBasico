package aula17;

import java.util.Scanner;

public class Exercicio03 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Leitura e validação do nome
        String nome;
        do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        // Leitura e validação da idade
        int idade;
        do {
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        // Leitura e validação do salário
        double salario;
        do {
            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // Leitura e validação do sexo
        char sexo;
        do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        // Leitura e validação do estado civil
        char estadoCivil;
        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v' ou 'd'): ");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        // Exibição das informações validadas
        System.out.println("\nInformações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
