import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    /*
     * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
     * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
     * Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o 
     * primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5
     * 
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int qtdeDeVezes = scanner.nextInt();

        double num1, num2, num3, media;
        
        for (int i = 0; i < qtdeDeVezes; i++) {
            System.out.println("Digite 3 numeros reais:");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            num3 = scanner.nextDouble();
            media = ((num1 * 2)+(num2 * 3)+(num3 * 5)) / 10;
            System.out.printf("media %.1f%n ", media);
            System.out.println("====================");
        }

        scanner.close();
    }

}
