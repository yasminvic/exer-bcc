package Exercicios_Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] dinheiroLista = {100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.1, 0.05, 0.01};
        String resultado = "NOTAS:\n";
        DecimalFormat formatado = new DecimalFormat("0.00");

        double num = scanner.nextDouble();

        for(double dinheiro : dinheiroLista){
            int qtdDinheiro = (int) (num / dinheiro);
            num -= qtdDinheiro * dinheiro;

            if(dinheiro == 1){
                resultado += "MOEDAS:\n";
            }

            if(dinheiro > 1){
                resultado += qtdDinheiro + " nota(s) de R$ " + formatado.format(dinheiro) + "\n";
            }
            else{
                resultado += qtdDinheiro + " moeda(s) de R$ " + formatado.format(dinheiro) + "\n";
            }

        }

        System.out.print(resultado);
    }
}
