package novoview;
 
import java.awt.Color;

public class PontoDeControle {
	private static final Color APAGADO = Color.CYAN;
	private static final Color ACESO = Color.RED;
	
	
	private String str;
	private boolean ativo;
	private int x;
	private int y;
	private Color cor;
	
	public PontoDeControle(String str, int x, int y) {
		super();
		this.str = str;
		this.ativo = false;
		this.x = x;
		this.y = y;
		this.setCor(APAGADO);
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
		if(ativo){
			setCor(ACESO);
		}else{
			setCor(APAGADO);
		}
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	private void setCor(Color cor) {
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}
	
}
