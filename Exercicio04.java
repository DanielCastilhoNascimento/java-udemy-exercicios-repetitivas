import java.util.Scanner;

public class Exercicio04 {

    /*
     * Fazer um programa para ler um número N. Depois leia N pares de números
     * e mostre a divisão do primeiro pelo segundo. Se o denominador for igual 
     * a zero, mostrar a mensagem "divisao impossivel"
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas vezes se repetirá: ");
        int qtde = scanner.nextInt();

        double num1, num2;

        for (int i = 0; i < qtde; i++) {
            System.out.println("Digite 2 numeros: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if(num2 == 0){
               System.out.println("divisão impossivel");
            } else{
               System.out.printf("Resultado da divisão: %.1f%n",(num1 / num2));
            }
            System.out.println("==========================");

        }

        scanner.close();
     }

}
