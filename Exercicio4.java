package Whilefor;

import java.util.Scanner;

public class Exercicio4 {
		private static int quantidade = 1;
		private static int valor, resultado, media;
		
		
		public static void main(String[] args) {
			
		for (int i = 1; i < 11; i++) {
			lerinforma��es();
			
		}
		calculainfo();
		}
		
		private static void calculainfo() {
			 media = resultado / 10;
			 System.out.println("M�dia: " + media);
			
		}


		private static void lerinforma��es() {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Nota " + quantidade);
			valor = entrada.nextInt();
			quantidade++;
			resultado += valor;
		}
}
