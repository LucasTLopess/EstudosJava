package Primeiro;

public class controleAuxilios {
	private double soma;

	//Aqui estou usando um mesmo m�todo para calcular a soma de todos os auxilios.
	//posso usa-lo com todas as Classes que forem extens�es da Classe m�e
	public void controle(Estudantes e) {
		double aux = e.getAuxilio();
		this.soma = this.soma + aux;
	}
	// ------P-O-L-I-M-O-R-F-I-S-M-O-----------
	//Fazendo isto evitamos que para cada tipo de pessoa que ira estar relacionada aos estudos e que precisem das mesmas informa��es que ele.
	//Tenha que vir aqui no controle de Auxilios e criar um tipo de m�todo para cada um. 
	//Cada um pode ter na sua pr�pria classe o m�todo  que � necess�rio
	//Quando chamamos denrto deste m�todo, o programa entende qual m�todo tem que realizar por ver o tipo de cada Objeto.
	
	public double getSoma() {
		return soma;
	}
}
