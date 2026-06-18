import java.util.Scanner;

public class Exercicio2 {

    static void main(String[] args) {

        int senhaCorreta = 2002;
        Scanner sc = new Scanner(System.in);
        int senhaUsuario = 0;

        while(senhaUsuario != senhaCorreta){

            System.out.print("Digite sua senha: ");
            senhaUsuario = sc.nextInt();

            if(senhaUsuario == senhaCorreta){
                System.out.println("Acesso Permitido");
                break;
            }

            System.out.println("Senha invalida! ");
        }

    }
}
