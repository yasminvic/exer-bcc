package Exercicios_Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		int numero = scanner.nextInt();
		int horas = scanner.nextInt();
		float valorHoras = scanner.nextFloat();
		
		float salario = horas * valorHoras;
		
		System.out.println("NUMBER = " + numero + 
				 "\nSALARY = U$ " + formatado.format(salario));

	}

}
