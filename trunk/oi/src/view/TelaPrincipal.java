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
	private JMenu jMenu = null;
	private JMenu ajuda = null;
	private JMenuItem carregarMicroprograma = null;
	private JMenuItem criarMicroprograma = null;
	private JMenuItem executar = null;
	private JMenuItem sair = null;
	private JMenuItem instrucoes = null;
	private JMenuItem execMicroinst = null;
	private JMenuItem execMicroprog = null;
	private CriaProgRunTime criarPrograma = null;
	
	
	private PainelBase painelbase;// = new PainelBase();
	


	private JFileChooser fileChooser;
	private ManipulaMemoria manipulaMemoria;
	private RodaPrograma rodaPrograma;
	private JWindow jWindow = null;
	private JPanel jContentPane = null;

	public TelaPrincipal(String title,ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){//,RodarThread rodarThread) {
		initialize(manipulaMemoria,rodaPrograma);//,rodarThread);
	}

	
	private void initialize(ManipulaMemoria manipulaMemoria,RodaPrograma rodaPrograma){//,RodarThread rodarThread) {
		this.manipulaMemoria = manipulaMemoria;
		this.rodaPrograma = rodaPrograma;
		painelbase = new PainelBase(manipulaMemoria,rodaPrograma);//,rodarThread);
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
					.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			setDefaultLookAndFeelDecorated(false);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getMenuPrincipal());
		
		setTitle("Simulador de Arquitetura de Computadores");
		setContentPane(painelbase);

		//setMinimumSize(new Dimension(1024, 768));
		setPreferredSize(new Dimension(1024, 768));
		//setPreferredSize(new Dimension(800, 600));
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
			executar.setText("Executar Microinstruções Inteiro");
			executar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				manipulaMemoria.getArquitetura().setModo(Constantes.RODAPROGRAMA);
			}
			});
		}
		return executar;
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
			//instrucoes.addActionListener(this);
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
			execMicroinst.setText("Executar Microinstruções passo a passo");
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
			execMicroprog.setText("Executar Microprograma passo a passo");
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
				//manipula.setNomeArquivo(file.getPath());
				System.out.println("_________________________");
				/*manipulaMemoria.getArquitetura().paraThreads();
				//manipulaMemoria.getArquitetura().setRodaThread(false);
				manipulaMemoria.getArquitetura().zeraRegistradores();
				manipulaMemoria.getArquitetura().zeraPontosDeControleGrafico();
				manipulaMemoria.getArquitetura().getUla().zeraPSW();
				manipulaMemoria.getArquitetura().getMemoria().zeraMemoria();
				manipulaMemoria.getArquitetura().getCache().zeraCache();*/
				manipulaMemoria.decifraInstrucao(file.getPath());
				painelbase.getPainelBaixo().preencheMemoria();
				painelbase.getPainelBaixo().preencheCache();
				painelbase.getPainelBaixo().preencheMicroprograma(file.getPath());
				painelbase.getPainelBaixo().preenchePSW();
				painelbase.getPainelBaixo().setDisponibilidadeComecar(true);
				//rodaPrograma.rodar();
				//manipulaMemoria.getArquitetura().atualizaPainel();
				/*System.out.println(manipulaMemoria.getArquitetura().getR0().getValor());
				System.out.println(manipulaMemoria.getArquitetura().getR1().getValor());
				System.out.println(manipulaMemoria.getArquitetura().getR2().getValor());
				System.out.println(manipulaMemoria.getArquitetura().getR3().getValor());
				System.out.println(manipulaMemoria.getArquitetura().getR4().getValor());
				*/
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
