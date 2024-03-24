package Exercicios_Beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("0.00");

        int codigoPeca1 = scanner.nextInt();
        int qtdPeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int qtdPeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();


        double valorTotal = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);

        System.out.println("VALOR A PAGAR: R$ " + formatado.format(valorTotal));
    }
}
