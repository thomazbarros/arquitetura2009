package view;

import controller.Arquitetura;
import controller.ManipulaMemoria;
import controller.RodaPrograma;
import controller.RodarThread;
import controller.ViewThread;



public class Main {

	private static final long serialVersionUID = 1L;
	private static Arquitetura arquitetura;
	private static ManipulaMemoria manipulaMemoria;
	
	public static void main(String[] args) {
		Arquitetura arquitetura = new Arquitetura();
		ManipulaMemoria manipulaMemoria = new ManipulaMemoria(arquitetura);
		RodaPrograma rodaPrograma = new RodaPrograma(arquitetura,manipulaMemoria);
		RodarThread rodarThread = new RodarThread(rodaPrograma,manipulaMemoria);
		rodarThread.start();
		ViewThread thread = new ViewThread(manipulaMemoria,rodaPrograma,rodarThread);
		thread.start();
		
		//while(true){
	//		rodarThread.run();
	//		thread.run();
	//	}
		//arquitetura = new Arquitetura();
		//manipulaMemoria = new ManipulaMemoria(arquitetura);
		//new TelaPrincipal("",manipulaMemoria,rodaPrograma);
		
		//rodaPrograma.rodaMicro();
		//rodaPrograma.rodar();
	}
	
}
