
package controller;

import model.Constantes;
import model.MemoriaDeControle;

public class RodaPrograma extends Thread{
	
	private Arquitetura arquitetura;
	private ManipulaMemoria manipulaMemoria;
	private MemoriaDeControle memoriaDeControle;

	
	public RodaPrograma(Arquitetura arquitetura, ManipulaMemoria manipulaMemoria){
		this.arquitetura = arquitetura;
		this.manipulaMemoria = manipulaMemoria;
		memoriaDeControle = new MemoriaDeControle();
	}
	
	public void start(){}
	
	public void run(){

		Conversor conversor = new Conversor();
		
		arquitetura.ativaPontoDeControle(memoriaDeControle.getMemoriaDeControle().get(conversor.binarioParaInteiro(Constantes.REND_RECEBE_PC_2)));
		System.out.println("RODEI UMA VEZ NA VIDA");
		while(!arquitetura.isHalt()){
			System.out.println("Voce vai me cegar e eu vou consentir");
			manipulaMemoria.ler((int) arquitetura.getPc().getValor());
			
			if(arquitetura.getModo() == Constantes.RODAINSTRUCAO){
				travaThread();
			}
		}
		System.out.println("E JA SAI");
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
