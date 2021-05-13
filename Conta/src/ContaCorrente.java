public class ContaCorrente {

    private Long agencia;
    private Long conta;
    private Double saldo;
    private Double limite;

    public ContaCorrente() {
        this.saldo = 0.0;
        this.limite = 1000.0;
    }

    public ContaCorrente(Long agencia, Long conta, Double saldo, Double limite) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void sacar(Double valor) {
        if (valor <= this.saldo + this.limite) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

}
