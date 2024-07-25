import java.util.Scanner;

public class Exercicio02 {

    /*
     * Leia um valor inteiro N. Este valor será a quantidade de valores
     * inteiros X que serão lidos em seguida. Mostre quantos destes valores
     * X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
     * mostrando essas informações conforme exemplo (use a palavra "in" 
     * para dentro do intervalo, e "out" para fora do intervalo)
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a qtde de valores a serem digitados: ");
        int numero = scanner.nextInt();

        int valor = 0, in = 0, out = 0;
        
        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um valor : ");
            valor = scanner.nextInt();

            if(valor >= 10 && valor <= 20){
                in++;
            } else{
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");   
        scanner.close();
     }
     

     
}
