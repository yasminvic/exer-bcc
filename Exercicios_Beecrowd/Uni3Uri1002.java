package Exercicios_Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double raio = scanner.nextDouble();
		
		DecimalFormat formatado = new DecimalFormat("#.0000");
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.println("A=" + formatado.format(area));
		
		scanner.close();

	}

}
