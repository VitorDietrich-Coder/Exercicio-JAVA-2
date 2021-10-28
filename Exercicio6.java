package Whilefor;

import java.util.Scanner;

public class Exercicio6 {
	private static int quantidade = 1;
	private static int esta = 0;
	private static int naoesta = 0;
	private static int valor;
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			lerinformações();
			
		}
		calculainfo();
		}

	private static void calculainfo() {
		System.out.println("Esta entre o intervalo " + esta);
		System.out.println("Não está entre o intervalo " +  naoesta);
	}

	private static void lerinformações() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Valor " + quantidade);
		valor = entrada.nextInt();
		quantidade++;
		if ((valor > 10) & (valor < 20)) {
			esta++;
		}
		else {
			naoesta++;
		}
		
	}
}


