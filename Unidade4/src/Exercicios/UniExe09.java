package Exercicios;

import java.util.Scanner;

public class UniExe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Escreva outro número inteiro: ");
        int num2 = scanner.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
    }
}
