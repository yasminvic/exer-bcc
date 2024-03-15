package Exercicios;

import java.util.Scanner;

public class Uni3Exe06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float precoKg = 25.0f;
		float pesoPrato = 0.75f;
		float pratoMontado;
		
		System.out.println("Digite o peso do prato montado por você, em Kg: ");
		pratoMontado = scanner.nextFloat();
		
		float precoTotal = (pratoMontado - pesoPrato) * precoKg;
		
		System.out.println("O valor a ser pago será de R$" + precoTotal);
		
	}

}
