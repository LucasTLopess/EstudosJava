public class Elevador {
    private int andarAtual;
    private int capacidade;
    private int qtdPessoas;
    private int qtdAndares;

    public Elevador(int capacidade, int qtdAndares) {
        this.capacidade = capacidade + 0;
        this.qtdAndares = qtdAndares + 0;
    }

    public void entra(){
        if (this.qtdPessoas<this.capacidade) {
            this.qtdPessoas += 1;
        }else {
            System.out.println("O elevador está cheio, vá de escada.");
        }
    }

    public void sai(){
        if (this.qtdPessoas>0){
            this.qtdPessoas -= 1;
        }else {
            System.out.println("O elevador está vazio.");
        }
    }

    public void sobe(){
        if(this.andarAtual<this.qtdAndares){
            this.andarAtual += 1;
        }else {
            System.out.println("Você está no ultimo andar, vá e aprecia a vista.");
        }
    }
    public void desce(){
        if(this.andarAtual>0){
            this.andarAtual -= 1;
        }else {
            System.out.println("Você está no térreo, vá e aprecia a rua.");
        }
    }
    public void status(){
        System.out.println("Está no "+this.andarAtual+"° andar" +
                "\nCapacidade para "+this.capacidade+" pessoas" +
                "\nNo momento tem "+this.qtdPessoas);
    }

}
