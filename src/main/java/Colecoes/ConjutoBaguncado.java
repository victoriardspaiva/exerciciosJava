package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjutoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));

        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();  // Usando principio da orientação a objeto
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);  // União de dois conjutos
        System.out.println(conjunto);
        conjunto.retainAll(nums); // Intersecao de dois conjuntos
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);

    }

}
