package Exercicios;

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Informe seu nome completo: ");
    	String nome = scanner.next();
    	
    	System.out.println("Digite a quantidade de horas mensais trabalhadas: ");
    	float horas = scanner.nextFloat();
    	
    	System.out.println("Digite a quantidade de dependentes: ");
    	int dependentes = scanner.nextInt();
    	
    	float salarioBruto = 10 * horas;
    	float salarioLiquido = salarioBruto - (salarioBruto * 0.135f) + (60 * dependentes);
    	
    	System.out.println("Nome: " + nome + "\n" + "Salário Bruto: " + salarioBruto + "\n" + "Salário Líquido: " + salarioLiquido);
        
    }
}
