package Desafios;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas: ");
        int qtNotas = entrada.nextInt();
        double[] notas = new double[qtNotas];

        for(int i = 0; i < qtNotas; i++){
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota: notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média é " + media);
    }
}
