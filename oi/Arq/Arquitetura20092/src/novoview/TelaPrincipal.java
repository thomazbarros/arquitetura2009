package novoview;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JMenu;

public class TelaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TelaPrincipal(String title) {
		initialize();
	}
	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
					.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			setDefaultLookAndFeelDecorated(false);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Simulador de Arquitetura de Computadores");
//		setTitle(title);
		//setContentPane(ula);
		setMinimumSize(new Dimension(1024, 768));
		pack();
		setVisible(true);
	}
	
	
}  //  @jve:decl-index=0:visual-constraint="10,10"  
