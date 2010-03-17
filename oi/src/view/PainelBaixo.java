package view;
 
import java.awt.Dimension;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.Constantes;

import controller.Arquitetura;
import controller.ManipulaArquivo;
import controller.ManipulaMemoria;
import controller.RodaPrograma;

public class PainelBaixo extends JPanel {

	private static final long serialVersionUID = 1L;
	//private PainelBaixo painelBaixo = null;  //  @jve:decl-index=0:visual-constraint="70,34"
	private ManipulaMemoria manipulaMemoria;


	private JScrollPane scrollPrograma = null;
	private JScrollPane scrollCache = null;
	private JScrollPane scrollmemoria = null;
	
	private JList listPrograma = null;
	private JList listCache = null;
	private JList listMemória = null;
	
	private JLabel labelMicroprograma = null;
	private JLabel memoria = null;
	private JLabel cache = null;  //  @jve:decl-index=0:visual-constraint="196,47"
	private JLabel psw = null;
	private JLabel overflow = null;
	private JLabel zero = null;
	private JLabel carry = null;  //  @jve:decl-index=0:visual-constraint="916,10"
	private JLabel sinal = null;
	private JLabel labelComecar = null;
	private JLabel labelProxPasso = null;
	private JLabel labelPercentagemCache = null;
	private JLabel labelLocalBusca = null;
	private JLabel labelMicro = null;
	private JLabel enderecoMicro = null;
	
	private JTextField campoOverflow = null;
	private JTextField campoZero = null;  //  @jve:decl-index=0:visual-constraint="537,10"
	private JTextField campoCarry = null;
	private JTextField campoSinal = null;
	
