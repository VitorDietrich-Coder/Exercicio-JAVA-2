package Whilefor;

import java.util.Scanner;

public class Exercicio7 {
	private static int valor, verificar;
	public static void main(String[] args) {
		
		lerinformações();
		
		while (!(verificar >= 12) & (verificar <= 20)) {
			
			lerinformações();
		}
	}


	private static void lerinformações() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Valor ");
		valor = entrada.nextInt();
		verificar = valor;
		if ((valor >= 12) & (valor <= 20)) {
			System.out.println("Valor: " + valor);
		}
		else{
			System.out.println("Entrada inválida");
		}
			
		
		
	}
}

