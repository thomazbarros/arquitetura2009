package novoview;

import controller.Arquitetura;
import controller.ManipulaMemoria;
import controller.RodaPrograma;



public class Main {

	private static final long serialVersionUID = 1L;
	private static Arquitetura arquitetura;
	private static ManipulaMemoria manipulaMemoria;
	
	public static void main(String[] args) {
		Arquitetura arquitetura = new Arquitetura();
		ManipulaMemoria manipulaMemoria = new ManipulaMemoria(arquitetura);
		RodaPrograma rodaPrograma = new RodaPrograma(arquitetura,manipulaMemoria);
		
		//arquitetura = new Arquitetura();
		//manipulaMemoria = new ManipulaMemoria(arquitetura);
		new TelaPrincipal("",manipulaMemoria,rodaPrograma);
		
		//rodaPrograma.rodaMicro();
		//rodaPrograma.rodar();
	}
	
}
