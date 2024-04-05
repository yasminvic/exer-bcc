package Exercicios;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma letra: ");
        String letra = scanner.nextLine();

        String vogais = "AEIOU";

        if(vogais.contains(letra.toUpperCase())){
            System.out.println("É vogal!");
        }

        System.out.println("É consoante!");
        
    }
}
