import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Teste {
    static void main(String[] args) {

        int num = 1;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        while(num != 0){
            System.out.print("Digite um numero: ");
            num = sc.nextInt();

            total += num;
        }

        System.out.println(total);
    }
}

