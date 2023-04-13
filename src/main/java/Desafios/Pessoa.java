package Desafios;

public class Pessoa {
    String nome;
    double peso;


    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida c){
        this.peso += c.peso;
    }
    String apresentar(){
        return "Olá eu sou o " + nome + " e tenho " + peso + "Kgs. ";
    }

}
