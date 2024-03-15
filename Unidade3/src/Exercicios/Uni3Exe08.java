package Exercicios;

import java.util.Scanner;

public class Uni3Exe08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float cotacaoDolar = 5.0f;
		
		System.out.println("Digite o valor em doláres que deseja converter: ");
		float valorDolar = scanner.nextFloat();
		
		float reais = valorDolar * cotacaoDolar;
		
		System.out.println("O valor a ser devolvido em reais é R$" + reais);
	}

}
