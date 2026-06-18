import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int op = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMENU:\n1-Alcool\n2-Gasolina\n3-Diesel\n4-Sair\n");

        while(op != 4){
            System.out.print("Digite o numero do produto: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    System.out.println("\nMUITO OBRIGADO");
                    System.out.printf("Alcool: %d%n", alcool);
                    System.out.printf("Gasolina: %d%n", gasolina);
                    System.out.printf("Diesel: %d%n", diesel);

                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

    }

}
