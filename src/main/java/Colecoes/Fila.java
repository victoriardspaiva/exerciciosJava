package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // add e offer adicinam elementos na lista
        // diferença quando a fila está cheia
        // add dá erro e o offer retorna falso
        fila.add("Ana");
        fila.offer("Bia");

        // peek e element retorna o proximo elemento da fila
        // diferença na fila vazia
        //peek retorna null e o element dá erro
        fila.peek();
        fila.element();

        // poll e remove retorna o proximo elemento da fila e exclui
        //diferença na fila vazia
        // remove dá erro e poll retorna null
        fila.poll();
        fila.remove();

        fila.size();
        fila.clear();
        fila.isEmpty();
//        fila.contains(...)
    }
}
