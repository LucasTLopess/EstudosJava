public class SistemasElevadores {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(3,5);
        //Uma pessoa entra vai até o 3 andar
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.status();;

        //A pessoa sai e o elevador desce para o térreo
        elevador.sai();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.status();

    }
}
