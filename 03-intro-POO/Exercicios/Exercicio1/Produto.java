public class Produto {
    public String nome;
    public double valorUnitario;
    public int quantidadeEstoque;

    public double totalEmEstoque(){
        double valorEstoque = valorUnitario * quantidadeEstoque;

        System.out.printf("\nNome Produto: %s\n", nome);
        System.out.printf("Preço do produto: %.2f\n", valorUnitario);
        System.out.printf("Quantidade em estoque: %d\n", quantidadeEstoque);
        System.out.printf("Valor total em estoque: %.2f\n", valorEstoque);

        return valorEstoque;
    }

    public void adicionarProduto(int quantidade){

        quantidadeEstoque+= quantidade;
        double valorEstoque = valorUnitario * quantidadeEstoque;

        System.out.printf("\nNome Produto: %s\n", nome);
        System.out.printf("Preço do produto: %.2f\n", valorUnitario);
        System.out.printf("Quantidade em estoque: %d\n", quantidadeEstoque);
        System.out.printf("Valor total em estoque: %.2f\n", valorEstoque);

    }

    public void removerProduto(int quantidade){

        quantidadeEstoque-=quantidade;
        double valorEstoque = valorUnitario * quantidadeEstoque;

        System.out.printf("\nNome Produto: %s\n", nome);
        System.out.printf("Preço do produto: %.2f\n", valorUnitario);
        System.out.printf("Quantidade em estoque: %d\n", quantidadeEstoque);
        System.out.printf("Valor total em estoque: %.2f", valorEstoque);

    }

    public String toString(){

        return nome+"\n"+"valor: "+valorUnitario+"\n"+"quantidade: "+quantidadeEstoque;
    }
}
