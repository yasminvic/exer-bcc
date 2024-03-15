package Exercicios;

import java.util.Scanner;

public class Uni3Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		float largura;
		float comprimento;
		
		System.out.println("Digite a largura do terreno:");
		largura = scanner.nextFloat();
		
		System.out.println("Digite o comprimento do terreno:");
		comprimento = scanner.nextFloat();
		
		float area = largura * comprimento;
		
		System.out.println("A área do seu terreno é: " + area);
		

	}

}
