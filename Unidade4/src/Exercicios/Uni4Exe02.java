package Exercicios;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreve um número inteiro: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("Este número é par!");
        }else{
            System.out.println("Este número é ímpar!");
        }

    }
    
}