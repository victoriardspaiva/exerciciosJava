package estruturaDeControle;

import java.util.Scanner;

public class WhileInderterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        while(!valor.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            valor = entrada.nextLine();
        }
    }
}
