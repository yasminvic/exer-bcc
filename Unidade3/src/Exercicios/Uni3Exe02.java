package Exercicios;

import java.util.Scanner;

public class Uni3Exe02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float precoSapato;
		float desconto;
		float precoComDesconto;
		
		System.out.println("Digite o pre�o do sapato:");
		precoSapato = scanner.nextFloat();
		
		desconto = precoSapato * 0.12f;
		precoComDesconto = precoSapato - desconto;
		
		System.out.println("O valor do desconto � de R$" + desconto);
		System.out.println("O pre�o do par de sapatos com desconto � R$" + precoComDesconto);
	}

}
