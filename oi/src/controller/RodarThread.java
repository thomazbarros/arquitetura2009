package controller;

import model.Constantes;

public class RodarThread extends Thread{

	private ManipulaMemoria manipulaMemoria;
	private RodaPrograma rodaPrograma;
	private boolean loop, sair;
	
	public RodarThread(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){
		super("Rodar");
		this.rodaPrograma = rodaPrograma;
		this.manipulaMemoria = manipulaMemoria;
		loop = true;
		sair = false;
	}
	
	public void run(){
		while(true){

			if(!manipulaMemoria.getArquitetura().isRodaThread()){
				try{
					sleep(1000/80);
				}catch(Exception e){}
			}else{

				rodaPrograma.run();
				manipulaMemoria.getArquitetura().setRodaThread(false);

				manipulaMemoria.getArquitetura().getPainelBaixo().setDisponibilidadeProximoPasso(false);

			}
		}
	}
	
	public boolean isLoop() {
		return loop;
	}
	
	public void paraThread(){
		rodaPrograma.interrupt();
	}
	
	public int getValorDesvio(){
		Arquitetura arquitetura = manipulaMemoria.getArquitetura();
		Conversor conversor = new Conversor();
		
		String binario = arquitetura.getMemoria().obtemDadoBacking((int) arquitetura.getPc().getValor());
		int label = conversor.binarioParaInteiro(binario);
		//System.out.println(label);
		//System.out.println("RODAR TRHEAD BUGADA. TESTES : ");
		//arquitetura.getMemoria().imprimeTestes();
		long temp = (int) arquitetura.getMemoria().getPosicaoLabel(label);
		//System.out.println("TEMP VALE "+temp);
		if(temp != -1){
			arquitetura.getMemoria().setPosicaoAtual((int)temp);
			arquitetura.getMemoria().setPosicao(temp-1);
			return (int)temp;

		}else{
			return -1;
		}
	}
	
	public void atualizaPosicao(){
		Arquitetura arquitetura = manipulaMemoria.getArquitetura();
		arquitetura.getMemoria().atualizaPosicao();
	}
	
	public void travaThread(){
		if(manipulaMemoria.getArquitetura().getModo() == Constantes.RODAMICRO){
			try {				

				while (!manipulaMemoria.getArquitetura().isContinuar() && !sair) {// interrompe a thread

					sleep(1000 / 80);

				}
				manipulaMemoria.getArquitetura().setContinuar(false);
				sair = false;

				//System.out.println("SAINDO DA INSTRUCAO");
			} catch (Exception e) {
				System.out.println("Erro na Thread Instrucoes");
			}
		}
	}
	
	public void travaThreadInstrucao(){
		if(manipulaMemoria.getArquitetura().getModo() == Constantes.RODAINSTRUCAO){
			try {				

				while (!manipulaMemoria.getArquitetura().isContinuar() && !sair) {// interrompe a thread

					sleep(1000 / 80);

				}
				manipulaMemoria.getArquitetura().setContinuar(false);
				sair = false;

				//System.out.println("SAINDO DA INSTRUCAO");
			} catch (Exception e) {
				System.out.println("Erro na Thread Instrucoes");
			}
		}
	}
	
}
