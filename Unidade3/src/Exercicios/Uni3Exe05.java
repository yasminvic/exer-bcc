package Exercicios;

import java.util.Scanner;

public class Uni3Exe05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qtdFrangos;
		
		System.out.print("Digite a quantidade de frangos que há em sua granja: ");
		qtdFrangos = scanner.nextInt();
		
		float custo = qtdFrangos * 11;
		
		System.out.println("O gasto total da granja para marcar todos os seus frangos foi de R$" + custo);
	}

}
