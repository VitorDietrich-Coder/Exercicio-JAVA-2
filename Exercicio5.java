package Whilefor;

import java.util.Scanner;

public class Exercicio5 {
	private static int quantidade = 1;
	private static int par = 0;
	private static int inpar = 0;
	private static int valor;
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			lerinformações();
			
		}
		calculainfo();
		}

	private static void calculainfo() {
		System.out.println("Par: " + par);
		System.out.println("Inpar: " + inpar);
	}

	private static void lerinformações() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nota " + quantidade);
		valor = entrada.nextInt();
		quantidade++;
		
		if (valor % 2 == 0) {
			par++;
		}
		else {
			inpar++;
		}
	}
		

}
