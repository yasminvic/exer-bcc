package Exercicios;

import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o peso da carta: ");
        int peso = scanner.nextInt();

        double custoTotal = 0.45;

        if(peso > 50){
            custoTotal += ((peso - 50) / 20f) * 0.45; 
        }


        System.out.println(custoTotal);
    }
}
