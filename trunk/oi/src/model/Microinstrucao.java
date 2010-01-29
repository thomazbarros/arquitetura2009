package model;
 
public class Microinstrucao {
	private char[] pontoDeControle;
	private char[] pontoDeControle2 = new char[24];
	
	public Microinstrucao(int[] pontosDeControle){
		int j = 0;
		
		for(int i = 0; i < pontoDeControle2.length; i++){
			pontoDeControle2[i] = '0';
		}
			
		for(int i = 0; i < pontosDeControle.length; i++){
			if(pontosDeControle[i] == Constantes.R0_ATIVADO){
				pontoDeControle[j] = 'a';
				pontoDeControle2[0] = '1';
			}
			if(pontosDeControle[i] == Constantes.R0_DESATIVADO){
				pontoDeControle[j] = 'a';
				pontoDeControle2[0] = '0';
			}
			if(pontosDeControle[i] == Constantes.R1_ATIVADO){
				pontoDeControle[j] = 'b';
				pontoDeControle2[1] = '1';
			}
			if(pontosDeControle[i] == Constantes.R1_DESATIVADO){
				pontoDeControle[j] = 'b';
				pontoDeControle2[1] = '0';
			}
			if(pontosDeControle[i] == Constantes.PC_ATIVADO){
				pontoDeControle[j] = 'c';
				pontoDeControle2[2] = '1';
			}
			if(pontosDeControle[i] == Constantes.PC_DESATIVADO){
				pontoDeControle[j] = 'c';
				pontoDeControle2[2] = '0';
			}
			if(pontosDeControle[i] == Constantes.R2_ATIVADO){
				pontoDeControle[j] = 'd';
				pontoDeControle2[3] = '1';
			}
			if(pontosDeControle[i] == Constantes.R2_DESATIVADO){
				pontoDeControle[j] = 'd';
				pontoDeControle2[3] = '0';
			}
			if(pontosDeControle[i] == Constantes.R3_ATIVADO){
				pontoDeControle[j] = 'e';
				pontoDeControle2[4] = '1';
			}
			if(pontosDeControle[i] == Constantes.R3_DESATIVADO){
				pontoDeControle[j] = 'e';
				pontoDeControle2[4] = '0';
			}
			if(pontosDeControle[i] == Constantes.R4_ATIVADO){
				pontoDeControle[j] = 'f';
				pontoDeControle2[5] = '1';
			}
			if(pontosDeControle[i] == Constantes.R4_DESATIVADO){
				pontoDeControle[j] = 'f';
				pontoDeControle2[5] = '0';
			}
			if(pontosDeControle[i] == Constantes.IR_ATIVADO){
				pontoDeControle[j] = 'g';
				pontoDeControle2[6] = '1';
			}
			if(pontosDeControle[i] == Constantes.IR_DESATIVADO){
				pontoDeControle[j] = 'g';
				pontoDeControle2[6] = '0';
			}
			if(pontosDeControle[i] == Constantes.RDADO_ATIVADO){
				pontoDeControle[j] = 'h';
				pontoDeControle2[7] = '1';
			}
			if(pontosDeControle[i] == Constantes.RDADO_DESATIVADO){
				pontoDeControle[j] = 'h';
				pontoDeControle2[7] = '0';
			}
			if(pontosDeControle[i] == Constantes.REND_ATIVADO){
				pontoDeControle[j] = 'i';
				pontoDeControle2[8] = '1';
			}
			if(pontosDeControle[i] == Constantes.REND_DESATIVADO){
				pontoDeControle[j] = 'i';
				pontoDeControle2[8] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_ATIVADO){
				pontoDeControle[j] = 'j';
				pontoDeControle2[9] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_DESATIVADO){
				pontoDeControle[9] = 'j';
				pontoDeControle2[j] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_RDADO){
				pontoDeControle[j] = 'k';
				pontoDeControle2[10] = '0';
				j++;
				pontoDeControle[j] = 'l';
				pontoDeControle2[11] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_R0){
				pontoDeControle[j] = 'k';
				pontoDeControle2[10] = '0';
				j++;
				pontoDeControle[j] = 'l';
				pontoDeControle2[11] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_R1){
				pontoDeControle[j] = 'k';
				pontoDeControle2[10] = '1';
				j++;
				pontoDeControle[j] = 'l';
				pontoDeControle2[11] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_RX){
				pontoDeControle[j] = 'k';
				pontoDeControle2[10] = '1';
				j++;
				pontoDeControle[j] = 'l';
				pontoDeControle2[11] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_R2){
				pontoDeControle[j] = 'm';
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle[j] = 'n';
				pontoDeControle2[13] = '0';
				j++;
				pontoDeControle[j] = 'o';
				pontoDeControle2[14] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_R3){
				pontoDeControle[j] = 'm';
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle[j] = 'n';
				pontoDeControle2[13] = '0';
				j++;
				pontoDeControle[j] = 'o';
				pontoDeControle2[14] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_R4){
				pontoDeControle[j] = 'm';
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle[j] = 'n';
				pontoDeControle2[13] = '1';
				j++;
				pontoDeControle[j] = 'o';
				pontoDeControle2[14] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_RY){
				pontoDeControle[j] = 'm';
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle[j] = 'n';
				pontoDeControle2[13] = '1';
				j++;
				pontoDeControle[j] = 'o';
				pontoDeControle2[14] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_PC){
				pontoDeControle[j] = 'm';
				pontoDeControle2[12] = '1';
				j++;
				pontoDeControle[j] = 'n';
				pontoDeControle2[13] = '0';
				j++;
				pontoDeControle[j] = 'o';
				pontoDeControle2[14] = '0';
			}
			if(pontosDeControle[i] == Constantes.A){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.B){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_MAIS_1){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.A_MAIS_B){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_MENOS_B){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.A_AND_B){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_OR_B){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.A_SHIFT_LEFT){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_SHIFT_RIGHT){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.B_SHIFT_LEFT){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.B_SHIFT_RIGHT){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.A_MENOS_1){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.B_MAIS_1){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.B_MENOS_1){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.B_MENOS_A){
				pontoDeControle[j] = 'p';
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle[j] = 'q';
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle[j] = 'r';
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle[j] = 's';
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle[j] = 't';
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle[j] = 'u';
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.MEMORIA_ATIVADO){
				pontoDeControle[j] = 'v';
				pontoDeControle2[21] = '1';
			}
			if(pontosDeControle[i] == Constantes.MEMORIA_DESATIVADO){
				pontoDeControle[j] = 'v';
				pontoDeControle2[21] = '0';
			}
			if(pontosDeControle[i] == Constantes.RX_ATIVADO){
				pontoDeControle[j] = 'w';
				pontoDeControle2[22] = '1';
			}
			if(pontosDeControle[i] == Constantes.RX_DESATIVADO){
				pontoDeControle[j] = 'w';
				pontoDeControle2[22] = '0';
			}
			if(pontosDeControle[i] == Constantes.RY_ATIVADO){
				pontoDeControle[j] = 'x';
				pontoDeControle2[23] = '1';
			}
			if(pontosDeControle[i] == Constantes.RY_DESATIVADO){
				pontoDeControle[j] = 'x';
				pontoDeControle2[23] = '0';
			}
		}
	}
	
	public char[] getPontoDeControle() {
		return pontoDeControle;
	}
	
	public void setPontoDeControle(char[] pontoDeControle) {
		this.pontoDeControle = pontoDeControle;
	}
	
	public char[] getPontoDeControle2() {
		return pontoDeControle2;
	}
	
	public void setPontoDeControle2(char[] pontoDeControle2) {
		this.pontoDeControle2 = pontoDeControle2;
	}
}
