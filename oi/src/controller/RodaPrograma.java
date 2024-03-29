
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
		//if(arquitetura.getMemoria().obtemDadoBacking(0).substring(0,2).equals(Constantes.BITS_INSTRUCAO)){
		arquitetura.ativaPontoDeControle(memoriaDeControle.getMemoriaDeControle().get(conversor.enderecoParaInteiro(Constantes.REND_RECEBE_PC_2)));
		//}
		//else{
			//System.out.println("ESTOU FAZENDO MAIS UM");
			//System.out.println("INDEX: " + memoriaDeControle.getMemoriaDeControle().get(conversor.binarioParaInteiro(Constantes.REND_RECEBE_PC_MAIS_1)));
			//arquitetura.ativaPontoDeControle(memoriaDeControle.getMemoriaDeControle().get(conversor.binarioParaInteiro(Constantes.REND_RECEBE_PC_MAIS_1)));
		//	arquitetura.ativaPontoDeControle(memoriaDeControle.getMemoriaDeControle().get(conversor.enderecoParaInteiro(Constantes.REND_RECEBE_PC_MAIS_1)));
		//}
		while(!arquitetura.isHalt()){
			manipulaMemoria.ler((int) arquitetura.getPc().getValor());
			
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
