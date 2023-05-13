package desafios;

public class Jantar {
    public static void main(String[] args) {

        Pessoa v = new Pessoa("Victoria", 50);
        Comida a = new Comida("Lasanha", 1);
        Comida b = new Comida("Strogonof", 2);

        System.out.println(v.nome);
        System.out.println(v.peso);
        v.comer(a);
        System.out.print(v.apresentar());
    }
}