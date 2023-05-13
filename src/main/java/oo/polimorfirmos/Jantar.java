package oo.polimorfirmos;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijão ingrediente2 = new Feijão(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.2);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());
    }
}
