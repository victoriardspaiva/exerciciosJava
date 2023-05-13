package oo.carroTeste;

import oo.heranca.Carro;
import oo.heranca.Fusca;
import oo.heranca.Toro;

public class Teste {
    public static void main(String[] args) {
        Carro fusca = new Fusca();
        fusca.frear();
        fusca.acelerar();
        fusca.frear();
        fusca.acelerar();
        fusca.acelerar();
        System.out.println(fusca.velocidadeAtual);

        Toro toro = new Toro();
        toro.ligarTurbo();

        toro.frear();
        toro.acelerar();
        toro.frear();
        toro.acelerar();
        toro.acelerar();
        System.out.println(toro.velocidadeAtual);


    }
}
