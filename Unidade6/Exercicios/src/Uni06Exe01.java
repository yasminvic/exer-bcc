import java.util.Scanner;

public class Uni06Exe01 {
    public static void main(String[] args) {
         
        new Uni06Exe01();
    
        
    }

    public Uni06Exe01(){
        Scanner s = new Scanner(System.in);

        int lista[] = new int[10];

        lerNums(s, lista);
        imprimirLista(lista);
    }


    void lerNums(Scanner s, int lista[]){
        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva um número: ");
            int num = s.nextInt();
            lista[i] = num;
        }
    }

    void imprimirLista(int lista[]){
        System.out.println("Lista na ordem inversa: \n");

        for (int i = 9; i >= 0; i--) {
            System.out.println(lista[i] + "\n");
        }
    }

}
