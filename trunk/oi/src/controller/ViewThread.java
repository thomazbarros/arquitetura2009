package controller;

import view.TelaPrincipal;

public class ViewThread extends Thread {
	private ManipulaMemoria manipulaMemoria;
	private RodaPrograma rodaPrograma;
	private RodarThread rodarThread;
	
	public ViewThread(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma,RodarThread rodarThread){
		this.manipulaMemoria = manipulaMemoria;
		this.rodaPrograma = rodaPrograma;
		this.rodarThread = rodarThread;

	}
	
	public void run(){

	}
}
