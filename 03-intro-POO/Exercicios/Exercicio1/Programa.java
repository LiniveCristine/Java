import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Produto quadro = new Produto();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produtos: ");
        quadro.nome = sc.nextLine();

        System.out.print("Digite o valor unitário: ");
        quadro.valorUnitario = sc.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        quadro.quantidadeEstoque = sc.nextInt();

        double valorEstoque = quadro.TotalEmEstoque();
    }

}

