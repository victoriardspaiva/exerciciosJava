package estruturaDeControle;

public class For {
    public static void main(String[] args) {
        for(int contador = 0; contador <= 20; contador +=2){
            System.out.printf("i = %d\n", contador);
        }

        for(int contador = 10; contador > 0; contador -=2){
            System.out.printf("i = %d\n", contador);
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}
