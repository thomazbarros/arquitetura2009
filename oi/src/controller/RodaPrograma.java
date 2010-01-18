package controller;

import model.Constantes;

public class RodaPrograma extends Thread{
	
	private Arquitetura arquitetura;
	private ManipulaMemoria manipulaMemoria;

	
	public RodaPrograma(Arquitetura arquitetura, ManipulaMemoria manipulaMemoria){
		this.arquitetura = arquitetura;
		this.manipulaMemoria = manipulaMemoria;

	}
	
	public void start(){}
	
	public void run(){

		String instrucao;
		arquitetura.buscaInstrucao();

		instrucao = arquitetura.getMemoria().obtemDadoBacking((int) arquitetura.getPc().getValor());
		while(!manipulaMemoria.isHalt(instrucao)){

			manipulaMemoria.ler((int) arquitetura.getPc().getValor());
			arquitetura.buscaInstrucao();
			instrucao = arquitetura.getMemoria().obtemDadoBacking((int) arquitetura.getPc().getValor());
			if(arquitetura.getModo() == Constantes.RODAINSTRUCAO){

				travaThread();
			}
		}
		manipulaMemoria.getArquitetura().zeraPontosDeControle();
		manipulaMemoria.getArquitetura().atualizaPainel();

	}
	
	public void rodaMicro(){
		arquitetura.setModo(Constantes.RODAMICRO);
	}
	
	public void rodaInstrucao(){
		arquitetura.setModo(Constantes.RODAINSTRUCAO);
	}
	
	public void rodaPrograma(){
		arquitetura.setModo(Constantes.RODAPROGRAMA);
	}
	
	public void setRun(){
		run();
	}
	
	public void travaThread(){
		try {				

			while (!arquitetura.isContinuar()) {// interrompe a thread

				sleep(1000 / 80);

			}
			arquitetura.setContinuar(false);

		} catch (Exception e) {
			System.out.println("Erro na Thread Instrucoes");
		}
	}
}
