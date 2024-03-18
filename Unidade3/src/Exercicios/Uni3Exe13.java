package Exercicios;

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Informe a altura da sua parede, em metros: ");
        float altura = scanner.nextFloat();

        System.out.println("Informe o comprimento da sua parede, em metros: ");
        float comprimento = scanner.nextFloat();

        float area = comprimento*altura;

        double custo = (area * 9) * 12.5;

        System.out.println("O valor a ser pago pelos azulejos é R$" + custo);
    }
}
