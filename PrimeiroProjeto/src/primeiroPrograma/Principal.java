package primeiroPrograma;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		String sobrenome = in.nextLine();
		
		System.out.printf("Olá senhor(a) %s %s!\n Até logo!", nome,sobrenome);
		//Comentário incrivelmente relevante para o programa

	}

}
