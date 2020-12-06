package Primeiro;

public class controleAuxilios {
	private double soma;

	//Aqui estou usando um mesmo método para calcular a soma de todos os auxilios.
	//posso usa-lo com todas as Classes que forem extensões da Classe mãe
	public void controle(Estudantes e) {
		double aux = e.getAuxilio();
		this.soma = this.soma + aux;
	}
	// ------P-O-L-I-M-O-R-F-I-S-M-O-----------
	//Fazendo isto evitamos que para cada tipo de pessoa que ira estar relacionada aos estudos e que precisem das mesmas informações que ele.
	//Tenha que vir aqui no controle de Auxilios e criar um tipo de método para cada um. 
	//Cada um pode ter na sua própria classe o método  que é necessário
	//Quando chamamos denrto deste método, o programa entende qual método tem que realizar por ver o tipo de cada Objeto.
	
	public double getSoma() {
		return soma;
	}
}
