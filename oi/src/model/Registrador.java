package model;
 
public class Registrador{
	
	private boolean pontoDeControle;
	private long valor;
		
	public Registrador(boolean pontoDeControle, long valor){
		this.pontoDeControle = pontoDeControle;
		this.valor = valor;
	}
	
	public boolean isPontoDeControle() {
			return pontoDeControle;
	}
	
	public void setPontoDeControle(boolean pontoDeControle) {
		this.pontoDeControle = pontoDeControle;
	}
	
	public void ativaPontoDeControle(long valor) {
			if(pontoDeControle){
				this.valor = valor;
				pontoDeControle = false;
			}
	}
	
	public long getValor() {
			return valor;
	}
	
	public void setValor(long valor) {
			this.valor = valor;
	}
}
