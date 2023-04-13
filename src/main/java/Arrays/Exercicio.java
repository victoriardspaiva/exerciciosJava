package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double [] notasA = new double[3];
        notasA[0] = 7.9;
        notasA[1] = 8;
        notasA[2] = 6.7;

        System.out.println(Arrays.toString(notasA));

        double total = 0;
        for(int i = 0; i < notasA.length; i++){
            total += notasA[i];
        }
        System.out.println(total/notasA.length);

        double totalB = 0;
        double[] notasB = { 6.9, 8.9, 5.5, 10 };
        for(int i = 0; i < notasB.length; i++){
            totalB += notasB[i];
        }
        System.out.println(totalB/notasB.length);
    }
}
