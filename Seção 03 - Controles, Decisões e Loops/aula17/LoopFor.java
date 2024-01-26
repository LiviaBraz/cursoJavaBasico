package aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		
		//for normal
		for (int i=0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		for (int i=5; i > 0; i--) {
			System.out.println("i tem valor: " + i);
		}
		
		//for com mais de uma variável
		for (int i=0, j=10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		// partes ausentes
		
		int count = 0;
		
		for (; count < 10; ) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		// loop infinito = for (; ;);
		
		// loop sem corpo
		
		int soma = 0;
		
		for (int i=1; i < 5; soma += i++);
		System.out.println("O valor da soma é: " + soma);
		
		//o for pode ser usado sem as chaves {}, mas é recomendado que use as mesmas ;)
	
	}

}
