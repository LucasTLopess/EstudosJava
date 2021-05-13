import java.io.IOException;

public class Televisao {
    private int[] canais;
    private int canalAtual;
    private int[] volume = new int[10];
    private int volumeAtual;
    private boolean ligaDesliga;

    public void setLigaDesliga(){
        if (this.ligaDesliga==true){
            this.ligaDesliga=false;
        }else {
            this.ligaDesliga=true;
        }
    }

    public Televisao() {
        for (int i = 0; i < 10; i++) {
            this.volume[i]=i;
        };
        this.volumeAtual = 5;
        this.canalAtual = 1;
        this.ligaDesliga = false;
    }

    public void pesquisaCanais() throws IOException, InterruptedException {
        String anim= "|/-\\";
        System.out.println("Pesquisando canais");
        for (int x =0 ; x < 100 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
        System.out.println("\nPesquisa concluida");
        canais = new int[6];
        canais[0] = 2;
        canais[1] = 4;
        canais[2] = 5;
        canais[3] = 7;
        canais[4] = 10;
        canais[5] = 12;
        System.out.print("Canais encontrados= 6 { ");
        for (int i = 0; i < canais.length; i++) {
            System.out.print(canais[i]+" ");
        }
        System.out.println("}");
    }

    public void canalParaCima(){
        if(this.canalAtual == canais.length){
            this.canalAtual = 0;
        }
        this.canalAtual = this.canalAtual +1 ;
    }

    public void canalParaBaixo(){
        if(this.canalAtual == 0){
            this.canalAtual = canais.length;
        }
        this.canalAtual -= 1;
    }

    public void volumeParaCima(){
        if(this.volumeAtual<this.volume.length){
            this.volumeAtual += 1;
        }
    }

    public void volumeParaBaixo(){
        if (this.volumeAtual>0){
            this.volumeAtual -= 1;
        }
    }

    public void status(){
        if (this.ligaDesliga){
           System.out.println("Tv está ligada no canal : "+ canais[canalAtual] + " " +
                   "e está no volume: " + volumeAtual);
        }else{
            System.out.println("A tv está desligada");
        }

    }


}
