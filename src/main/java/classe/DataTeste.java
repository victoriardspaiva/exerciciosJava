package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data aniversario = new Data();
        aniversario.dia = 04;
        aniversario.mes = 01;
        aniversario.ano = 1993;

        int idade = 2023 - aniversario.ano;
        System.out.println(idade);
        String dataFormatada = aniversario.obterDataFormatada();
        System.out.println(dataFormatada);
    }
}
