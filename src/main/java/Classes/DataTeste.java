package Classes;

public class DataTeste {
    public static void main(String[] args) {
        Data victoria = new Data(04, 01, 1993);
//        aniversario.dia = 04;
//        aniversario.mes = 01;
//        aniversario.ano = 1993;

        Data testeDefault = new Data();

        int idade = 2023 - victoria.ano;
        System.out.println(idade);
        String dataFormatada = victoria.obterDataFormatada();
        System.out.println(dataFormatada);
        System.out.println(victoria);

        System.out.println(testeDefault.obterDataFormatada());
    }
}
