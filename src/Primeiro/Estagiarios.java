package Primeiro;

	public class Estagiarios extends Estudantes {
		

		private String setor;
		
		public String getSetor() {
			return setor;
		}
		public void setSetor(String setor) {
			this.setor = setor;
		}
		//O estagi�rio granhara duas vezes o valor padr�o do Auxilio.
		public double getAuxilio() {
			// ----reescrita--------
			//Chamando atributo da classe M�E
			return super.auxilio*2;
		}
		public void setAuxilio(double auxilio) {
			this.auxilio = auxilio;
		}
	
		
	}	
