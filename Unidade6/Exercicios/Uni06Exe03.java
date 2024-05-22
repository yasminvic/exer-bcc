import java.util.Scanner;

public class Uni06Exe03 {
    public static void main(String[] args) { 
        
        
        
    }

    public Uni06Exe03(){

        Scanner s = new Scanner(System.in);

        double lista[] = new double[10];

        lerNums(s, lista);
        imprimirLista(aumentaNums(lista));

    }

    void lerNums(Scanner s, double lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Escreva um número: ");
            int num = s.nextInt();
            lista[i] = num;
        }
    }

    double[] aumentaNums(double lista[]){
        for (int i = 0; i < lista.length; i++) {
            if(i % 2 == 0){
                lista[i] *= 0.02;  
            }else{
                lista[i] *= 0.05;
            }
        }

        return lista;
    }

    void imprimirLista(double lista[]){
        System.out.println("\nNovos valores do vetor:\n");
        for (double num : lista) {
            System.out.println(num);;
        }
    }

}
