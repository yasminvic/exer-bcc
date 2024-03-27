package Exercicios_Beecrowd;

import java.util.Scanner;

public class Uni3Uri1019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();		

		int horas = num / 3600;
		int minutos = (num % 3600)/ 60;
		int segundos = (num % 3600) % 60;
		
		System.out.println(+ horas + ":" + minutos + ":" + segundos);
	}

}
