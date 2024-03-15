package Exercicios;

import java.util.Scanner;

public class Uni3Exe07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de latas de 350ml compradas: ");
		int qtdLata = scanner.nextInt();
		
		System.out.println("Informe a quantidade de garrafas de 600ml compradas: ");
		int qtdGarrafa600ml = scanner.nextInt();
		
		System.out.println("Informe a quantidade de garrafas de 2L compradas: ");
		int qtdGarrafa2L = scanner.nextInt();
		
		double litros = (qtdLata * 0.35) + (qtdGarrafa600ml * 0.60) + (qtdGarrafa2L * 2);
		
		System.out.println("A quantidade de litros de refrigerante comprada foi de " + litros + "L");
	}

}
