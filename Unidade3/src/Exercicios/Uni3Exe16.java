package Exercicios;

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        int numero = scanner.nextInt();

        int centena = numero/100;

        numero = numero %100; 
        int dezena = numero/10;

        numero = numero % 10;
        int unidade = numero;
        

        System.out.println("Quantidade de notas de 100: " + centena + "\n" + "Quantidade de notas de 10: " + dezena + 
        		"\nQuantidade de moedas de 1: " + unidade);
    }
}
