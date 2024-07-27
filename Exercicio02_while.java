import java.util.Scanner;

public class Exercicio02_while {

    /*
     * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
     * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
     * o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
     * menos uma de duas coordenadas for NULA (nesta situação sem escrever 
     * mensagem alguma).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite x e y : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }else if(x > 0 && y < 0){
                System.out.println("quarto");
            }else if(x < 0 && y < 0){
                System.out.println("terceiro");
            }else{
                System.out.println("segundo");
            }
            System.out.println("Digite x e y : ");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }



        scanner.close();
    }

}
