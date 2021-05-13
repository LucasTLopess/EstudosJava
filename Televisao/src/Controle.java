import java.io.IOException;

public class Controle {
    public static void main(String[] args) throws IOException, InterruptedException {
        //TV inicializa desligada no segundo canal que tiver e no volume 5
        Televisao tv = new Televisao();
        //liga TV
        tv.setLigaDesliga();
        //Pesquisa canais
        tv.pesquisaCanais();
        //mostra estado atual da TV
        tv.status();

        tv.volumeParaCima();
        tv.canalParaCima();
        tv.status();

        tv.canalParaBaixo();
        tv.volumeParaBaixo();
        tv.status();

        //Desliga tv
        tv.setLigaDesliga();
        tv.status();





    }
}
