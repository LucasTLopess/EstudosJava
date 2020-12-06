package Primeiro;

	public class Estudos {
		public static void main(String[] args) {
			System.out.println("Temos a alegria de dizer que atualmente temos alguns alunos.");
			System.out.println("E que o governo disponibilizou valores para que pagamos Auxilio de R$200,00 para todo estudante de faculdades Públicas.");
			System.out.println("Disponibilizou metado do Auxilio para bolsistas de Faculdades privadas.");
			System.out.println("E para que tenha mão de obra para fazer melhorias no campus da Universidade Federal,");
			System.out.println("disponibilizou um Auxilio de 2X o valor da bolsa do Estudante.");
			Estudantes lucas = new Estudantes();
			lucas.setName("Lucas");
			lucas.setIdade(19);
			lucas.setCPF("03814397045");
			lucas.setEmail("david@blaine.com");
			lucas.setAuxilio(200);
			
			Bolsistas dj = new Bolsistas();
			dj.setName("DJ");
			dj.setIdade(20);
			dj.setCPF("6641264454");
			dj.setEmail("will@smitch.com");
			dj.setAuxilio(200);
						
			Estagiarios michael = new Estagiarios();
			michael.setName("Michael");
			michael.setIdade(23);
			michael.setCPF("1212564546");
			michael.setEmail("Michael@jordan.com");
			michael.setAuxilio(200);
			
			controleAuxilios controle = new controleAuxilios();
			controle.controle(lucas);
			controle.controle(dj);
			controle.controle(michael);
			
			System.out.println("Este semestre foram 3 pessoas contempladas com o Auxilio totalizando o gasto mensal de R$" + controle.getSoma());
		
			
		}
		
}
