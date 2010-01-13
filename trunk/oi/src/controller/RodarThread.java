package controller;

public class RodarThread extends Thread{

	private ManipulaMemoria manipulaMemoria;
	private RodaPrograma rodaPrograma;
	private boolean loop;
	
	public RodarThread(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){
		super("Rodar");
		this.rodaPrograma = rodaPrograma;
		this.manipulaMemoria = manipulaMemoria;
		loop = true;

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
	
	public void travaThread(){
		manipulaMemoria.getInstrucao().travaThread();
	}
	
	public void paraThreads(){
		manipulaMemoria.getInstrucao().interrupt();
		rodaPrograma.interrupt();
	}
	

	
	public int getValorDesvio(){
		Arquitetura arquitetura = manipulaMemoria.getArquitetura();
		Conversor conversor = new Conversor();
		
		String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getPc().getValor());
		int label = conversor.binarioParaInteiro(binario);
		System.out.println(label);
		arquitetura.getMemoria().imprimeTestes();
		int temp = arquitetura.getMemoria().getPosicaoLabel(label);
		if(temp != -1){
			arquitetura.getMemoria().setPosicaoAtual(temp);
			return temp;

		}else{
			return -1;
		}
	}
	
}
