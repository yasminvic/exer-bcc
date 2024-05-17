import java.util.Scanner;

public class Uni06Exe02 {
    public static void main(String[] args) {
        

        new Uni06Exe02();
    }


    public Uni06Exe02(){
        Scanner s = new Scanner(System.in);

        double lista[] = new double[12];

        lerNums(s, lista);

        calculaMedia(lista);

        System.out.println("\nNúmeros maiores que a média: \n");
        System.out.println(maiorQueMedia(calculaMedia(lista), lista));
    }

    void lerNums(Scanner s, double lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Escreva um número: ");
            double num = s.nextDouble();

            lista[i] = num;
        }
    }

    double calculaMedia(double lista[]){
        double soma = 0;

        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        
        return soma / lista.length;
    }

    String maiorQueMedia(double media, double lista[]){
        String numMaiores = "";
        
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] > media){
                numMaiores += lista[i] + "\n";
            }
        }

        return numMaiores;
    }
}
