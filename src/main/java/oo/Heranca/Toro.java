package oo.Heranca;

public class Toro extends Carro{

    public Toro(){
        this(315);
    }

    public Toro(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 500;
    }

//    @Override
//    void acelerar(){
//        velocidadeAtual += 15;
//    }
}
