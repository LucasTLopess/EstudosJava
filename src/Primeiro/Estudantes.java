package Primeiro;

/**
 * @author Lucas Troleiz Lopes
 *
 */
public class Estudantes {

	private String name;
	private String CPF;
	private int idade;
	private double salario;
	private String email;
	private int telefone;
	protected double auxilio;
	private int cargaHorariaSemanal;
	
	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}
	public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}
	
	public void setAuxilio(double auxilio) {
		this.auxilio = auxilio;
	}
	
	public double getAuxilio() {
		return auxilio;
	}	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
