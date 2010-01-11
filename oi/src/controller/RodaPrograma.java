package controller;

import model.Constantes;

public class RodaPrograma extends Thread{
	
	private Arquitetura arquitetura;
	private ManipulaMemoria manipulaMemoria;
	//private boolean sair;
	
	public RodaPrograma(Arquitetura arquitetura, ManipulaMemoria manipulaMemoria){
		this.arquitetura = arquitetura;
		this.manipulaMemoria = manipulaMemoria;
	//	sair = false;
	}
	
	public void start(){}
	
	public void run(){
		//System.out.println(arquitetura.getMemoria());
		System.out.println("Rodando "+Thread.currentThread().getName());
		String instrucao;
		arquitetura.buscaInstrucao();
		////System.out.println("R0 antes:"+arquitetura.getR0().getValor());
		instrucao = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getPc().getValor());
		while(!manipulaMemoria.isHalt(instrucao)){
			//System.out.println("loop :P");
			//manipulaMemoria.ler(arquitetura.getMemoria().getPosicaoAtual());
			manipulaMemoria.ler(arquitetura.getPc().getValor());
			arquitetura.buscaInstrucao();
			instrucao = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getPc().getValor());
			if(arquitetura.getModo() == Constantes.RODAINSTRUCAO){
				//System.out.println("Pontos de controle no momento");
				//manipulaMemoria.getArquitetura().atualizaPainel();
				//System.out.println("Pontos de controle no momento seguinte");
				travaThread();
			}
		}
		manipulaMemoria.getArquitetura().zeraPontosDeControle();
		manipulaMemoria.getArquitetura().atualizaPainel();
		////System.out.println("R0 depois:"+arquitetura.getR0().getValor());
		////System.out.println(arquitetura.getR1().getValor());
		System.out.println("Parando Rodar");
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
			//System.out.println("RODAMICRO");
			while (!arquitetura.isContinuar()) {// interrompe a thread
				//System.out.println("ESTOU NO LOOP");
				sleep(1000 / 80);
				//AdministraView.getView().setStatus("Esperando ...");
			}
			arquitetura.setContinuar(false);
			//if (arquitetura.isContinuar()){
			//	loop = true;
			//}
		} catch (Exception e) {
			System.out.println("Erro na Thread Instrucoes");
		}
	}
}
