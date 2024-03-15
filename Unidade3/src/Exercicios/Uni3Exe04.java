package Exercicios;

import java.util.Scanner;

public class Uni3Exe04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		
		System.out.println("Digite a primeira nota do aluno (peso 5): ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a primeira nota do aluno (peso 3): ");
		nota2 = scanner.nextFloat();
		
		System.out.println("Digite a primeira nota do aluno (peso 2): ");
		nota3 = scanner.nextFloat();
		
		float soma = (nota1 * 5) + (nota2 * 3) + (nota3 * 2);
		float media = soma / 3;
		
		System.out.println("A média ponderada desse aluno é " + media);
	}

}
