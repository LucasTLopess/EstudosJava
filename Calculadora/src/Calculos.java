public class Calculos {
    private int num1;
    private int num2;

    public Calculos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int somar(int num1, int num2){
        return this.num1+this.num2;
    }

    public int subtrair(int num1, int num2){
        return this.num1-this.num2;
    }

    public int dividir(int num1, int num2){
        return this.num1/this.num2;
    }

    public int multiplicar(int num1, int num2){
        return this.num1*this.num2;
    }



}
