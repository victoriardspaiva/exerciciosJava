package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String name;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.name = nome;
    }

    double obterValorTotal(){
        double total = 0;

        for(Compra compra: compras){
            total += compra.obterValorTotal();
        }
        return total;
    }
}
