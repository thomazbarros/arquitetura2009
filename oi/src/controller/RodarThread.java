package controller;

public class RodarThread extends Thread{
	//private RodaPrograma rodaPrograma;
	//private ManipulaMemoria manipulaMemoria;
	private ManipulaMemoria manipulaMemoria;
	private boolean loop;
	
	public RodarThread(ManipulaMemoria manipulaMemoria){//RodaPrograma rodaPrograma,ManipulaMemoria manipulaMemoria){
		super("Rodar");
		this.manipulaMemoria = manipulaMemoria;
		loop = true;
		//this.rodaPrograma = rodaPrograma;
		//this.manipulaMemoria = manipulaMemoria;
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
