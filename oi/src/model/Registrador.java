package model;
 
public class Registrador{
	
	private boolean pontoDeControle;
	private Integer valor;
		
	public Registrador(boolean pontoDeControle, Integer valor){
		this.pontoDeControle = pontoDeControle;
		this.valor = valor;
	}
	
	public boolean isPontoDeControle() {
			return pontoDeControle;
	}
	
	public void setPontoDeControle(boolean pontoDeControle) {
		this.pontoDeControle = pontoDeControle;
	}
	
	public void ativaPontoDeControle(Integer valor) {
			if(pontoDeControle){
				this.valor = valor;
				pontoDeControle = false;
			}
	}
	
	public Integer getValor() {
			return valor;
	}
	
	public void setValor(Integer valor) {
			this.valor = valor;
	}
}
