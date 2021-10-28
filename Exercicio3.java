package Whilefor;

import java.util.Scanner;

public class Exercicio3 {
	
	private static int valor;
	
	public static void main(String[] args) {

		lerinformações();
		processarinformações();
	}

	private static void processarinformações() {
		 for (int i = 1; i <= 10; i++) {
			 System.out.printf("%d * %d = %d \n", valor, i, valor * i);
		}
	}

	private static void lerinformações() {
		int valor2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 10");
		valor = entrada.nextInt();
		
		if ((valor >= 1) & (valor <= 10)) {
		}
		else {
			System.out.println("digite novamente");
				
		}
	}


			
}
