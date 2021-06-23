public class CalculadoraCientífica extends Calculos{

    public double num1;
    public double num2;

    public CalculadoraCientífica(int num1, int num2) {
        super(num1, num2);
    }

    public double raizQuadrada(double num1){
        double result = Math.sqrt( num1 );
        return result;
    }

    public double expoente(double num1, double num2){
        double result = Math.pow(num1,num2);
        return result;
    }
}
