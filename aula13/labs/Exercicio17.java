package labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho (em metros quadrados) da área a ser pintada: ");
		double area = scan.nextDouble();
	
		double litrosLata = 18;
		double precoLata = 80.0;
		double litrosGalao = 3.6;
		double precoGalao = 25.0;
		
		double litros = area / 6;
		
		double qtdLatas = (int)Math.ceil(litros / litrosLata);
		double custoLata = precoLata * qtdLatas;
		
		double qtdGalao = (int)Math.ceil(litros / litrosGalao);
		double custoGalao = precoGalao * qtdGalao;
		
		System.out.printf("Quantidade de litros necessários: %.0f", litros);
		System.out.printf("\nQuantidade de latas de 18L = %.0f e valor gasto %.2f" , qtdLatas, custoLata);
		System.out.printf("\nQuantidade de galão de 3,6L = %.0f e valor gasto %.2f" , qtdGalao, custoGalao);
		
		double mixLata = (int)(litros / litrosLata);
		double mixGalao = (int)((litros - (mixLata * litrosLata)) / litrosGalao);
		
		if (litros - (mixLata * litrosLata) % litrosGalao != 0) {
			mixGalao += 1;
		}
		
		double custoMix = (mixLata * precoLata) + (mixGalao * precoGalao);
		
		System.out.printf("\nMix de latas e galões:");
		System.out.printf("\nQuantidade de latas = %.0f e quantidade de galões = %.0f, valor gasto %.2f" , mixLata, mixGalao, custoMix);
		
	} 

}
