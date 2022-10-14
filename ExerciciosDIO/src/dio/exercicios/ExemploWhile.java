package dio.exercicios;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

	public static void main(String[] args) {
		double mesada = 50.0;
		System.out.printf("Mesada: R$%.2f %n" , mesada);
		while(mesada > 0) {
			double valorDoce = valorAleatorio();
			if(valorDoce > mesada)
				valorDoce = mesada;
			
			System.out.printf("Doce do valor R$%.2f %n" , valorDoce , " adicionado ao carrinho");
			mesada = mesada - valorDoce;
		}
		System.out.printf("Mesada: R$%.2f" , mesada);
		System.out.println("\nJoãozinho gastou toda a sua mesada em doces");

	}

	private static double valorAleatorio() {		
		return ThreadLocalRandom.current().nextDouble(2,15);
	}

}
