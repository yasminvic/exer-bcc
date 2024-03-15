package Exercicios;

import java.util.Scanner;

public class Uni3Exe09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio da lata: ");
		float raio = scanner.nextFloat();
		
		System.out.println("Digite a altura da lata: ");
		float altura = scanner.nextFloat();
		
		double volume = 3.14 * (raio*raio) * altura;
		
		System.out.println("O volume da lata é " + volume);

	}

}
