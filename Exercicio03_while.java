import java.util.Scanner;

public class Exercicio03_while {

        /*
            Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência 
            de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido 
            (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário 
            informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código 
            (até que seja válido). O programa será encerrado quando o código informado for o número 4.
            Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
            cada tipo de combustível, conforme exemplo.
        */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        

        int tipoCombustivel = 0, alcool = 0, gasolina = 0, diesel = 0;

        while (tipoCombustivel != 4) {
            System.out.print("Digite o tipo de combustivel: ");
            tipoCombustivel = scanner.nextInt();

            switch (tipoCombustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:    
                    diesel++;
                    break;
                default:
                    //System.out.println("código invalido, digite novamente.");
                    break;
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool:   " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel:   " + diesel);

        scanner.close();   
    }
}
