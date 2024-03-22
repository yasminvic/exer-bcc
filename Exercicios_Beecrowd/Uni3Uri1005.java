package Exercicios_Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		double media = ((a*3.5) + (b*7.5)) / 11;
		
		DecimalFormat formatado = new DecimalFormat("0.00000");

		System.out.println("MEDIA = " + formatado.format(media));
	}

}
