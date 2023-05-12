package oo.Heranca;

public class Toro extends Carro{

    Toro(){
        this(315);
    }

    Toro(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 500;
    }

//    @Override
//    void acelerar(){
//        velocidadeAtual += 15;
//    }
}
