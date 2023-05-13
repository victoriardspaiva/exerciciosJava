package oo.heranca;

public class Toro extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Toro(){
        this(315);
    }

    public Toro(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }


    @Override
    public void ligarAr() {
        ligarAr = true;

    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr)
            return 30;
        else if(ligarTurbo && ligarAr)
            return 30;
        else if(!ligarTurbo && !ligarAr)
            return 20;
        else
            return 15;
    }
}
