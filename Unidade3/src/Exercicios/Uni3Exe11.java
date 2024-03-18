package Exercicios;

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em ºC que deseja converter: ");
        float celsius = scanner.nextFloat();

        float fahrenheit = ((celsius*9) + 160)/5;

        System.out.println("A temperatura " +  celsius + "ºC convertida para fahrenheit é " + fahrenheit + "ºF");

    }
}
