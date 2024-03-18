package Exercicios;

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número com 3 dígitos: ");
        int numero = scanner.nextInt();

        int centena = numero/100;

        numero = numero %100; 
        int dezena = numero/10;

        numero = numero % 10;
        int unidade = numero;
        

        System.out.println(centena + " centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s).");
    }
}
