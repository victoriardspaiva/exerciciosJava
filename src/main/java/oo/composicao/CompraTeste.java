package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.itens.add(new Item("Caneta", 2, 15.46));
        c1.itens.add(new Item("Lapis", 1, 8.96));
        c1.itens.add(new Item("Caderno", 5, 22.39));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
    }
}
