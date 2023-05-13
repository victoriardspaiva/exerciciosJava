package classes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00);

        var p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 460.99;

        var promocao = new Produto();
        promocao.nome = "Macbook";
        promocao.preco = 5000.00;

        double precoFinal = promocao.precoComDesconto();
        System.out.println(precoFinal);

    }
}
