package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class TelaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel ula = new ULA();

	public TelaPrincipal(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle(title);
		setContentPane(ula);
		setMinimumSize(new Dimension(1024, 768));
		pack();
		setVisible(true);
	}
}  
