package labs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
 
        System.out.println("Insira a data:");
        String dataInserida = scan.next();

        try {
            Date data = sdf.parse(dataInserida);
            System.out.println("A data é válida.");
        } catch(ParseException e) {
            System.out.println("A data é inválida.");
        }
	}

}
