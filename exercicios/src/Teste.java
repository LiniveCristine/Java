import java.util.Scanner;

public class Teste {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1;
        int num;

        num = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite um texto: ");
        line1 = sc.nextLine();

        System.out.println("\nTexto digitado: ");
        System.out.print(line1);
    }
}

