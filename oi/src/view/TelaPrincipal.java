package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JWindow;

import model.Constantes;
import model.MemoriaCache;
import controller.FiltroData;
import controller.ManipulaMemoria;
import controller.RodaPrograma;

public class TelaPrincipal extends JFrame implements ActionListener{


	private static final long serialVersionUID = 1L;
	private JMenuBar menuPrincipal = null;
	private JMenu opcoes = null;
	@SuppressWarnings("unused")
	private JMenu jMenu = null;
	private JMenu ajuda = null;
	private JMenuItem carregarMicroprograma = null;
	private JMenuItem criarMicroprograma = null;
	private JMenuItem executar = null;
	private JMenuItem hexa = null;
	private JMenuItem sair = null;
	private JMenuItem instrucoes = null;
	private JMenuItem execMicroinst = null;
	private JMenuItem execMicroprog = null;
	@SuppressWarnings("unused")
	private CriaProgRunTime criarPrograma = null;
	
	
	private PainelBase painelbase;// = new PainelBase();
	


	private JFileChooser fileChooser;
	private ManipulaMemoria manipulaMemoria;
	@SuppressWarnings("unused")
	private RodaPrograma rodaPrograma;
	@SuppressWarnings("unused")
	private JWindow jWindow = null;
	@SuppressWarnings("unused")
	private JPanel jContentPane = null;

	public TelaPrincipal(String title,ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){//,RodarThread rodarThread) {
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
					.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			setDefaultLookAndFeelDecorated(false);
		}
		initialize(manipulaMemoria,rodaPrograma);//,rodarThread);
	}

	
	private void initialize(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){
		this.manipulaMemoria = manipulaMemoria;
		this.rodaPrograma = rodaPrograma;
		painelbase = new PainelBase(manipulaMemoria,rodaPrograma);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getMenuPrincipal());
		
		setTitle("Simulador de Arquitetura de Computadores");
		setContentPane(painelbase);


		setPreferredSize(new Dimension(1024, 768));
		setResizable(true);
		pack();
		setVisible(true);
	}
	/**
	 * This method initializes menuPrincipal	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getMenuPrincipal() {
		if (menuPrincipal == null) {
			menuPrincipal = new JMenuBar();
			menuPrincipal.add(getOpcoes());
			menuPrincipal.add(getAjuda());
		}
		return menuPrincipal;
	}
	/**
	 * This method initializes opcoes	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getOpcoes() {
		if (opcoes == null) {
			opcoes = new JMenu();
			opcoes.setText("Opções");
			opcoes.add(getExecutar());
			opcoes.add(getCriarMicroprograma());
			opcoes.add(getExecutar2());
			opcoes.add(getExecMicroinst());
			opcoes.add(getExecMicroprog());
			opcoes.add(getHexa());
			opcoes.add(getSair());
		}
		return opcoes;
	}

	/**
	 * This method initializes ajuda	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getAjuda() {
		if (ajuda == null) {
			ajuda = new JMenu();
			//ajuda.setText("Ajuda");
			ajuda.setText("Ajuda");
			ajuda.add(getInstrucoes());
		}
		return ajuda;
	}
	/**
	 * This method initializes executar	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getExecutar() {
		if (carregarMicroprograma == null) {
			carregarMicroprograma = new JMenuItem();
			carregarMicroprograma.setText("Carregar microprograma");
			carregarMicroprograma.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ativaCarregamento();
				}
			});
		}
		return carregarMicroprograma;
	}
	/**
	 * This method initializes criarMicroprograma	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getCriarMicroprograma() {
		if (criarMicroprograma == null) {
			criarMicroprograma = new JMenuItem();
			criarMicroprograma.setText("Criar Microprograma");
			criarMicroprograma.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					criarPrograma = new CriaProgRunTime();
				}
				});
		}
		return criarMicroprograma;
	}
	/**
	 * This method initializes executar	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getExecutar2() {
		if (executar == null) {
			executar = new JMenuItem();
			//executar.setText("Executar");
			executar.setText("Executar Microprograma");
			executar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				manipulaMemoria.getArquitetura().setModo(Constantes.RODAPROGRAMA);
			}
			});
		}
		return executar;
	}
	
	private JMenuItem getHexa() {
		if (hexa == null) {
			hexa = new JMenuItem();
			//executar.setText("Executar");
			hexa.setText("Mudar para Decimal");
			hexa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				manipulaMemoria.getArquitetura().setHexa(!manipulaMemoria.getArquitetura().isHexa());
				manipulaMemoria.getArquitetura().atualizaRegistradores();
				painelbase.getPainelBaixo().atualizarConteudo();
				painelbase.getPainelULA().atualizarConteudo();
				if(manipulaMemoria.getArquitetura().isHexa()){
					hexa.setText("Mudar para Decimal");
				}else{
					hexa.setText("Mudar para Hexadecimal");
				}
			}
			});
		}
		return hexa;
	}
	
	/**
	 * This method initializes sair	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getSair() {
		if (sair == null) {
			sair = new JMenuItem();
			sair.setText("Sair");
			sair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return sair;
	}
	/**
	 * This method initializes instrucoes	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getInstrucoes() {
		if (instrucoes == null) {
			instrucoes = new JMenuItem("Manual de instruções");
			instrucoes.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e){
					Object source = e.getSource();
					if (source == instrucoes) {
						new JanelaInstrucoes();
					}
				};
			});
			
		}
		return instrucoes;
	}

	/**
	 * This method initializes execMicroinst	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getExecMicroinst() {
		if (execMicroinst == null) {
			execMicroinst = new JMenuItem();
			execMicroinst.setText("Executar microinstrução");
			execMicroinst.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
					manipulaMemoria.getArquitetura().setModo(Constantes.RODAMICRO);
			}
			});
		}
		return execMicroinst;
	}


	/**
	 * This method initializes execMicroprog	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getExecMicroprog() {
		if (execMicroprog == null) {
			execMicroprog = new JMenuItem();
			execMicroprog.setText("Executar instrução");
			execMicroprog.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
					manipulaMemoria.getArquitetura().setModo(Constantes.RODAINSTRUCAO);
			}
			});
		}
		return execMicroprog;
	}


	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */

	
	public void ativaCarregamento(){

		if (fileChooser == null) {
			fileChooser = new JFileChooser();
			fileChooser.addChoosableFileFilter(new FiltroData());
			fileChooser.setAcceptAllFileFilterUsed(false);
		}
		fileChooser.setCurrentDirectory(new File("./"));
		int returnVal = fileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {

				//System.out.println("_________________________");

				manipulaMemoria.decifraInstrucao(file.getPath());
				painelbase.getPainelBaixo().preencheMemoria();
				painelbase.getPainelBaixo().preencheCache();
				painelbase.getPainelBaixo().setTextoLabelPercentagemCache(
						manipulaMemoria.getArquitetura().getCache().getPorcentagemAcerto());
				painelbase.getPainelBaixo().setTextoLabelLocalBusca("");
				painelbase.getPainelBaixo().preencheMicroprograma(file.getPath());
				painelbase.getPainelBaixo().preenchePSW();
				painelbase.getPainelBaixo().setDisponibilidadeComecar(true);
				painelbase.getPainelBaixo().setTextoEnderecoMicro(Constantes.REND_RECEBE_PC_2);
				fileChooser.setSelectedFile(null);

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == instrucoes) {
			new JanelaInstrucoes();
		}
	}	
}  //  @jve:decl-index=0:visual-constraint="10,10"  
