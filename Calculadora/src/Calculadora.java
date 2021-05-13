public class Calculadora {
    public static void main(String[] args) {
    Calculos teste = new Calculos(1,2);
    int soma = teste.somar(teste.getNum1(),teste.getNum2());
    int subtracao = teste.subtrair(teste.getNum1(),teste.getNum2());
    int divisao = teste.dividir(teste.getNum1(),teste.getNum2());
    int multiplicacao = teste.multiplicar(teste.getNum1(),teste.getNum2());

        System.out.println("O resultado das 4 operações básicas:" +
                "\nsoma: " + soma +
                "\nsubtração: " + subtracao +
                "\ndivisão: " + divisao +
                "\nmultiplicação: " + multiplicacao);

    }
}
