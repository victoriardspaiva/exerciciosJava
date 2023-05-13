package oo.Heranca;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;
    public int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
       if(velocidadeAtual + delta > VELOCIDADE_MAXIMA)
           velocidadeAtual = VELOCIDADE_MAXIMA;
       else velocidadeAtual += delta;
    }

    public void frear(){
        if(velocidadeAtual > 0)
            velocidadeAtual -= 5;
        else velocidadeAtual = 0;
    }

    public String toString(){
        return "Velocidade atual é ";
    }
}
