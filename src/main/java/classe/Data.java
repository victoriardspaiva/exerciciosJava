package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int diaDefault, int mesDefault, int anoDefault) {
        dia = diaDefault;
        mes = mesDefault;
        ano = anoDefault;
    }

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
