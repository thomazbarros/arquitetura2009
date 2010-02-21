package model;

import java.util.ArrayList;
 
public class Microinstrucao {
	private ArrayList<Character> pontoDeControle;
	private char[] pontoDeControle2 = new char[33];
	String proximo;
	
	public String getProximo() {
		return proximo;
	}

	public Microinstrucao(int[] pontosDeControle, String proximo){
		int j = 0;
		this.proximo = proximo;
		
		if(proximo.equals("")){
			this.proximo = "000000000";
		}
		
		pontoDeControle =  new ArrayList<Character>();
		
		for(int i = 0; i < pontoDeControle2.length; i++){
			pontoDeControle2[i] = '0';
		}
			
		for(int i = 0; i < pontosDeControle.length; i++){
			if(pontosDeControle[i] == Constantes.R0_ATIVADO){
				pontoDeControle.add('a');
				pontoDeControle2[0] = '1';
			}
			if(pontosDeControle[i] == Constantes.R0_DESATIVADO){
				pontoDeControle.add('a');
				pontoDeControle2[0] = '0';
			}
			if(pontosDeControle[i] == Constantes.R1_ATIVADO){
				pontoDeControle.add('b');
				pontoDeControle2[1] = '1';
			}
			if(pontosDeControle[i] == Constantes.R1_DESATIVADO){
				pontoDeControle.add('b');
				pontoDeControle2[1] = '0';
			}
			if(pontosDeControle[i] == Constantes.PC_ATIVADO){
				pontoDeControle.add('c');
				pontoDeControle2[2] = '1';
			}
			if(pontosDeControle[i] == Constantes.PC_DESATIVADO){
				pontoDeControle.add('c');
				pontoDeControle2[2] = '0';
			}
			if(pontosDeControle[i] == Constantes.R2_ATIVADO){
				pontoDeControle.add('d');
				pontoDeControle2[3] = '1';
			}
			if(pontosDeControle[i] == Constantes.R2_DESATIVADO){
				pontoDeControle.add('d');
				pontoDeControle2[3] = '0';
			}
			if(pontosDeControle[i] == Constantes.R3_ATIVADO){
				pontoDeControle.add('e');
				pontoDeControle2[4] = '1';
			}
			if(pontosDeControle[i] == Constantes.R3_DESATIVADO){
				pontoDeControle.add('e');
				pontoDeControle2[4] = '0';
			}
			if(pontosDeControle[i] == Constantes.R4_ATIVADO){
				pontoDeControle.add('f');
				pontoDeControle2[5] = '1';
			}
			if(pontosDeControle[i] == Constantes.R4_DESATIVADO){
				pontoDeControle.add('f');
				pontoDeControle2[5] = '0';
			}
			if(pontosDeControle[i] == Constantes.IR_ATIVADO){
				pontoDeControle.add('g');
				pontoDeControle2[6] = '1';
			}
			if(pontosDeControle[i] == Constantes.IR_DESATIVADO){
				pontoDeControle.add('g');
				pontoDeControle2[6] = '0';
			}
			if(pontosDeControle[i] == Constantes.RDADO_ATIVADO){
				pontoDeControle.add('h');
				pontoDeControle2[7] = '1';
			}
			if(pontosDeControle[i] == Constantes.RDADO_DESATIVADO){
				pontoDeControle.add('h');
				pontoDeControle2[7] = '0';
			}
			if(pontosDeControle[i] == Constantes.REND_ATIVADO){
				pontoDeControle.add('i');
				pontoDeControle2[8] = '1';
			}
			if(pontosDeControle[i] == Constantes.REND_DESATIVADO){
				pontoDeControle.add('i');
				pontoDeControle2[8] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_ATIVADO){
				pontoDeControle.add('j');
				pontoDeControle2[9] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_DESATIVADO){
				pontoDeControle.add('j');
				pontoDeControle2[9] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_RDADO){
				pontoDeControle.add('k');
				pontoDeControle2[10] = '0';
				j++;
				pontoDeControle.add('l');
				pontoDeControle2[11] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_R0){
				pontoDeControle.add('k');
				pontoDeControle2[10] = '0';
				j++;
				pontoDeControle.add('l');
				pontoDeControle2[11] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_R1){
				pontoDeControle.add('k');
				pontoDeControle2[10] = '1';
				j++;
				pontoDeControle.add('l');
				pontoDeControle2[11] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_A_RX){
				pontoDeControle.add('k');
				pontoDeControle2[10] = '1';
				j++;
				pontoDeControle.add('l');
				pontoDeControle2[11] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_R2){
				pontoDeControle.add('m');
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle.add('n');
				pontoDeControle2[13] = '0';
				j++;
				pontoDeControle.add('o');
				pontoDeControle2[14] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_R3){
				pontoDeControle.add('m');
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle.add('n');
				pontoDeControle2[13] = '0';
				j++;
				pontoDeControle.add('o');
				pontoDeControle2[14] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_R4){
				pontoDeControle.add('m');
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle.add('n');
				pontoDeControle2[13] = '1';
				j++;
				pontoDeControle.add('o');
				pontoDeControle2[14] = '0';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_RY){
				pontoDeControle.add('m');
				pontoDeControle2[12] = '0';
				j++;
				pontoDeControle.add('n');
				pontoDeControle2[13] = '1';
				j++;
				pontoDeControle.add('o');
				pontoDeControle2[14] = '1';
			}
			if(pontosDeControle[i] == Constantes.MUX_B_PC){
				pontoDeControle.add('m');
				pontoDeControle2[12] = '1';
				j++;
				pontoDeControle.add('n');
				pontoDeControle2[13] = '0';
				j++;
				pontoDeControle.add('o');
				pontoDeControle2[14] = '0';
			}
			if(pontosDeControle[i] == Constantes.A){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.B){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_MAIS_1){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.A_MAIS_B){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_MENOS_B){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.A_AND_B){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_OR_B){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.NOT_A){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_SHIFT_LEFT){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.A_SHIFT_RIGHT){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.B_SHIFT_LEFT){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.B_SHIFT_RIGHT){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.A_MENOS_1){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.B_MAIS_1){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.B_MENOS_1){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.B_MENOS_A){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '0';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRZ){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRN){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRL){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '0';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRG){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRC){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRNZ){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRNN){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '0';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRNC){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRO){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '0';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '1';
			}
			if(pontosDeControle[i] == Constantes.ULA_BRNO){
				pontoDeControle.add('p');
				pontoDeControle2[15] = '0';
				j++;
				pontoDeControle.add('q');
				pontoDeControle2[16] = '1';
				j++;
				pontoDeControle.add('r');
				pontoDeControle2[17] = '1';
				j++;
				pontoDeControle.add('s');
				pontoDeControle2[18] = '1';
				j++;
				pontoDeControle.add('t');
				pontoDeControle2[19] = '1';
				j++;
				pontoDeControle.add('u');
				pontoDeControle2[20] = '0';
			}
			if(pontosDeControle[i] == Constantes.MEMORIA_ATIVADO){
				pontoDeControle.add('v');
				pontoDeControle2[21] = '1';
			}
			if(pontosDeControle[i] == Constantes.MEMORIA_DESATIVADO){
				pontoDeControle.add('v');
				pontoDeControle2[21] = '0';
			}
			if(pontosDeControle[i] == Constantes.RX_ATIVADO){
				pontoDeControle.add('w');
				pontoDeControle2[22] = '1';
			}
			if(pontosDeControle[i] == Constantes.RX_DESATIVADO){
				pontoDeControle.add('w');
				pontoDeControle2[22] = '0';
			}
			if(pontosDeControle[i] == Constantes.RY_ATIVADO){
				pontoDeControle.add('x');
				pontoDeControle2[23] = '1';
			}
			if(pontosDeControle[i] == Constantes.RY_DESATIVADO){
				pontoDeControle.add('x');
				pontoDeControle2[23] = '0';
			}
			
			j++;
		}
		
		if((proximo != "")&&(proximo != "TESTE")){
			pontoDeControle2[24] = proximo.charAt(0);
			pontoDeControle2[25] = proximo.charAt(1);
			pontoDeControle2[26] = proximo.charAt(2);
			pontoDeControle2[27] = proximo.charAt(3);
			pontoDeControle2[28] = proximo.charAt(4);
			pontoDeControle2[29] = proximo.charAt(5);
			pontoDeControle2[30] = proximo.charAt(6);
			pontoDeControle2[31] = proximo.charAt(7);
			pontoDeControle2[32] = proximo.charAt(8);
		}
	}
	
	public char[] getPontoDeControle2() {
		return pontoDeControle2;
	}

	public ArrayList<Character> getPontoDeControle() {
		return pontoDeControle;
	}
}
