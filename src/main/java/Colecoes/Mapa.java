package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Receba");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet()); // retorna as chaves
        System.out.println(usuarios.values()); // retornar os valores
        System.out.println(usuarios.entrySet()); // retorna os pares

        System.out.println(usuarios.containsKey(20)); // pesquisa chave retorno boo
        System.out.println(usuarios.containsValue("Roberto")); // pesquisa valor retorno boo
        System.out.println(usuarios.get(3)); // pesquisa por chave retonar o valor

        // percorendo
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "- ");
            System.out.println(registro.getValue());
        }
    }
}
