public class Bancario {
    public static void main(String[] args) {
    ContaCorrente minhaConta = new ContaCorrente();
    System.out.println("O saldo desta conta é " + minhaConta.getSaldo());
    minhaConta.depositar(100.0);
    System.out.println("O saldo desta conta é " + minhaConta.getSaldo());
    minhaConta.sacar(50.0);
    System.out.println("O saldo desta conta é " + minhaConta.getSaldo());
    }
}
