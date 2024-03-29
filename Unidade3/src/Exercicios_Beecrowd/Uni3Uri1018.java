package Exercicios_Beecrowd;

import java.util.Scanner;

public class Uni3Uri1018 {

	public static void main(String[] args) {
		int[] notas = {100, 50, 20, 10, 5, 2, 1};
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		String resultado = num + "\n";

        for (int nota : notas) {
            int qtdNota = num / nota;
            num -= nota * qtdNota;

            resultado += qtdNota + " nota(s) de R$ " + nota + ",00\n";

        }
		
		System.out.print(resultado);
	}

}
