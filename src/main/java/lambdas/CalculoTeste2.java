package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        
        Calculo calc = (x, y) -> {
            return x + y;
        };

        calc = (x, y) -> x * y;
    }
}
