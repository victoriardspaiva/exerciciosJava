package Classes;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Victoria Paiva";
        u1.email = "victoriarspaiva@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Victoria Paiva";
        u2.email = "victoriarspaiva@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(new Date()));
    }
}
