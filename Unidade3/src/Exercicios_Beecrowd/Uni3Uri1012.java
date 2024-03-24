package Exercicios_Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("0.000");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double areaTriangulo = (a * c) /2;
        double areaCirculo = 3.14159 * (c*c);
        double areaTrapezio = ((a + b) * c) /2;
        double areaQuadrado = b*b;
        double areaRetangulo = a*b;

        System.out.println(
                "TRIANGULO: " + formatado.format(areaTriangulo) + "\n" +
                "CIRCULO: " + formatado.format(areaCirculo) + "\n" +
                "TRAPEZIO: " + formatado.format(areaTrapezio) + "\n" +
                "QUADRADO: " + formatado.format(areaQuadrado) + "\n" +
                "RETANGULO: " + formatado.format(areaRetangulo));
    }
}
