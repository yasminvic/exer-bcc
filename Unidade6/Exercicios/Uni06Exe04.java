import java.util.Scanner;

/**
 * Uni06Exe04
 */
public class Uni06Exe04 {

    public static void main(String[] args) {
        
    }

    public Uni06Exe04(){
        Scanner s = new Scanner(System.in);

        int listaNum1[] = new int[10];
        int listaNum2[] = new int[10];

        int soma[] = new int[10];

        lerNums(listaNum1, listaNum2, s);
        somaValores(listaNum1, listaNum2, soma);
        imprimirLista(listaNum1, listaNum2, soma);
    }

    void lerNums(int lista1[], int lista2[], Scanner s){
        for (int i = 0; i < lista1.length; i++) {
            System.out.println("\nDigite um valor: ");
            lista1[i] = s.nextInt();

            System.out.println("Digite outro valor");
            lista2[i] = s.nextInt(); 
        }
    }

    void somaValores(int lista1[], int lista2[], int soma[]){
        for (int i = 0; i < lista2.length; i++) {
            soma[i] = lista1[i] + lista2[i];
        }
    }

    void imprimirLista(int lista1[], int lista2[], int soma[]){
        for (int i = 0; i < soma.length; i++) {
            System.out.println("\nNum1: " + lista1[i]);
            System.out.println("Num2: " + lista2[i]);
            System.out.println("Soma dos Valores: " + soma[i] + "\n");
        }
    }
}
