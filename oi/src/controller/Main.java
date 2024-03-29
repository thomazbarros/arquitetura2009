package controller;

import view.TelaPrincipal;
import controller.Arquitetura;
import controller.ManipulaMemoria;
import controller.RodaPrograma;
import controller.RodarThread;



public class Main {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private static Arquitetura arquitetura;
	@SuppressWarnings("unused")
	private static ManipulaMemoria manipulaMemoria;
	
	public static void main(String[] args) {
	  Arquitetura arquitetura = new Arquitetura();
		
		System.out.println("Mem�ria de controle");
		
		for(int i = 0; i < arquitetura.getMemoriaDeControle().getMemoriaDeControle().size(); i++){
		  System.out.print(i+1 + "-");
          arquitetura.getMemoriaDeControle().getMemoriaDeControle().get(i).microinstrucao();
		}
		
		System.out.println("");
		
		manipulaMemoria = new ManipulaMemoria(arquitetura);
		RodaPrograma rodaPrograma = new RodaPrograma(arquitetura,manipulaMemoria);
		rodaPrograma.start();
		RodarThread rodarThread = new RodarThread(manipulaMemoria,rodaPrograma);
		rodarThread.start();
		arquitetura.setRodarThread(rodarThread);

		new TelaPrincipal("",manipulaMemoria,rodaPrograma);	
	}
	
}
