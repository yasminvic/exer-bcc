package Exercicios;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu gênero, em uma letra: ");
        char genero = scanner.next().charAt(0);

        switch (Character.toUpperCase(genero)) {
            case 'M':
                System.out.println("Masculino");
                break;
            
            case 'F':
                System.out.println("Feminino");
                break;

            case 'I':
                System.out.println("Não Informado");
                break;  
        
            default:
                System.out.println("Entrada Incorreta");
                break;
        }
    }
}
