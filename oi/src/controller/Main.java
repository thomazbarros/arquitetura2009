package controller;

import view.TelaPrincipal;
import controller.Arquitetura;
import controller.ManipulaMemoria;
import controller.RodaPrograma;
import controller.RodarThread;
import controller.ViewThread;



public class Main {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private static Arquitetura arquitetura;
	@SuppressWarnings("unused")
	private static ManipulaMemoria manipulaMemoria;
	
	public static void main(String[] args) {
		Arquitetura arquitetura = null;//= new Arquitetura();
		ManipulaMemoria manipulaMemoria = null;// new ManipulaMemoria(arquitetura);
		RodaPrograma rodaPrograma = new RodaPrograma(arquitetura,manipulaMemoria);
		//rodaPrograma.start();
		//RodarThread rodarThread = new RodarThread(manipulaMemoria,rodaPrograma);
		//rodarThread.start();
		//arquitetura.setRodarThread(rodarThread);

		new TelaPrincipal("",manipulaMemoria,rodaPrograma);//,rodarThread);

	}
	
}
