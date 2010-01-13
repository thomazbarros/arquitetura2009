package controller;

import view.TelaPrincipal;

public class ViewThread extends Thread {
	@SuppressWarnings("unused")
	private ManipulaMemoria manipulaMemoria;
	@SuppressWarnings("unused")
	private RodaPrograma rodaPrograma;
	@SuppressWarnings("unused")
	private RodarThread rodarThread;
	
	public ViewThread(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma,RodarThread rodarThread){
		this.manipulaMemoria = manipulaMemoria;
		this.rodaPrograma = rodaPrograma;
		this.rodarThread = rodarThread;

	}
	
	public void run(){

	}
}
