package Exercicios;

import java.util.Scanner;

public class Uni3Exe03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float precoGasolina;
		float precoTotal;
		float litros;
		
		System.out.println("Digite o preço do litro da gasolina: ");
		precoGasolina = scanner.nextFloat();
		
		System.out.println("Digite o valor a ser pago pelo abastecimento: ");
		precoTotal = scanner.nextFloat();
		
		litros = precoTotal / precoGasolina;
		
		System.out.println("Você conseguiu colocar " + litros + " litros no tanque.");
	}

}
