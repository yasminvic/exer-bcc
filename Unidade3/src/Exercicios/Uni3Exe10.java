package Exercicios;

import java.util.Scanner;

public class Uni3Exe10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor de um dos catetos: ");
		float cateto1 = scanner.nextFloat();

		System.out.println("Informe o valor do outro cateto: ");
		float cateto2 = scanner.nextFloat();

		double hipotenusa = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));

		System.out.println("O valor da hipotenusa é: " + hipotenusa);
	}

}
