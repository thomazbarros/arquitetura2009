package model;
 
public class Multiplexador{
	
	private boolean pontoDeControle, pontoDeControle2, pontoDeControle3;
	
	public Multiplexador(boolean pontoDeControle, boolean pontoDeControle2, boolean pontoDeControle3){
		this.pontoDeControle = pontoDeControle;
		this.pontoDeControle2 = pontoDeControle2;
		this.pontoDeControle3 = pontoDeControle3;
	}
	
	public Multiplexador(boolean pontoDeControle, boolean pontoDeControle2){
		this.pontoDeControle = pontoDeControle;
		this.pontoDeControle2 = pontoDeControle2;
	}
	
	public Multiplexador(boolean pontoDeControle){
		this.pontoDeControle = pontoDeControle;
	}

	public boolean isPontoDeControle() {
		return pontoDeControle;
	}

	public Integer ativaPontoDeControle(Integer valor1, Integer valor2){
		if(!pontoDeControle){
			return valor1; 
		}
		else{
			pontoDeControle = false;
			return valor2;
		}
	}
	
	public Integer ativaPontoDeControle(Integer valor1, Integer valor2, Integer valor3){
		if(!pontoDeControle){
			if(!pontoDeControle2){
				return valor1;
			}
			else{
				pontoDeControle2 = false;
				return valor2;
			}
		}
		else{
			pontoDeControle = false;
			return valor3;
		}
	}
			
	public Integer ativaPontoDeControle(Integer valor1, Integer valor2, Integer valor3, Integer valor4){
		if(!pontoDeControle){
			if(!pontoDeControle2){
				return valor1;
			}
			else{
				pontoDeControle2 = false;
				return valor2;
			}
		}
		else{
			if(!pontoDeControle2){
				pontoDeControle = false;
				return valor3;
			}
			else{
				pontoDeControle = false;
				pontoDeControle2 = false;
				return valor4;
			}
		}
	}
	
	public Integer ativaPontoDeControle(Integer valor1, Integer valor2, Integer valor3, Integer valor4, Integer valor5){
		if(!pontoDeControle){
			if(!pontoDeControle2){
				if(!pontoDeControle3){
					return valor1;
				}
				else{
					pontoDeControle3 = false;
					return valor2;
				}
			}
			else{
				pontoDeControle2 = false;
				if(!pontoDeControle3){
					return valor3;
				}
				else{
					pontoDeControle3 = false;
					return valor4;
				}
			}
		}
		else{
			pontoDeControle = false;
			return valor5;
		}
	}

	public boolean isPontoDeControle2() {
		return pontoDeControle2;
	}

	public void setPontoDeControle(boolean pontoDeControle) {
		this.pontoDeControle = pontoDeControle;
	}

	public void setPontoDeControle2(boolean pontoDeControle2) {
		this.pontoDeControle2 = pontoDeControle2;
	}

	public boolean isPontoDeControle3() {
		return pontoDeControle3;
	}

	public void setPontoDeControle3(boolean pontoDeControle3) {
		this.pontoDeControle3 = pontoDeControle3;
	}
}