public class Calculadora {
    public static void main(String[] args) {
    CalculadoraCientífica teste = new CalculadoraCientífica(1,2);
    int soma = teste.somar(teste.getNum1(),teste.getNum2());
    int subtracao = teste.subtrair(teste.getNum1(),teste.getNum2());
    int divisao = teste.dividir(teste.getNum1(),teste.getNum2());
    int multiplicacao = teste.multiplicar(teste.getNum1(),teste.getNum2());
    double expoente = teste.expoente(5,2);
    double raizQuadrada = teste.raizQuadrada(25);


        System.out.println("O resultado das 4 operações básicas:" +
                "\nsoma: " + soma +
                "\nsubtração: " + subtracao +
                "\ndivisão: " + divisao +
                "\nmultiplicação: " + multiplicacao +
                "\nexpoente: " + expoente +
                "\nraizQuadrada: " + raizQuadrada );

    }
}
