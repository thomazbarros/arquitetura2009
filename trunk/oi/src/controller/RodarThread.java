package controller;

public class RodarThread extends Thread{
	private RodaPrograma rodaPrograma;
	//private boolean continuar;
	private boolean rodar;
	private ManipulaMemoria manipulaMemoria;
	
	public RodarThread(RodaPrograma rodaPrograma,ManipulaMemoria manipulaMemoria){
		this.rodaPrograma = rodaPrograma;
		this.manipulaMemoria = manipulaMemoria;
		//continuar = false;
		rodar = false;
	}
	
	public void run(){
		System.out.println("thread works!");
		if(rodar){
			System.out.println("rodando");
			rodaPrograma.rodar();
			manipulaMemoria.getArquitetura().atualizaPainel();
			rodar = false;
		}
	}
	
	public void setContinuar(boolean continuar){
		//manipulaMemoria.getArquitetura().setContinuar(true);
	}
	
	public void setRodar(boolean rodar){
		this.rodar = rodar;
	}
	
}
