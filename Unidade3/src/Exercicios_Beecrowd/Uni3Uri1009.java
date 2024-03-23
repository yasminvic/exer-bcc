package Exercicios_Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		String nome = scanner.next();
		double salario = scanner.nextDouble();
		double vendas = scanner.nextDouble();
		
		double salarioTotal = salario + (vendas * 0.15f);
		
		System.out.println("TOTAL = R$ " + formatado.format(salarioTotal));
		
	}

}
