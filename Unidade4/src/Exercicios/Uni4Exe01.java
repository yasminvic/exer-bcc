package Exercicios;

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");

        int horasMes = scanner.nextInt();

        System.out.println("Entre com o valor pago por hora: ");
        double horaValor = scanner.nextDouble();

        double salarioTotal = horasMes * horaValor;

        if(horasMes>160){
            double salarioExtra = (horasMes - 160) * (horaValor/2);
            salarioTotal += salarioExtra;
        }

        System.out.println("O salário total é: " + salarioTotal);

    }
}