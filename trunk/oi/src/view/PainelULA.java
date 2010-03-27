package view;
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class PainelULA extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final Color COR_SETAS = Color.GREEN;
	private static final Color COR_MUX = Color.YELLOW;
	private static final Color COR_PC = Color.YELLOW;
	private static final Color COR_R0 = Color.YELLOW;
	private static final Color COR_R1 = Color.YELLOW;
	private static final Color COR_RX = Color.YELLOW;
	private static final Color COR_R2 = Color.YELLOW;
	private static final Color COR_R3 = Color.YELLOW;
	private static final Color COR_R4 = Color.YELLOW;
	private static final Color COR_RY = Color.YELLOW;
	private static final Color COR_MUX_A = Color.ORANGE;
	private static final Color COR_MUX_B = Color.ORANGE;
	private static final Color COR_RDADOS = Color.YELLOW;
	private static final Color COR_MEMORIA = Color.YELLOW;
	private static final Color COR_REND = Color.YELLOW;
	private static final Color COR_LINHAS = Color.BLUE;
	private static final Color COR_TEXTOS = Color.BLACK;
	private static final Color COR_VARIAVEIS = Color.BLACK;
	private static final Color COR_UC = Color.YELLOW;
	private static final Color COR_IR = Color.YELLOW;
	private static final Color COR_ULA = Color.MAGENTA;
	
	
	AffineTransform transf;
	
	
	PontoDeControle[] pontosDeControle = new PontoDeControle[24];  
	String Reg0, Reg1, RegX, Reg2, Reg3, Reg4, RegY, PC, IR, Rend, Rdados = "0";	

	
	public PainelULA() {
		super();
		inicializaPontosDeControle();
	}

	public void inicializaPontosDeControle(){
		String[] strPontosDeControle = {"j", "a", "b", "w", "d", "e", "f", "x", "c", "h", "k", "l", "m", "n", "o", "v", "i", "g", "p", "q", "r", "s", "t", "u"};
		int[] xPontosDeControle = {148, 238, 328, 418, 508, 598, 688, 778, 868, 148, 388, 368, 748, 736, 724, 148, 148, 720, 340, 346, 354, 362, 370, 378};
		int[] yPontosDeControle = {30, 30, 30, 30, 30, 30, 30, 30, 30, 172, 200, 230, 196, 218, 240, 310, 444, 444, 350, 375, 400, 425, 450, 475};
		for (int i = 0; i < pontosDeControle.length; i++) {
			pontosDeControle[i] = new PontoDeControle(strPontosDeControle[i], xPontosDeControle[i], yPontosDeControle[i]);
		}
	}
	
	public void resetPontosDeContole() {
		for (int i = 0; i < pontosDeControle.length; i++) {
			pontosDeControle[i].setAtivo(false);
		}
	}

	public void resetDados() {
		Reg0 = Reg1 = RegX = Reg2 = Reg3 = Reg4 = RegY = PC = IR = Rend = Rdados = "0";
	}

	@Override
	public void paint(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		super.paint(g2d);
		transf = g2d.getTransform();

		//Pontos de Controle
		for (int i = 0; i < pontosDeControle.length; i++) {
			if(i!=18){
				circulo(g2d, pontosDeControle[i].getStr(), pontosDeControle[i].getX(), pontosDeControle[i].getY(), pontosDeControle[i].getCor());
			}
		}
			
	
		
// Inicio Linhas Grossas (X, Y, Largura, Altura) --------------------------------------------------------------------------
		//Linhas de Contorno
		g2d.setColor(COR_SETAS);
		g2d.fillRect(90, 530, 840, 4);    //@Linha Grossa 3
		g2d.fillRect(930, 10, 4, 524);    //@Linha Grossa 4
		g2d.fillRect(110, 6, 824, 4);     //@Linha Grossa 5
		g2d.fillRect(15, 6, 55, 4);       //@Linha Grossa 6
		g2d.fillRect(15, 10, 4, 314);     //@Linha Grossa 7
		g2d.fillRect(15, 320, 38, 4);     //@Linha Grossa 8
		
		
		
		// Linhas de Entrada MUX, R0, R1, RX, R2, R3, R4, RY, PC
		g2d.setColor(COR_SETAS);
		g2d.fillRect(70, 6, 4, 40);       //@Linha Grossa 11  MUX
		g2d.fillRect(106, 6, 4, 40);      //@Linha Grossa 12  MUX
		g2d.fillRect(206, 6, 4, 40);	  //@Linha Grossa 13  R0
		g2d.fillRect(296, 6, 4, 40);      //@Linha Grossa 14  R1
		g2d.fillRect(386, 6, 4, 40);      //@Linha Grossa 15  RX
		g2d.fillRect(476, 6, 4, 40);      //@Linha Grossa 16  R2
		g2d.fillRect(566, 6, 4, 40);      //@Linha Grossa 17  R3
		g2d.fillRect(656, 6, 4, 40);      //@Linha Grossa 18  R4
		g2d.fillRect(746, 6, 4, 40);      //@Linha Grossa 19  RY
		g2d.fillRect(836, 6, 4, 40);	  //@Linha Grossa 20  PC
		// Fim de Linhas
		
		// Setas para as Linhas
		g2d.setColor(COR_SETAS);
		setaParaBaixo(g2d, 61, 46);       //MUX
		setaParaBaixo(g2d, 98, 46);       //MUX 
		setaParaBaixo(g2d, 198, 46);      //R0
		setaParaBaixo(g2d, 288, 46);      //R1
		setaParaBaixo(g2d, 378, 46);      //RX
		setaParaBaixo(g2d, 468, 46);      //R2
		setaParaBaixo(g2d, 558, 46);      //R3
		setaParaBaixo(g2d, 648, 46);      //R4
		setaParaBaixo(g2d, 738, 46);      //RY
		setaParaBaixo(g2d, 828, 46);      //PC
		// Fim de Setas
		
		//MUX e Registradores
		g2d.setColor(COR_MUX);
		multiplexador(g2d, 20, 58, 2, 1);       //MUX
		g2d.setColor(COR_R0);
		registrador(g2d, 182, 58);        //R0
		g2d.setColor(COR_R1);
		registrador(g2d, 272, 58);        //R1
		g2d.setColor(COR_RX);
		registrador(g2d, 362, 58);        //RX
		g2d.setColor(COR_R2);
		registrador(g2d, 452, 58);        //R2
		g2d.setColor(COR_R3);
		registrador(g2d, 542, 58);        //R3
		g2d.setColor(COR_R4);
		registrador(g2d, 632, 58);        //R4
		g2d.setColor(COR_RY);
		registrador(g2d, 722, 58);        //RY
		g2d.setColor(COR_PC);
		registrador(g2d, 812, 58);        //PC
		
		// Linhas de Saidas MUX, R0, R1, RX, R2, R3, R4, RY, PC
		g2d.setColor(COR_SETAS);
		g2d.fillRect(90, 108, 4, 40);       //MUX
		g2d.fillRect(206, 108, 4, 34);      //R0
		g2d.fillRect(296, 108, 4, 80);      //R1
		g2d.fillRect(386, 108, 4, 34);      //RX
		g2d.fillRect(476, 108, 4, 60);      //R2
		g2d.fillRect(566, 108, 4, 30);      //R3
		g2d.fillRect(656, 108, 4, 80);      //R4
		g2d.fillRect(746, 108, 4, 30);      //RY
		g2d.fillRect(836, 108, 4, 60);	    //PC
		// Fim de Linhas
		
		//Linhas Multiplexador A
		g2d.setColor(COR_SETAS);
		//Vertical
		g2d.fillRect(246, 138, 4, 50); 
		g2d.fillRect(346, 138, 4, 50);
		//Horizontal
		g2d.fillRect(206, 138, 40, 4); 
		g2d.fillRect(346, 138, 40, 4); 
		
		//Linhas Multiplexador B
		g2d.setColor(COR_SETAS);
		//Vertical
		g2d.fillRect(596, 168, 4, 20);
		g2d.fillRect(626, 138, 4, 50); 
		g2d.fillRect(686, 138, 4, 50); 
		g2d.fillRect(716, 168, 4, 20);
		//Horizontal
		g2d.fillRect(476, 168, 120, 4); 
		g2d.fillRect(566, 138, 60, 4); 
		g2d.fillRect(690, 138, 60, 4); 
		g2d.fillRect(720, 168, 120, 4); 
		
		// Setas para as Linhas
		g2d.setColor(COR_SETAS);
		setaParaBaixo(g2d, 237, 188);
		setaParaBaixo(g2d, 287, 188);
		setaParaBaixo(g2d, 337, 188);
		setaParaBaixo(g2d, 587, 188);
		setaParaBaixo(g2d, 617, 188);
		setaParaBaixo(g2d, 647, 188);
		setaParaBaixo(g2d, 677, 188);
		setaParaBaixo(g2d, 707, 188);
		
		// Multiplexadores A e B
		g2d.setColor(COR_MUX_A);
		multiplexador(g2d, 75, 200, 3, 1);
		g2d.setColor(COR_MUX_B);
		multiplexador(g2d, 195, 200, 3, 1);
		// Fim de Multiplexadores
		
		//Saida do Multiplexador X
		g2d.setColor(COR_SETAS);
		setaParaBaixo(g2d, 82, 148);
		
		// Registrador de Dados
		g2d.setColor(COR_RDADOS);
		g2d.fillRect(50, 160, 80, 50);   
		
		//Saida do Registrador de Dados
		g2d.setColor(COR_SETAS);
		g2d.fillRect(90, 210, 4, 40);
		setaParaBaixo(g2d, 82, 250);
		
		//Memória
		g2d.setColor(COR_MEMORIA);
		g2d.fillRect(50, 262, 80, 120);   
		
		//Saida do Registrador de Endereços
		g2d.setColor(COR_SETAS);
		g2d.fillRect(90, 392, 4, 40);
		setaParaCima(g2d, 82, 382);
		
		//Registrador de Endereços
		g2d.setColor(COR_REND);
		g2d.fillRect(50, 432, 80, 50);  
		
		//Entrada do Registrador de Endereços
		g2d.setColor(COR_SETAS);
		g2d.fillRect(90, 490, 4, 40);
		setaParaCima(g2d, 82, 480);
		
		//Entrada na ULA
		//A
		g2d.setColor(COR_SETAS);
		g2d.fillRect(300, 250, 4, 60);
		g2d.fillRect(300, 310, 110, 4);
		g2d.fillRect(410, 310, 4, 45);
		setaParaBaixo(g2d, 402, 355);
		//B
		g2d.setColor(COR_SETAS);
		g2d.fillRect(660, 250, 4, 60);
		g2d.fillRect(554, 310, 110, 4);
		g2d.fillRect(554, 310, 4, 45);
		setaParaBaixo(g2d, 546, 355);
		
		//ULA
		g2d.setColor(COR_ULA);
		ula(g2d, 108, 159);
		
		//Saida da ULA
		g2d.setColor(COR_SETAS);
		g2d.fillRect(480, 480, 4, 40);
		setaParaBaixo(g2d, 472, 520);
		
		//Entrada no IR
		g2d.setColor(COR_SETAS);
		g2d.fillRect(800, 490, 4, 40);
		setaParaCima(g2d, 792, 480);
		
		//IR
		g2d.setColor(COR_IR);
		g2d.fillRect(760, 430, 80, 50);
		
		//Entrada no UC e saida do IR
		g2d.setColor(COR_SETAS);
		g2d.fillRect(800, 390, 4, 40);
		setaParaCima(g2d, 792, 380);
		
		//UC
		g2d.setColor(COR_UC);
		g2d.fillRect(776, 330, 50, 50);
		
		//Linha para MUX A
		g2d.setColor(COR_SETAS);
		g2d.fillRect(94, 228, 138, 4);    //horizontal
		setaParaDireita(g2d, 232, 220);
		
	
//Fim de linhas grossas --------------------------------------------------------------------------
		
		
	
//Linhas finas -------------------------------------------------------------------------
		//Horizontais MUX e Registradores
		g2d.setColor(COR_LINHAS);
		g2d.drawLine(130, 83, 157, 83);
		g2d.drawLine(232, 83, 247, 83);
		g2d.drawLine(322, 83, 337, 83);
		g2d.drawLine(412, 83, 427, 83);
		g2d.drawLine(502, 83, 517, 83);
		g2d.drawLine(592, 83, 607, 83);
		g2d.drawLine(682, 83, 697, 83);
		g2d.drawLine(772, 83, 787, 83);
		g2d.drawLine(862, 83, 877, 83);
		
		//Verticais MUX e Registradores
		g2d.drawLine(158, 53, 158, 83);
		g2d.drawLine(248, 53, 248, 83);
		g2d.drawLine(338, 53, 338, 83);
		g2d.drawLine(428, 53, 428, 83);
		g2d.drawLine(518, 53, 518, 83);
		g2d.drawLine(608, 53, 608, 83);
		g2d.drawLine(698, 53, 698, 83);
		g2d.drawLine(788, 53, 788, 83);
		g2d.drawLine(878, 53, 878, 83);
		
		//Demais pontos de controle
		g2d.drawLine(130, 182, 148, 182);
		g2d.drawLine(130, 320, 148, 320);
		g2d.drawLine(130, 455, 148, 455);
		g2d.drawLine(369, 210, 387, 210);
		g2d.drawLine(350, 240, 368, 240);
		g2d.drawLine(730, 206, 748, 206);
		g2d.drawLine(718, 228, 736, 228);
		g2d.drawLine(706, 248, 724, 248);
		g2d.drawLine(742, 456, 760, 456);
		g2d.drawLine(368, 386, 386, 386);
		g2d.drawLine(376, 410, 392, 410);
		g2d.drawLine(384, 434, 400, 434);
		g2d.drawLine(392, 460, 406, 460);
		g2d.drawLine(398, 480, 410, 468);
		//g2d.drawLine(362, 364, 380, 370);
		
//Fim de linhas finas ----------------------------------------------------------------------------------
		
		
//Textos imutáveis
		g2d.setColor(COR_TEXTOS);
		g2d.drawString("R0", 200, 75);
		g2d.drawString("R1", 290, 75);
		g2d.drawString("RX", 380, 75);
		g2d.drawString("R2", 470, 75);
		g2d.drawString("R3", 560, 75);
		g2d.drawString("R4", 650, 75);
		g2d.drawString("RY", 740, 75);
		g2d.drawString("PC", 830, 75);
		
		g2d.drawString("L/E", 80, 320);
		g2d.drawString("Memória", 65, 340);
		g2d.drawString("MUX", 80, 85);
		g2d.drawString("MUX A", 280, 230);
		g2d.drawString("MUX B", 640, 230);
		g2d.drawString("A", 410, 380);
		g2d.drawString("B", 550, 380);
		g2d.drawString("ULA", 470, 440);
		g2d.drawString("RDados", 68, 180);
		g2d.drawString("REnd", 75, 450);
		g2d.drawString("UC", 794, 358);
		g2d.drawString("IR", 794, 448);
//Fim de Textos imutáveis
		
		
//Textos Mutáveis
		g2d.setColor(COR_VARIAVEIS);
		g2d.drawString("" + Reg0, 200, 95);
		g2d.drawString("" + Reg1, 290, 95);
		g2d.drawString("" + RegX, 380, 95);
		g2d.drawString("" + Reg2, 470, 95);
		g2d.drawString("" + Reg3, 560, 95);
		g2d.drawString("" + Reg4, 650, 95);
		g2d.drawString("" + RegY, 740, 95);
		g2d.drawString("" + PC, 830, 95);
		g2d.drawString("" + IR, 794, 468);
		g2d.drawString("" + Rend, 75, 470);
		g2d.drawString("" + Rdados, 68, 200);
//Fim de Textos mutáveis
	}

	private void circulo(Graphics2D g2d, String str, int x, int y, Color cor) {
		g2d.setColor(cor);
		g2d.translate(x, y);
		g2d.fillOval(0, 0, 23, 23);
		g2d.setColor(Color.BLACK);
		g2d.drawString(str, 9, 16);
		g2d.setTransform(transf);
	}

	private void ula(Graphics2D g2d, int x, int y) {
		int[] ULA_X = {0, 20, 30, 40, 60, 50, 10}, ULA_Y = {0, 0, 20, 0, 0, 50, 50};
		
		g2d.scale(3.5, 2.3);
		g2d.translate(x, y);
		g2d.fillPolygon(ULA_X, ULA_Y, 7);
		g2d.setTransform(transf);
	}

	private void registrador(Graphics2D g2d, int x, int y) {
		g2d.fillRect(x, y, 50, 50);
	}

	private void multiplexador(Graphics2D g2d, int x, int y, double a, double b) {
		int[] MUX_X = {50, 0, 10, 40}, MUX_Y = {0, 0, 50, 50};		
		g2d.scale(a, b);
		g2d.translate(x, y);
		g2d.fillPolygon(MUX_X, MUX_Y, 4);
		g2d.setTransform(transf);
	}
		
	private void setaParaDireita(Graphics2D g2d, int x, int y) {
		int[] arrowX_RIGHT = {0, 10, 0}, arrowY_RIGHT = {0, 10, 20}; 
		g2d.translate(x, y);
		g2d.fillPolygon(arrowX_RIGHT, arrowY_RIGHT, 3);
		g2d.setTransform(transf);		
	}
	
	private void setaParaCima(Graphics2D g2d, int x, int y) {
		int[] arrowX_UP = {0, 10, 20}, arrowY_UP = {10, 0, 10}; 
		g2d.translate(x, y);
		g2d.fillPolygon(arrowX_UP, arrowY_UP, 3);
		g2d.setTransform(transf);
	}
	
	
	private void setaParaBaixo(Graphics2D g2d, int x, int y) {
		int[] arrowX_DOWN = {0, 10, 20}, arrowY_DOWN = {0, 10, 0};
		g2d.translate(x, y);
		g2d.fillPolygon(arrowX_DOWN, arrowY_DOWN, 3);
		g2d.setTransform(transf);
	}
	
	
	
	
	public boolean getJ() {
		return pontosDeControle[0].isAtivo();
	}
	
	public void setJ(boolean b) {
		pontosDeControle[0].setAtivo(b);
	}

	public boolean getA() {
		return pontosDeControle[1].isAtivo();
	}
	
	public void setA(boolean b) {
		pontosDeControle[1].setAtivo(b);
	}

	public boolean getB() {
		return pontosDeControle[2].isAtivo();
	}

	public void setB(boolean b) {
		pontosDeControle[2].setAtivo(b);
	}

	public boolean getW() {
		return pontosDeControle[3].isAtivo();
	}
	
	public void setW(boolean b) {
		pontosDeControle[3].setAtivo(b);
	}
	
	public boolean getD() {
		return pontosDeControle[4].isAtivo();
	}
	
	public void setD(boolean b) {
		pontosDeControle[4].setAtivo(b);
	}
	
	public boolean getE() {
		return pontosDeControle[5].isAtivo();
	}
	
	public void setE(boolean b) {
		pontosDeControle[5].setAtivo(b);
	}
	
	public boolean getF() {
		return pontosDeControle[6].isAtivo();
	}
	
	public void setF(boolean b) {
		pontosDeControle[6].setAtivo(b);
	}
	
	public boolean getXx() {
		return pontosDeControle[7].isAtivo();
	}
	
	public void setXx(boolean b) {
		pontosDeControle[7].setAtivo(b);
	}
	
	public boolean getC() {
		return pontosDeControle[8].isAtivo();
	}
	
	public void setC(boolean b) {
		pontosDeControle[8].setAtivo(b);
	}
	
	public boolean getH() {
		return pontosDeControle[9].isAtivo();
	}
	
	public void setH(boolean b) {
		pontosDeControle[9].setAtivo(b);
	}
	
	public boolean getK() {
		return pontosDeControle[10].isAtivo();
	}
	
	public void setK(boolean b) {
		pontosDeControle[10].setAtivo(b);
	}
	
	public boolean getL() {
		return pontosDeControle[11].isAtivo();
	}
	
	public void setL(boolean b) {
		pontosDeControle[11].setAtivo(b);
	}
	
	public boolean getM() {
		return pontosDeControle[12].isAtivo();
	}
	
	public void setM(boolean b) {
		pontosDeControle[12].setAtivo(b);
	}
	
	public boolean getN() {
		return pontosDeControle[13].isAtivo();
	}
	
	public void setN(boolean b) {
		pontosDeControle[13].setAtivo(b);
	}
	
	public boolean getO() {
		return pontosDeControle[14].isAtivo();
	}
	
	public void setO(boolean b) {
		pontosDeControle[14].setAtivo(b);
	}
	
	public boolean getV() {
		return pontosDeControle[15].isAtivo();
	}
	
	public void setV(boolean b) {
		pontosDeControle[15].setAtivo(b);
	}
	
	public boolean getI() {
		return pontosDeControle[16].isAtivo();
	}
	
	public void setI(boolean b) {
		pontosDeControle[16].setAtivo(b);
	}
	
	public boolean getG() {
		return pontosDeControle[17].isAtivo();
	}
	
	public void setG(boolean b) {
		pontosDeControle[17].setAtivo(b);
	}
	
	public boolean getP() {
		return pontosDeControle[18].isAtivo();
	}
	
	public void setP(boolean b) {
		pontosDeControle[18].setAtivo(b);
	}
	
	public boolean getQ() {
		return pontosDeControle[19].isAtivo();
	}
	
	public void setQ(boolean b) {
		pontosDeControle[19].setAtivo(b);
	}
	
	public boolean getR() {
		return pontosDeControle[20].isAtivo();
	}
	
	public void setR(boolean b) {
		pontosDeControle[20].setAtivo(b);
	}
	
	public boolean getS() {
		return pontosDeControle[21].isAtivo();
	}
	
	public void setS(boolean b) {
		pontosDeControle[21].setAtivo(b);
	}
	
	public boolean getT() {
		return pontosDeControle[22].isAtivo();
	}
	
	public void setT(boolean b) {
		pontosDeControle[22].setAtivo(b);
	}
	
	public boolean getU() {
		return pontosDeControle[23].isAtivo();
	}
	
	public void setU(boolean b) {
		pontosDeControle[23].setAtivo(b);
	}
	
	public String getReg0() {
		return Reg0;
	}

	public void setReg0(String reg0) {
		Reg0 = reg0;
	}

	public String getReg1() {
		return Reg1;
	}

	public void setReg1(String reg1) {
		Reg1 = reg1;
	}

	public String getRegX() {
		return RegX;
	}

	public void setRegX(String regX) {
		RegX = regX;
	}

	public String getReg2() {
		return Reg2;
	}

	public void setReg2(String reg2) {
		Reg2 = reg2;
	}

	public String getReg3() {
		return Reg3;
	}

	public void setReg3(String reg3) {
		Reg3 = reg3;
	}

	public String getReg4() {
		return Reg4;
	}

	public void setReg4(String reg4) {
		Reg4 = reg4;
	}

	public String getRegY() {
		return RegY;
	}

	public void setRegY(String regY) {
		RegY = regY;
	}

	public String getRend() {
		return Rend;
	}

	public void setRend(String rend) {
		Rend = rend;
	}

	public String getRdados() {
		return Rdados;
	}

	public void setRdados(String rdados) {
		Rdados = rdados;
	}

	public void setPc(String PC) {
		this.PC = PC;
	}
	
	public void setIr(String IR) {
		this.IR = IR;
	}
	
	public void atualizarConteudo(){
		this.revalidate();
		this.repaint();
	}
	
		
}


