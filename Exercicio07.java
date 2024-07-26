import java.util.Scanner;

public class Exercicio07 {

    /*
     * Fazer um programa para ler um número inteiro positivo N. O programa deve 
     * então mostrar na tela N linhas, começando de 1 até N. Para cada linha, 
     * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
     * exemplo.
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.printf("Linha: %d. Quadrado: %d, Cubo: %d %n", i, (i * i), (i * i * i));
        }

        scanner.close();
     }

}
