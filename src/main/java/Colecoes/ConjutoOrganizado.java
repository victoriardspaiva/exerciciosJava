package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjutoOrganizado {
    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<>(); // Lifo: last in first out, pode ser definida outro tipo de ordenacao
//        Set<String> lista = new HashSet<>(); // ordem alfabetica
        lista.add("Carlos");
        lista.add("Junior");
        lista.add("Ana");

        for (String canditado: lista) {
            System.out.println(canditado);
        }

    }

}