	private JButton comecar = null;
	private JButton proxPasso = null;
	@SuppressWarnings("unused")
	private RodaPrograma rodaPrograma;
	private DecimalFormat formataDecimal;

	
	/**
	 * This method initializes painelBaixo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	
	public PainelBaixo(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){//,RodarThread rodarThread){
		this.manipulaMemoria = manipulaMemoria;
		this.rodaPrograma = rodaPrograma;
		formataDecimal = new DecimalFormat("0.00");  
		inicializar();
	}


	public void inicializar() {
		labelProxPasso = new JLabel();
		labelProxPasso.setBounds(new Rectangle(784, 214, 214, 27));
			labelProxPasso.setText("Clique abaixo para o próximo passo:");
			labelComecar = new JLabel();
			labelComecar.setBounds(new Rectangle(815, 140, 188, 23));
			labelComecar.setText("Clique abaixo para começar:");
			sinal = new JLabel();
			sinal.setBounds(new Rectangle(754, 78, 14, 20));
			sinal.setText("S");
			carry = new JLabel();
			carry.setBounds(new Rectangle(711, 78, 14, 20));
			carry.setText("C");
			zero = new JLabel();
			zero.setBounds(new Rectangle(664, 78, 14, 20));
			zero.setText("Z");
			overflow = new JLabel();
			overflow.setBounds(new Rectangle(623, 78, 14, 20));
			overflow.setText("O");
			psw = new JLabel();
			psw.setBounds(new Rectangle(610, 40, 362, 23));
			psw.setText("PSW");
			labelPercentagemCache = new JLabel();
			labelPercentagemCache.setBounds(new Rectangle(610, 150, 362, 23));
			labelPercentagemCache.setText("Percentagem do Cache:");
			labelLocalBusca = new JLabel();
			labelLocalBusca.setBounds(new Rectangle(610, 180, 362, 23));
			labelMicro = new JLabel();
			labelMicro.setBounds(new Rectangle(610, 240, 362, 23));
			labelMicro.setText("Próxima microinstrução:");
			enderecoMicro = new JLabel();
			enderecoMicro.setBounds(new Rectangle(610, 270, 362, 23));
			//enderecoMicro.setText("Local da busca");
			cache = new JLabel();
			cache.setBounds(new Rectangle(405+20, 40, 153, 18));
			cache.setText("Cache");
			memoria = new JLabel();
			memoria.setBounds(new Rectangle(219, 28, 143, 34));
			memoria.setText("Memória");
			labelMicroprograma = new JLabel();
			labelMicroprograma.setBounds(new Rectangle(27, 30, 154, 30));
			labelMicroprograma.setText("Microprograma");
			this.setLayout(null);
			this.setSize(new Dimension(1024, 768));
			this.add(getScrollmemoria(), null);
			this.add(getScrollPrograma(), null);
			this.add(getScrollCache(), null);
			this.add(labelMicroprograma, null);
			this.add(memoria, null);
			this.add(cache, null);
			this.add(psw, null);
			this.add(overflow, null);
			this.add(zero, null);
			this.add(carry, null);
			this.add(sinal, null);
			this.add(getCampoOverflow(), null);
			this.add(getCampoZero(), null);
			this.add(getCampoCarry(), null);
			this.add(getCampoSinal(), null);
			this.add(getComecar(), null);
			this.add(getProxPasso(), null);
			this.add(labelComecar, null);
			this.add(labelProxPasso, null);
			this.add(labelPercentagemCache,null);
			this.add(labelLocalBusca,null);
			this.add(labelMicro,null);
			this.add(enderecoMicro,null);
	}
	

	public void preencheMemoria(){
		Arquitetura arquitetura = manipulaMemoria.getArquitetura();
		Vector<String> vetor = new Vector<String>();
		int posicao = 0;
		for(int i = 0; i < arquitetura.getMemoria().getTamanho();i++){
			vetor.add(posicao +".  " +arquitetura.getMemoria().obtemDadoBacking(i));
			posicao++;
		}
		
		listMemória.setListData(vetor);
		
	}
	
	public void preencheCache(){
		Arquitetura arquitetura = manipulaMemoria.getArquitetura();
		Vector<String> vetor = new Vector<String>();
		
		int posicoesOcupadas = 0;
		
		for(int i = 0; i < arquitetura.getCache().getTamanho();i++){
			vetor.add(arquitetura.getCache().imprimeCache(i));
			
			posicoesOcupadas++;
		}
				
		listCache.setListData(vetor);
	}
	
	public void preencheMicroprograma(String caminho){
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		ArrayList<String> linhas = manipulaArquivo.ler(caminho);
		Vector<String> vetor = new Vector<String>();
		
		for (String linha : linhas) {
			vetor.add(linha);
		}
		
		listPrograma.setListData(vetor);
	}
	
	public void preenchePSW(){
		campoOverflow.setText(String.valueOf(manipulaMemoria.getArquitetura().getUla().getO()));
		campoZero.setText(String.valueOf(manipulaMemoria.getArquitetura().getUla().getZ()));
		campoCarry.setText(String.valueOf(manipulaMemoria.getArquitetura().getUla().getC()));
		campoSinal.setText(String.valueOf(manipulaMemoria.getArquitetura().getUla().getN()));
	}
	
	/**
	 * This method initializes scrollmemoria	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getScrollmemoria() {
		if (scrollmemoria == null) {
			scrollmemoria = new JScrollPane();
			scrollmemoria.setBounds(new Rectangle(214, 72, 176 + 20, 225));
			scrollmemoria.setViewportView(getListMemória());
		}
		return scrollmemoria;
	}

	/**
	 * This method initializes listMemória	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getListMemória() {
		if (listMemória == null) {
			listMemória = new JList();
		}
		return listMemória;
	}

	/**
	 * This method initializes scrollPrograma	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getScrollPrograma() {
		if (scrollPrograma == null) {
			scrollPrograma = new JScrollPane();
			scrollPrograma.setBounds(new Rectangle(22, 72, 176, 225));
			scrollPrograma.setViewportView(getListPrograma());
		}
		return scrollPrograma;
	}

	/**
	 * This method initializes listPrograma	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getListPrograma() {
		if (listPrograma == null) {
			listPrograma = new JList();
		}
		return listPrograma;
	}

	/**
	 * This method initializes scrollCache	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getScrollCache() {
		if (scrollCache == null) {
			scrollCache = new JScrollPane();
			scrollCache.setBounds(new Rectangle(400+20, 70, 176, 225));
			scrollCache.setViewportView(getListCache());
		}
		return scrollCache;
	}

	/**
	 * This method initializes listCache	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getListCache() {
		if (listCache == null) {
			listCache = new JList();
		}
		return listCache;
	}

	/**
	 * This method initializes campoOverflow	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoOverflow() {
		if (campoOverflow == null) {
			campoOverflow = new JTextField();
			campoOverflow.setBounds(new Rectangle(614, 109, 29, 20));
		}
		return campoOverflow;
	}

	/**
	 * This method initializes campoZero	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoZero() {
		if (campoZero == null) {
			campoZero = new JTextField();
			campoZero.setBounds(new Rectangle(658, 109, 29, 20));
		}
		return campoZero;
	}

	/**
	 * This method initializes campoCarry	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoCarry() {
		if (campoCarry == null) {
			campoCarry = new JTextField();
			campoCarry.setBounds(new Rectangle(703, 109, 29, 20));
		}
		return campoCarry;
	}

	/**
	 * This method initializes campoSinal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getCampoSinal() {
		if (campoSinal == null) {
			campoSinal = new JTextField();
			campoSinal.setBounds(new Rectangle(750, 109, 29, 20));
		}
		return campoSinal;
	}


	/**
	 * This method initializes comecar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getComecar() {
		if (comecar == null) {
			comecar = new JButton();
			comecar.setBounds(new Rectangle(832, 171, 128, 27));
			comecar.setText("Começar");
			setDisponibilidadeComecar(false);
			comecar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					setTextoEnderecoMicro(Constantes.RDADO_RECEBE_INFORMACAO_LIDA_BUSCA);
					setTextoLabelLocalBusca("");
					manipulaMemoria.getArquitetura().setRodaThread(true);
					setDisponibilidadeComecar(false);
					setDisponibilidadeProximoPasso(true);

				}
			});
		}
		return comecar;
	}


	/**
	 * This method initializes proxPasso	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getProxPasso() {
		if (proxPasso == null) {
			proxPasso = new JButton();
			proxPasso.setBounds(new Rectangle(830, 244, 135, 25));
			proxPasso.setText("Próximo Passo");
			setDisponibilidadeProximoPasso(false);
			proxPasso.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					setTextoLabelLocalBusca("");
					manipulaMemoria.getArquitetura().setContinuar(true);

				}
			});
		}
		return proxPasso;
	}
	
	public JButton getProximoPasso(){
		return this.proxPasso;
	}
	
	public void atualizarConteudo(){
		preenchePSW();
		preencheMemoria();
		preencheCache();
		this.revalidate();
		this.repaint();
	}
	
	public void setDisponibilidadeProximoPasso(boolean disponivel){
		proxPasso.setEnabled(disponivel);
	}
	
	public void setDisponibilidadeComecar(boolean disponivel){
		comecar.setEnabled(disponivel);
	}
	
	public void setTextoLabelPercentagemCache(Double percentagem){
		labelPercentagemCache.setText("Percentagem do Cache: "+formataDecimal.format(percentagem));
	}
	
	public void setTextoLabelLocalBusca(String texto){
		if(manipulaMemoria.getArquitetura().getModo() == Constantes.RODAMICRO){
			labelLocalBusca.setText(texto);
		}
	}
	
	public void setTextoEnderecoMicro(String endereco){
		enderecoMicro.setText(endereco);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
