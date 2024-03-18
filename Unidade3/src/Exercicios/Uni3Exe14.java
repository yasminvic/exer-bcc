package Exercicios;

import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida, em Km: ");
        float distancia = scanner.nextFloat();

        System.out.println("Digite o tempo gasto na viagem, em horas: ");
        float tempo = scanner.nextFloat();

        float velocidade = distancia/tempo;

        float combustivel = distancia/12;

        System.out.println("A velocidade média do veículo foi " + velocidade + "Km/h e o gasto com combustível foi " + combustivel + "L");

    }
}
