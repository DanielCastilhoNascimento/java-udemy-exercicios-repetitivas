import java.util.Scanner;

public class Exercicio05 {

    /*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
      Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que,
      por definição, fatorial de 0 é 1. 
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;                
        }

        System.out.println(fatorial);

        scanner.close();
        
        }


}
