package controller;

public class RodarThread extends Thread{
	//private RodaPrograma rodaPrograma;
	//private ManipulaMemoria manipulaMemoria;
	private ManipulaMemoria manipulaMemoria;
	private RodaPrograma rodaPrograma;
	private boolean loop;
	
	public RodarThread(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){//RodaPrograma rodaPrograma,ManipulaMemoria manipulaMemoria){
		super("Rodar");
		this.rodaPrograma = rodaPrograma;
		this.manipulaMemoria = manipulaMemoria;
		loop = true;
		//this.rodaPrograma = rodaPrograma;
		//this.manipulaMemoria = manipulaMemoria;
	}
	
	public void run(){
		while(true){
			//System.out.println(getName());
			if(!manipulaMemoria.getArquitetura().isRodaThread()){
				try{
					sleep(1000/80);
				}catch(Exception e){}
			}else{
				System.out.println("ENTREI AQUI");
				rodaPrograma.run();
				manipulaMemoria.getArquitetura().setRodaThread(false);
				System.out.println("SAI DAQUI");
				manipulaMemoria.getArquitetura().getPainelBaixo().setDisponibilidadeProximoPasso(false);
				//break;
			}
		}
	}
	
	/*public void run(){
		while(loop){
			System.out.println("FOR");
			while(!manip.isContinuar()){
				System.out.println("WHILE");
				try{
					sleep(1000);
					//Thread.currentThread().sleep(1000);
				}catch(Exception e){}
				System.out.println(Thread.currentThread().getName());
				//arquitetura.setContinuar(true);
			}
			System.out.println("IF "+arquitetura.isContinuar());
			if (arquitetura.isContinuar()) {
				System.out.println("NUNCA ENTREI AQUI");
				loop = false;
			}
		}
		loop = true;
	//	super.run();
	//	rodaPrograma.rodar();
	//	manipulaMemoria.getArquitetura().atualizaPainel();
	}*/

	public boolean isLoop() {
		return loop;
	}
	
	public void travaThread(){
		manipulaMemoria.getInstrucao().travaThread();
	}
	
	/*public void setContinuar(boolean continuar){
		manipulaMemoria.getArquitetura().setContinuar(true);
	}*/
	
}
