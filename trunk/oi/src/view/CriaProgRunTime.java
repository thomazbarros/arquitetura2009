package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.FiltroData;
import controller.LerEscreverArquivo;

import java.io.*; 
import java.lang.*;

public class CriaProgRunTime extends JFrame implements WindowListener, ActionListener{

	/**
	 * Janela do Cria Programa
	 */
	
	private static final long serialVersionUID = 1L;
	
	public static JTextArea areaTexto;
	
	public JTextField campoEndereco;
	
	private final int ProgramaLargura = 450;

	private final int ProgramaAltura = 500;
	
	private JLabel titulo;
	@SuppressWarnings("unused")
	private JLabel endereco;
	
	private JPanel painel;
		
	private JScrollPane scrollTextArea;
	
	public static JButton botaoSalvarComo;
	
	public JFileChooser fc = null;
	
	@SuppressWarnings("unused")
	private LerEscreverArquivo arquivoLido;
	
	public CriaProgRunTime (){
		
		/**
		 * Variavel para saber o tamanho da janela
		 */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension tamanhoPrograma = new Dimension(ProgramaLargura, ProgramaAltura);
		
		titulo = new JLabel("Digite seu programa na area abaixo:");
		

		
		areaTexto = new JTextArea("Digite aqui...");
		
		painel = new JPanel();
		
		scrollTextArea = new JScrollPane(areaTexto);
		
		botaoSalvarComo = new JButton("Salvar como...");
		
		titulo.setBounds(110, 10, 500, 20);
		
		painel.add(titulo);
		
		areaTexto.setLineWrap(true);
		scrollTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextArea.setBounds(48,40,350,300);
		painel.add(scrollTextArea);
		
		botaoSalvarComo.setBounds(150, 400, 160, 20);
		botaoSalvarComo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				
				try{
					if(areaTexto.getText().equals("Digite aqui...") || areaTexto.getText().equals("")){
						JOptionPane.showMessageDialog(null, "Falha ao carregar este programa.\nDigite um programa válido ou feche a janela.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						
						String end = popup();
						if(end.equals(".nao")){
							JOptionPane.showMessageDialog(null, "Ocorreu erro no endereco de gravacao. Tente novamente.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
							setVisible(true);
						}else{
							arquivoLido = new LerEscreverArquivo(areaTexto.getText(),end);
							setVisible(false);	
						}
							
						
					}
				}
				catch(Exception evento){
					System.out.println("Erro na gravacao do Arquivo - Clique do botao.");
				}
			}
		});
		painel.add(botaoSalvarComo);
		add(painel);
		setSize(tamanhoPrograma);
		setResizable(false);
		setLocation((screenSize.width - ProgramaLargura) / 2,(screenSize.height - ProgramaAltura) / 2);
		painel.setLayout(null);
		setTitle("Cria Programa");
		setVisible(true);
		
	}
	
	public String popup(){
		String string = ".nao"; 
		if (fc == null) {
			fc = new JFileChooser();
			fc.addChoosableFileFilter(new FiltroData());
			fc.setAcceptAllFileFilterUsed(false);
		}
		fc.setCurrentDirectory(new File("./"));
		int returnVal = fc.showSaveDialog(this);

		if(returnVal == JFileChooser.APPROVE_OPTION){

			File file = fc.getSelectedFile();

			File file2 = new File(fc.getSelectedFile()+".txt");

			try{
				if(file.exists() || file2.exists()){
					int res = JOptionPane.showConfirmDialog(null,"Esse arquivo já existe. Tem certeza que deseja sobrescrever?");
					if(res == JOptionPane.NO_OPTION || res == JOptionPane.CANCEL_OPTION || res == JOptionPane.CLOSED_OPTION)
					{

						return ".nao";
					}
				}

				if(file.getPath().indexOf(".txt") == -1){
						string = file2.getAbsolutePath();


				}else{

						
						string = file.getAbsolutePath();

				}
		
			} catch (Exception e2) {
				e2.printStackTrace();
				//System.out.println(" ERRO ");
			}
	    }

		return string;
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}