package aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        do {
        	
            System.out.println("Informe a população do país A:");
            int populacaoA = validaInteiroPositivo(sc);

            System.out.println("Informe a taxa de crescimento do país A (em decimal, exemplo: 0.03 para 3%):");
            double taxaCrescimentoA = validaDouble(sc);

            System.out.println("Informe a população do país B:");
            int populacaoB = validaInteiroPositivo(sc);

            System.out.println("Informe a taxa de crescimento do país B (em decimal, por exemplo, 0.015 para 1.5%):");
            double taxaCrescimentoB = validaDouble(sc);

            int anos = 0;

            while (populacaoA < populacaoB) {
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++;
            }

            System.out.println("Número de anos necessários: " + anos);

            System.out.println("Deseja calcular novamente? (Digite 's' para sim, ou qualquer outra tecla para sair):");
        } while (sc.next().equalsIgnoreCase("s"));

        sc.close();
    }

    private static int validaInteiroPositivo(Scanner sc) {
        
    	int valor;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um valor inteiro positivo válido.");
                sc.next();
            }
            valor = sc.nextInt();
            if (valor <= 0) {
                System.out.println("Por favor, insira um valor inteiro positivo válido.");
            }
        } while (valor <= 0);
        return valor;
    }

    private static double validaDouble(Scanner sc) {
    	
        double valor;
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, insira um valor numérico válido.");
            sc.next();
        }
        valor = sc.nextDouble();
        return valor;
    }
		

}
