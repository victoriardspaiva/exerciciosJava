package classes;

public class AreaCircTeste {

    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);
        System.out.println(a.area());

        AreaCirc b = new AreaCirc(2);
//        b.pi = 2;
        System.out.println(b.area());

        System.out.println(AreaCirc.PI);
        System.out.println(AreaCirc.area(1));
    }

}