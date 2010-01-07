package novoview;
 
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class JanelaInstrucoes extends JFrame implements WindowListener {

	/**
	 * Janela das Instrucoes
	 */

	private static final long serialVersionUID = 1L;

	public static JList areaTexto;
	DefaultListModel listModel;

	private final int JanelaLargura = 600;

	private final int JanelaAltura =600;

	private JLabel titulo;

	private JPanel painel;

	private JScrollPane scrollTextArea;

	private ArquivoTexto arquivoLido;

	private int contador;

	public JanelaInstrucoes() {

		/**
		 * Variavel para saber o tamanho da janela
		 */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension tamanhoPrograma = new Dimension(JanelaLargura, JanelaAltura);

		titulo = new JLabel("As Instrucoes seguem abaixo:");

		areaTexto = new JList();
		
		
		painel = new JPanel();

		scrollTextArea = new JScrollPane(areaTexto);

		painel.setLayout(null);

		/**
		 * Adiciona item no painel
		 */
		titulo.setBounds(130, 10, 500, 20);
		painel.add(titulo);

		listModel = new DefaultListModel();
		
		try {
			arquivoLido = new ArquivoTexto("C:\\Users\\thomaz\\Desktop\\instrucao.txt");
			contador = 0;
			while (arquivoLido.maisLinhas()) {

				if (!(arquivoLido.getLinha().equals(""))) {
					listModel.addElement(Integer.toString(contador) + ". "
							+ arquivoLido.getLinha());
				}
				contador++;
			}
		} catch (Exception e) {
			System.out.println("Erro no metodo LerArquivo!");
		}
		areaTexto.setModel(listModel);
		

		scrollTextArea
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextArea.setBounds(20, 45, 550, 470);
		painel.add(scrollTextArea);

		/**
		 * Mostra a Janela
		 */
		add(painel);
		setSize(tamanhoPrograma);
		setResizable(false);
		setLocation((screenSize.width - JanelaLargura) / 2,
				(screenSize.height - JanelaAltura) / 2);
		setTitle("Instrucoes");
		setVisible(true);

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

}
