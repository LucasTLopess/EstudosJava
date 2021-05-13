import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroPessoa {
    public static void main(String[] args) throws ParseException {

        Pessoa pessoa = new Pessoa("Lucas","25/09/1997",1.71);
        pessoa.setNome("Lucas Troleiz Lopes");
        pessoa.setAltura(pessoa.getAltura()+0.01);

        System.out.println("Usuário: "+pessoa.getNome()+"" +
                           "\nAltura: "+pessoa.getAltura()+"" +
                           "\nIdade: "+ pessoa.calcularIdade() + " anos");;


    }
}
