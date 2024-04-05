package Exercicios;

import java.util.Scanner;

public class Uni5Exe03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Escreva outro número inteiro: ");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        }else if (num2 > num1) {
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        } else {
            System.out.println("Os dois números são iguais");
        }
    }
}