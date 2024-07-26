import java.util.Scanner;

public class Exercicio06 {
//Ler um número inteiro N e calcular todos os seus divisores.

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero inteiro: ");
    int numero = scanner.nextInt();

    for (int i = 1; i <= numero; i++) {
        if(numero % i ==  0){
            System.out.printf("%n divisor de %d: %d: ", numero, i);
        }
    }

    scanner.close();
}

}
