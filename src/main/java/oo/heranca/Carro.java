package oo.heranca;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;
    private int delta = 5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
       if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA)
           velocidadeAtual = VELOCIDADE_MAXIMA;
       else velocidadeAtual += getDelta();
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
