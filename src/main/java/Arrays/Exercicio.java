package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasA = new double[3];
        notasA[0] = 7.9;
        notasA[1] = 8;
        notasA[2] = 6.7;

        System.out.println(Arrays.toString(notasA)); // exibe o array
        System.out.println(notasA[0]); // exibe o primeiro valor do array
        System.out.println(notasA[notasA.length -1]); // exibe o ultimo valor do array

        double total = 0;
        for(int i = 0; i < notasA.length; i++){
            total += notasA[i];
        }
        System.out.println(total/notasA.length);

        double totalB = 0;
        final double notaArmazenada = 8.9;
        double[] notasB = { 6.9, notaArmazenada, 5.5, 10 };
        for(int i = 0; i < notasB.length; i++){
            totalB += notasB[i];
        }
        System.out.println(totalB/notasB.length);
    }
}
