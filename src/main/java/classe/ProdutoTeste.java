package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3500.00;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 460.99;
        p2.desconto = 0.29;

        double precoFinal = p1.precoComDesconto();
        System.out.println(precoFinal);

    }
}
