package aula17;

public class Exercicio06 {

	public static void main(String[] args) {
	
		int numeros = 20;
	
		System.out.println("Um abaixo do outro: ");
		for (int i=1; i <= numeros; i++) {
			System.out.println(i);
		}
	
		System.out.println("Lado a lado: ");
		for (int i=1; i <= numeros; i++) {
			System.out.print(" " + i);
		}
	}
}