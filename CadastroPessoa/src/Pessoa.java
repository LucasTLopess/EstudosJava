import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private Double altura;

    public Pessoa(String nome, String dataNascimento, Double altura) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataNascimento);
        this.nome = nome;
        this.dataNascimento = data;
        this.altura = altura;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade(){
        Calendar calendar = new GregorianCalendar();
        Calendar dataNascimento = new GregorianCalendar();
        dataNascimento.setTime(this.dataNascimento);
        int idade = calendar.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        dataNascimento.add(Calendar.YEAR,idade);
        if(calendar.before(dataNascimento)){
            idade--;
        }
        return idade;
    }
}
