package view;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.ManipulaMemoria;
import controller.RodaPrograma;
import controller.RodarThread;

public class PainelBase extends JPanel {
	private static final long serialVersionUID = 1L;
	private PainelBase painelbase = null;  //  @jve:decl-index=0:visual-constraint="100,13"
	private ManipulaMemoria manipulaMemoria;
	private PainelBaixo painelBaixo; //= new PainelBaixo();
	private PainelULA painelULA;
	public  JScrollPane scroll;
	//public  JScrollPane scroll2;
	public RodaPrograma rodaPrograma;
	/**
	 * This method initializes painelbase	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	/*public PainelBase(ManipulaMemoria manipulaMemoria){
		this.manipulaMemoria = manipulaMemoria;
	}*/
	public PainelBase(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){//,RodarThread rodarThread){
		this.manipulaMemoria = manipulaMemoria;
		this.rodaPrograma = rodaPrograma;
		painelBaixo = new PainelBaixo(manipulaMemoria,rodaPrograma);//,rodarThread);

		painelBaixo.reshape(0,400,1024,300);
		painelULA = new PainelULA();
		painelULA.setPreferredSize(new Dimension(1024, 600));
		scroll = new JScrollPane(painelULA);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.reshape(0,0,1020,422);

		this.add(scroll);
		//PARTE PROVISORIA PRO LEPOD
		//painelBaixo.setPreferredSize(new Dimension(1024, 600));
		//scroll2 = new JScrollPane(painelBaixo);
		//s//croll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//scroll2.reshape(0,400,1024,300);
		//this.add(scroll2);
		
		//FIM PROVISORIA PRO LEPOD
		this.add(painelBaixo);
		this.setLayout(null);
		manipulaMemoria.getArquitetura().setUlaGrafica(painelULA);
		manipulaMemoria.getArquitetura().setPainelBaixo(painelBaixo);
	}
	public PainelBaixo getPainelBaixo() {
		return painelBaixo;
	}
	


}
