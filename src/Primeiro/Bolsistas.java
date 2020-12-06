package Primeiro;
// HERENCA DE DADOS
public class Bolsistas extends Estudantes {
	
	private String area;
	
	public double getAuxilio() {
		return super.auxilio*0.5;
	}
	public void setAuxilio(double auxilio) {
		this.auxilio = auxilio;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	

}
