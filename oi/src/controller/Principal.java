package controller;
 
public class Principal {

	public static void main(String[] args) {
		Arquitetura arquitetura = new Arquitetura();
		ManipulaMemoria manipulaMemoria = new ManipulaMemoria(arquitetura);
		RodaPrograma rodaPrograma = new RodaPrograma(arquitetura,manipulaMemoria);
		

		manipulaMemoria.decifraInstrucao("D:/ciencia da computacao/arquitetura.txt");


		rodaPrograma.run(); 

		
		//System.out.println(arquitetura.getR0().getValor());
		//System.out.println(arquitetura.getR1().getValor());
		//System.out.println(arquitetura.getR2().getValor());
		//System.out.println(arquitetura.getR3().getValor());
		//System.out.println(arquitetura.getR4().getValor());
	}

}
