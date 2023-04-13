package Classes;

public class ValorVsReferencia {
    public static void main(String[] args) {

        int a = 2;
        int b = a; // atrbuição por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(11, 4, 2023);
        Data d2 = d1; // atribuição por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarParaDataPadrao(d1); // no final da execução o objeto será alterado

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c); // após a execução do método o primitivo será o mesmo
        System.out.println(c);
    }

    static void voltarParaDataPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
