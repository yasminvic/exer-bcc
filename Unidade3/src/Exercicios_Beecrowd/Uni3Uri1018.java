package Exercicios_Beecrowd;

import java.util.Scanner;

public class Uni3Uri1018 {

	public static void main(String[] args) {
		int[] notas = {100, 50, 20, 10, 5, 2, 1};
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		String resultado = num + "\n";
		
		for(int i = 0; i<notas.length; i++) {
			int qtdNota = num / notas[i];
			num -= notas[i] * qtdNota;
			
			resultado += qtdNota + " nota(s) de R$ "+ notas[i] + ",00\n";
			
		}
		
		System.out.print(resultado);
	}

}
