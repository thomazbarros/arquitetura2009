package model;

import java.util.ArrayList;
 
public class MemoriaDeControle {
	
	private ArrayList<Microinstrucao> memoriaDeControle;
	
	public MemoriaDeControle(){
		memoriaDeControle = new ArrayList<Microinstrucao>();
		
		//atualizaPC - 000000000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC));
		
		//rEndRecebePC - 000000001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA));

		//rDadoRecebeInformacaoLida - 000000010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_DESATIVADO, Constantes.RDADO_ATIVADO}, Constantes.CAMINHO_3));
		
		//rXRecebeRDado - 000000011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}, Constantes.RY_RECEBE_RJ));
		
		//rYRecebeRJ - 000000100
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rYRecebeR0 - 000000101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}, Constantes.CAMINHO_4));
		
		//rYRecebeR1 - 000000110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RY_ATIVADO}, Constantes.CAMINHO_4));
		
		//rYRecebeR2 - 000000111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}, Constantes.CAMINHO_4));
		
		//rYRecebeR3 - 000001000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}, Constantes.CAMINHO_4));
		
		//rYRecebeR4 - 000001001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}, Constantes.CAMINHO_4));
		
		//rJRecebeOperacao - 000001010
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//r0RecebeSoma - 000001011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MAIS_B, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeSoma - 000001100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MAIS_B, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeSoma - 000001101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MAIS_B, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeSoma - 000001110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MAIS_B, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeSoma - 000001111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MAIS_B, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r0RecebeDiferenca - 000010000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.B_MENOS_A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeDiferenca - 000010001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.B_MENOS_A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeDiferenca - 000010010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.B_MENOS_A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeDiferenca - 000010011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.B_MENOS_A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeDiferenca - 000010100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.B_MENOS_A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r0RecebeE - 000010101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_AND_B, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeE - 000010110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_AND_B, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeE - 000010111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_AND_B, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeE - 000011000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_AND_B, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeE - 000011001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_AND_B, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r0RecebeOu - 000011010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_OR_B, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeOu - 000011011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_OR_B, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeOu - 000011100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_OR_B, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeOu - 000011101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_OR_B, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeOu - 000011110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_OR_B, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//atualizaPC - 000011111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//rEndRecebePC - 000100000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_BUSCA));
		
		//rDadoRecebeInformacaoLida - 000100001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_DESATIVADO, Constantes.RDADO_ATIVADO}, Constantes.IR_RECEBE_RDADO));
		
		//iRRecebeRDado - 000100010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.IR_ATIVADO}, Constantes.PRIMEIRA_MICRO_INSTRUCAO));
		
		//halt - 000100011
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rEndRecebeRJ - 000100100
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
	
		//rEndRecebeR0 - 000100101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_2));
		
		//rEndRecebeR1 - 000100110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_2));
		
		//rEndRecebeR2 - 000100111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_2));
		
		//rEndRecebeR3 - 000101000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_2));
		
		//rEndRecebeR4 - 000101001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_2));
		
		//rDadoRecebeInformacaoLida - 000101010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_DESATIVADO, Constantes.RDADO_ATIVADO}, Constantes.RY_RECEBE_RDADO));
		
		//rYRecebeRDado - 000101011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}, Constantes.CAMINHO));
		
		//atualizaPC3 - 000101100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_3));
		
		//rDadoRecebeInformacaoLida - 000101101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_DESATIVADO, Constantes.RDADO_ATIVADO}, Constantes.CAMINHO_2));
		
		//rXRecebeRDado - 000101110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}, Constantes.CAMINHO_5));
		
		//rEndRecebeRJ - 000101111
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rEndRecebeR0 - 0001100000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.REND_RECEBE_RY));
		
		//rEndRecebeR1 - 0001100001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.REND_RECEBE_RY));
		
		//rEndRecebeR2 - 000110010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.REND_RECEBE_RY));
		
		//rEndRecebeR3 - 000110011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.REND_RECEBE_RY));
		
		//rEndRecebeR4 - 000110100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.REND_RECEBE_RY));
		
		//rEndRecebeRY - 000110101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rXRecebeRI - 000110110
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rXRecebeR0 - 000110111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}, Constantes.CAMINHO_6));
		
		//rXRecebeR1 - 000111000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}, Constantes.CAMINHO_6));
		
		//rXRecebeR2 - 000111001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}, Constantes.CAMINHO_6));
		
		//rXRecebeR3 - 000111010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}, Constantes.CAMINHO_6));
		
		//rXRecebeR4 - 000111011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}, Constantes.CAMINHO_6));
		
		//rYRecebeOperacao - 000111010
		memoriaDeControle.add(new Microinstrucao(new int[] {}, ""));
		
		//rYRecebeSoma - 000111101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MAIS_B, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ_2));
		
		//rYRecebeDiferenca - 000111110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MENOS_B, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ_2));
		
		//rYRecebeELogico - 000111111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_AND_B, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ_2));
		
		//rYRecebeOuLogico - 001000000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_OR_B, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ_2));
		
		//rEndRecebeRI - 001000001
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
			
		//caminho - 001000010
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//caminho2 - 001000011
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));

		//caminho3 - 001000100
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));

		//caminho4 - 001000101
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//caminho5 - 001000110
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//caminho6 - 001000111
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rEndRecebeRY - 001001000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rEndRecebeR0 - 001001001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA));
		
		//rEndRecebeR1 - 001001010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA));
		
		//rEndRecebeR2 - 001001011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA));
		
		//rEndRecebeR3 - 001001100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA));
		
		//rEndRecebeR4 - 001001101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA));
		
		//rEndRecebeRI2 - 001001110
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rEndRecebeR0 - 001001111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_3));
		
		//rEndRecebeR1 - 001010000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_3));
		
		//rEndRecebeR2 - 001010001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_3));
		
		//rEndRecebeR3 - 001010010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_3));
		
		//rEndRecebeR4 - 001010011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_3));
		
		//rJRecebeRDado - 001010110
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//r0RecebeRDado - 001010101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeRDado - 001010110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeRDado - 001010111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeRDado - 001011000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeRDado - 001011001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rXComparaRY - 001011010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MENOS_B}, Constantes.ATUALIZA_PC_2));
		
		//rXRecebeRI2 - 001011011
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rXRecebeR0 - 001011100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}, Constantes.RI_RECEBE_OPERACAO));
		
		//rXRecebeR1 - 001011101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}, Constantes.RI_RECEBE_OPERACAO));
		
		//rXRecebeR2 - 001011110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}, Constantes.RI_RECEBE_OPERACAO));
		
		//rXRecebeR3 - 001011111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}, Constantes.RI_RECEBE_OPERACAO));
		
		//rXRecebeR4 - 001100000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}, Constantes.RI_RECEBE_OPERACAO));
		
		//rIRecebeOperacao - 001100001
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//r0RecebeNot - 001100010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeNot - 001100011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeNot - 001100100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeNot - 001100101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeNot - 001100110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r0RecebeDeslocamentoEsquerda - 001100111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeDeslocamentoEsquerda - 001101000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeDeslocamentoEsquerda - 001101001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
	    //r3RecebeDeslocamentoEsquerda - 001101010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeDeslocamentoEsquerda - 001101011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
        //r0RecebeDeslocamentoDireita - 001101100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		 
		//r1RecebeDeslocamentoDireita - 001101101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeDeslocamentoDireita - 001101110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeDeslocamentoDireita - 001101111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeDeslocamentoDireita - 001110000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rXRecebeOperacao - 011100001
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rXRecebeNot - 001110010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.RX_ATIVADO}, Constantes.REND_RECEBE_RX_2));
		
		//rXRecebeDeslocamentoEsquerda - 001110011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.RX_ATIVADO}, Constantes.REND_RECEBE_RX_2));
		
		//rXRecebeDeslocamentoDireita - 001110100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.RX_ATIVADO}, Constantes.REND_RECEBE_RX_2));
		
		//rEndRecebeRX - 001110101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.REND_RECEBE_RI_3));
		
		//rEndRecebeRI - 001110110
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rEndRecebeR0 - 001110111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rEndRecebeR1 - 001111000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rEndRecebeR2 - 001111001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rEndRecebeR3 - 001111010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rEndRecebeR4 - 001111011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rJRecebeRI - 001111100
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//r0RecebeR1 - 001111101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r0RecebeR2 - 001111110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r0RecebeR3 - 001111111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
	
		//r0RecebeR4 - 010000000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
	
		//r1RecebeR0 - 010000001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
 
		//r1RecebeR2 - 010000010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));	
		
		//r1RecebeR3 - 010000011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
	
		//r1RecebeR4 - 010000100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
	
		//r2RecebeR0 - 010000101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r2RecebeR1 - 010000110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r2RecebeR3 - 010000111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r2RecebeR4 - 010001000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r3RecebeR0 - 010001001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r3RecebeR1 - 010001010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r3RecebeR2 - 010001011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r3RecebeR4 - 010001100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r4RecebeR0 - 010001101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r4RecebeR1 - 010001110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r4RecebeR2 - 010001111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));

		//r4RecebeR3 - 010010000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rXRecebeRDado - 010010001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}, Constantes.CAMINHO_5));
		
		//rYRecebeRDado - 010010010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ_2));
		
		//rYRecebeRI - 010010011
		memoriaDeControle.add(new Microinstrucao(new int[]{}, ""));
		
		//rYRecebeR0 - 010010100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ));
		
		//rYRecebeR1 - 010010101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ));
		
		//rYRecebeR2 - 010010110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ));
		
		//rYRecebeR3 - 010010111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ));
		
		//rYRecebeR4 - 010011000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}, Constantes.REND_RECEBE_RJ));
		
		//pCRecebeOperacao - 010011001
		memoriaDeControle.add(new Microinstrucao(new int[] {}, ""));
		
		//pCRecebeDesvioSeZero - 010011010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRZ, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeNegativo - 010011011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRN, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeMenor - 010011100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRL, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeMaior - 010011101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRG, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeCarry - 010011110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRC, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeNaoZero - 010011111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRNZ, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeNaoNegativo - 010100000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRNN, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeNaoCarry - 010100001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRNC, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeOverflow - 010100010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRO, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeDesvioSeNaoOverflow - 010100011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_BRZ, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//pCRecebeJump - 010100100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.MUX_B_PC, Constantes.ULA_JUMP, Constantes.PC_ATIVADO}, Constantes.REND_RECEBE_PC_2));
		
		//r0RecebeNegacao - 010100101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NEGACAO_A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeNegacao - 010100110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NEGACAO_A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeNegacao - 010100111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NEGACAO_A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeNegacao - 010101000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NEGACAO_A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeNegacao - 010101001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NEGACAO_A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
        //r0Limpa - 010101010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.CLEAR_A, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1Limpa - 010101011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.CLEAR_A, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2Limpa - 010101100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.CLEAR_A, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3Limpa - 010101101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.CLEAR_A, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
	    //r4Limpa - 010101110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.CLEAR_A, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
        //r0RecebeOuExclusivo - 010101111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_XOR_B, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeOuExclusivo - 010110000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_XOR_B, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
	    //r2RecebeOuExclusivo - 010110001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_XOR_B, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeOuExclusivo - 010110010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_XOR_B, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeOuExclusivo - 010110011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_XOR_B, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
        //r0RecebeIncrementa - 010110100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MAIS_1, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeIncrementa - 010110101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MAIS_1, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
        //r2RecebeIncrementa - 010110110		
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MAIS_1, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeIncrementa - 010110111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MAIS_1, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeIncrementa - 010111000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MAIS_1, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r0RecebeDecrementa - 010111001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MENOS_1, Constantes.R0_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r1RecebeDecrementa - 010111010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MENOS_1, Constantes.R1_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r2RecebeDecrementa - 010111011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MENOS_1, Constantes.R2_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r3RecebeDecrementa - 010111100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MENOS_1, Constantes.R3_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//r4RecebeDecrementa - 010111101
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MENOS_1, Constantes.R4_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
        //rXRecebeNegacao - 010111110
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NEGACAO_A, Constantes.RX_ATIVADO}, Constantes.REND_RECEBE_RX_2));
		
		//rXLimpa - 010111111
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.CLEAR_A, Constantes.RX_ATIVADO}, Constantes.REND_RECEBE_RX_2));
		
		//rYRecebeOuExclusivo - 011000000
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_XOR_B, Constantes.RY_ATIVADO}, Constantes.ATUALIZA_PC_2));
		
		//rXRecebeIncrementa - 011000001
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MAIS_1, Constantes.RX_ATIVADO}, Constantes.REND_RECEBE_RX_2));
		
		//rXRecebeDecrementa - 011000010
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_MENOS_1, Constantes.RX_ATIVADO}, Constantes.REND_RECEBE_RX_2));
		
		//rEndRecebePC - 011000011
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_3));
		
		//rEndRecebePCMais1 - 011000100
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}, Constantes.RDADO_RECEBE_INFORMACAO_LIDA_BUSCA));
	}
		/*
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//ADD <constante, rj>
		
		
		
		//ADD <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		
		
		//ADD <ri, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//ADD <ri, (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//ADD <(ri), rj>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//ADD <(ri), (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//SUB <constante, rj>
		
		
		
		//SUB <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		//SUB <ri, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//SUB <ri, (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//SUB <(ri), rj>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//SUB <(ri), (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//MOVE <constante, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//r0RecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A, Constantes.R0_ATIVADO}));
		
		//r1RecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A, Constantes.R1_ATIVADO}));
		
		//r2RecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A, Constantes.R2_ATIVADO}));
		
		//r3RecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A, Constantes.R3_ATIVADO}));
		
		//r4RecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A, Constantes.R4_ATIVADO}));
		
		//MOVE <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		//MOVE <ri, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//MOVE <ri, (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//MOVE <(ri), rj>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//MOVE <(ri), (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//CMP <constante, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//Comparacao
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.MUX_B_RY, Constantes.A_MENOS_B}));
		
		//CMP <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		//CMP <ri, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//CMP <ri, (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//CMP <(ri), rj>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//CMP <(ri), (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//AND <constante, rj>

		
		//AND <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		//AND <ri, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//AND <ri, (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//AND <(ri), rj>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//AND <(ri), (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//OR <constante, rj>
		
		
		
		
		//OR <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		//OR <ri, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//OR <ri, (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//OR <(ri), rj>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//OR <(ri), (rj)>
		
		//rXRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R1, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rXRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rXRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RX_ATIVADO}));
		
		//rEndRecebeRX
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//NOT <constante, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//r0RecebeNot
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R0_ATIVADO}));
		
		//r1RecebeNot
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R1_ATIVADO}));
		
		//r2RecebeNot
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R2_ATIVADO}));
		
		//r3RecebeNot
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R3_ATIVADO}));
		
		//r4RecebeNot
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.NOT_A, Constantes.R4_ATIVADO}));
		
		//NOT <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		//SHL <constante, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//r0RecebeDeslocamentoEsquerda
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R0_ATIVADO}));
		
		//r1RecebeDeslocamentoEsquerda
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R1_ATIVADO}));
		
		//r2RecebeDeslocamentoEsquerda
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R2_ATIVADO}));
		
		//r3RecebeDeslocamentoEsquerda
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R3_ATIVADO}));
		
		//r4RecebeDeslocamentoEsquerda
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_LEFT, Constantes.R4_ATIVADO}));
		
		//SHL <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		//SHR <constante, rj>
		
		//atualizaPC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.PC_ATIVADO}));
		
		//rYRecebeR0
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebePC
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//r0RecebeDeslocamentoDireita
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R0_ATIVADO}));
		
		//r1RecebeDeslocamentoDireita
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R1_ATIVADO}));
		
		//r2RecebeDeslocamentoDireita
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R2_ATIVADO}));
		
		//r3RecebeDeslocamentoDireita
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R3_ATIVADO}));
		
		//r4RecebeDeslocamentoDireita
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RX, Constantes.A_SHIFT_RIGHT, Constantes.R4_ATIVADO}));
		
		//SHR <constante, (rj)>
		
		//rEndRecebePCMais1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_PC, Constantes.B_MAIS_1, Constantes.REND_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rXRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RX_ATIVADO}));
		
		//rYRecebeR1
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_R0, Constantes.A, Constantes.RY_ATIVADO}));
		
		//rYRecebeR2
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R2, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR3
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R3, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rYRecebeR4
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_R4, Constantes.B, Constantes.RY_ATIVADO}));
		
		//rEndRecebeRY
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_B_RY, Constantes.B, Constantes.REND_ATIVADO, Constantes.MEMORIA_ATIVADO}));
		
		//rDadoRecebeInformacaoLida
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_ATIVADO, Constantes.RDADO_ATIVADO}));
		
		//rYRecebeRDado
		memoriaDeControle.add(new Microinstrucao(new int[]{Constantes.MUX_A_RDADO, Constantes.A, Constantes.RY_ATIVADO}));
		
		*/

	public ArrayList<Microinstrucao> getMemoriaDeControle() {
		return memoriaDeControle;
	}
		
	}
	
	
	/*public Microinstrucao rEndRecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebePC(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rDadoRecebeInformacaoLida(){
		char[] pontoDeControle = {'j', 'h'};
		boolean[] pontoDeControle2 = {false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeRDado(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao irRecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'g'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao irRecebePC(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'g'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao atualizaPC(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebePCMais1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MaisR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0MaisR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MaisR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MaisRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		//boolean[] pontoDeControle2 = {false, true, false, false, true, true, false, false, false, true, true, true};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MaisR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1MaisR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MaisR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MaisRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMaisR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXMaisR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMaisR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMaisRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'}; 
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MenosR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0MenosR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MenosR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MenosRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MenosR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1MenosR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MenosR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',  'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MenosRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMenosR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXMenosR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMenosR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMenosRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o',  'k', 'l', 'p', 'q', 'r', 's', 't', 'u',  'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r4RecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r4RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r4RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0AndR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0AndR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0AndR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0AndRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1AndR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1AndR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1AndR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1AndRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXAndR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXAndR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXAndR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXAndRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2AndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = { false, false, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2AndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2AndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = { false, false, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3AndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3AndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3AndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4AndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4AndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4AndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYAndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = { false, true, true, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYAndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYAndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0OrR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0OrR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0OrR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0OrRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1OrR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1OrR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1OrR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1OrRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXOrR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXOrR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXOrR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXOrRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2OrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2OrR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2OrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3OrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3OrR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3OrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4OrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4OrR1(){
		char[] pontoDeControle = {'m', 'n', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4OrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYOrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYOrR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYOrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ComparaR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0ComparaR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ComparaR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ComparaRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ComparaR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1ComparaR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ComparaR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ComparaRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXComparaR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXComparaR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXComparaR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXComparaRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeR0(){ 
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Zera(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Zera(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXZera(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Zera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Zera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Zera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYZera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ShiftLeft(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ShiftLeft(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXShiftLeft(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ShiftRight(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ShiftRight(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXShiftRight(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'y'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Negacao(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Negacao(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXNegacao(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Negacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Negacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Negacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYNegacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'y'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Not(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Not(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXNot(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Not(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Not(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Not(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYNot(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0XorR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0XorR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0XorR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0XorRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1XorR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1XorR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1XorR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1XorRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXXorR2(){
      char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
      boolean[] pontoDeControle2 = {true, true, false, false, false, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }

  public Microinstrucao rXXorR3(){
      char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
      boolean[] pontoDeControle2 = {true, true, false, false, true, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
  
  public Microinstrucao rXXorR4(){
      char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
      boolean[] pontoDeControle2 = {true, true, false, true, false, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
	
	public Microinstrucao rXXorRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2XorR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2XorR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2XorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3XorR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3XorR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3XorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4XorR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4XorR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4XorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYXorR0(){
      char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'v'};
      boolean[] pontoDeControle2 = {false, true, true, false, true, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
  
  public Microinstrucao rYXorR1(){
      char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'v'};
      boolean[] pontoDeControle2 = {false, true, true, true, false, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
	
	public Microinstrucao rYXorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0TestR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0TestR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0TestR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0TestRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1TestR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1TestR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1TestR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1TestRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXTestRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2TestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = { false, false, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3TestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4TestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYTestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Incrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Incrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXIncrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Incrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Incrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Incrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYIncrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Decrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Decrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXDecrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Decrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Decrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Decrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYDecrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao jump(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brz(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brn(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brl(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brg(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brc(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brnz(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brnn(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brnc(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao bro(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brno(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}*/

