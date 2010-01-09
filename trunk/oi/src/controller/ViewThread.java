package controller;

import view.TelaPrincipal;

public class ViewThread extends Thread {
	private ManipulaMemoria manipulaMemoria;
	private RodaPrograma rodaPrograma;
	
	public ViewThread(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){
		this.manipulaMemoria = manipulaMemoria;
		this.rodaPrograma = rodaPrograma;
	}
	
	public void run(){
		new TelaPrincipal("",manipulaMemoria,rodaPrograma);

	}
}
