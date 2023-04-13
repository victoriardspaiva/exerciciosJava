package Classes;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia; // para evitar conflito entre o nomes dos parametro e das variaveis de intancia
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
        this(1,1,1970); //Data default
//        dia = 1;
//        mes = 1;
//        ano = 1970;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
