package Arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ExercicioDois {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        double[] notas = new double[5];


//        for(int i = 0; i < notas.length; i++){
//            notas[i] = Math.random();
//        }

        for(double nota: notas){
            nota = Math.random();
        }

        System.out.println(Arrays.toString(notas));

        double total =0;
        for (double nota: notas){
            total += notas[(int) nota];
        }
        formatador.format(total);

        System.out.println("Média: " + total/notas.length);
    }
}
