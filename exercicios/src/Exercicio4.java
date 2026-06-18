import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int dentro = 0;
        int fora = 0;

        System.out.print("Digite a quantidade de numeros: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            if(x>=10 && x<=20){
                dentro++;

            } else{
                fora++;
            }
        }

        System.out.printf("%d in\n%d out", dentro,fora);

    }
}
