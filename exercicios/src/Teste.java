import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalcularDolar.cotacao = sc.nextDouble();
        CalcularDolar.valorComprar = sc.nextDouble();

        System.out.print(CalcularDolar.valorTotal());



    }
}

