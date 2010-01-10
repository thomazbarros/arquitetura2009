package controller;

import model.Constantes;

public class RodaPrograma extends Thread{
	
	private Arquitetura arquitetura;
	private ManipulaMemoria manipulaMemoria;
	
	public RodaPrograma(Arquitetura arquitetura, ManipulaMemoria manipulaMemoria){
		this.arquitetura = arquitetura;
		this.manipulaMemoria = manipulaMemoria;
	}
	
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
		}
		manipulaMemoria.getArquitetura().zeraPontosDeControle();
		manipulaMemoria.getArquitetura().atualizaPainel();
		////System.out.println("R0 depois:"+arquitetura.getR0().getValor());
		////System.out.println(arquitetura.getR1().getValor());
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
		
}
