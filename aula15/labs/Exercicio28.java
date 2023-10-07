package labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("O que você deseja comprar? Digite o código do produto:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha\n");
        int tipo = scan.nextInt();

        System.out.print("Digite a quantidade: ");
        int qtd = scan.nextInt();

        System.out.print("A compra será realizada com cartão Tabajara? (1 para SIM, 2 para NÃO): ");
        int resposta = scan.nextInt();

        String carne = "";
        double preco = 0.0;

        if (tipo == 1) {
            carne = "File Duplo";
            if (qtd <= 5) {
                preco = qtd * 4.90;
            } else {
                preco = qtd * 5.80;
            }
        } else if (tipo == 2) {
            carne = "Alcatra";
            if (qtd <= 5) {
                preco = qtd * 5.90;
            } else {
                preco = qtd * 6.80;
            }
        } else if (tipo == 3) {
            carne = "Picanha";
            if (qtd <= 5) {
                preco = qtd * 6.90;
            } else {
                preco = qtd * 7.80;
            }
        }

        String r = "";
        double total = 0.0;

        if (resposta == 1) {
            r = "SIM";
            double desconto = (preco * 5) / 100;
            total = preco - desconto;
        } else {
            r = "NAO";
            total = preco;
        }

        System.out.println("\n***************************CUPOM FISCAL**************************************");
        System.out.println("* Carne.......................................................... " + carne);
        System.out.println("* Quantidade..................................................... " + qtd + " KG ");
        System.out.println("* Preço......................................................... " + String.format("%.2f", preco) + " R$ ");
        System.out.println("* Cartao Tabajara................................................ " + r);
        System.out.println("* Total com desconto............................................ " + String.format("%.2f", total) + " R$ ");
        System.out.println("******************************************************************************");
    }
	
}

