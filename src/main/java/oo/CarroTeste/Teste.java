package oo.CarroTeste;

import oo.Heranca.Fusca;
import oo.Heranca.Toro;

public class Teste {
    public static void main(String[] args) {
        Fusca fusca = new Fusca();
        fusca.frear();
        fusca.acelerar();
        fusca.frear();
        fusca.acelerar();
        fusca.acelerar();
        System.out.println(fusca.velocidadeAtual);

        Toro toro = new Toro();
        toro.frear();
        toro.acelerar();
        toro.frear();
        toro.acelerar();
        toro.acelerar();
        System.out.println(toro.velocidadeAtual);


    }
}
