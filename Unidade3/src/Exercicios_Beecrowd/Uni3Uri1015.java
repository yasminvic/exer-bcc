package Exercicios_Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1015 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("0.0000");

        //ponto 1
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        //ponto 2
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));

        System.out.println(formatado.format(distancia));
    }
}
