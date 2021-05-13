public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void displayData() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
