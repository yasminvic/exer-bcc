package Exercicios;

import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número maior que 0");
        double num = scanner.nextDouble();

        if(num % 1 > 0){
            System.out.println("Tem casas decimais");
        }else{
            System.out.println("Não tem casas decimais");
        }
    }
}
