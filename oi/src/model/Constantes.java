package model;
 
public class Constantes {
	public static final String REND_RECEBE_PC = "000000001";
	public static final String RDADO_RECEBE_INFORMACAO_LIDA = "000000010";
	public static final String RX_RECBE_RDADO = "000000011";
	public static final String RY_RECEBE_RJ = "000000100";
	public static final String RY_RECEBE_R0 = "000000101";
	public static final String RY_RECEBE_R1 = "000000110";
	public static final String RY_RECEBE_R2 = "000000111";
	public static final String RY_RECEBE_R3 = "000001000";
	public static final String RY_RECEBE_R4 = "000001001";
	public static final String RJ_RECEBE_OPERACAO = "000001010";
	public static final String RX_RECEBE_RI = "";
	public static final String RX_RECEBE_R0 = "";
	public static final String RX_RECEBE_R1 = "";
	public static final String RX_RECEBE_R2 = "";
	public static final String RX_RECEBE_R3 = "";
	public static final String RX_RECEBE_R4 = "";
	public static final String REALIZA_OPERACAO = "OPERACAO";
	public static final String ENDERECO_ADD = "ADD";
	public static final String ENDERECO_SUB = "SUB";
	public static final String ENDERECO_MOV = "MOV";
	public static final String ENDERECO_CMP = "CMP";
	public static final String ENDERECO_AND = "AND";
	public static final String ENDERECO_OR  = "OR";
	public static final String ENDERECO_NOT = "NOT";
	public static final String ENDERECO_CLR = "CLR";
	public static final String ENDERECO_NEG = "NEG";
	public static final String ENDERECO_SHL = "SHL";
	public static final String ENDERECO_SHR = "SHR";
	public static final String ENDERECO_BRZ = "BRZ";
	public static final String ENDERECO_BRN = "BRN";
	public static final String ENDERECO_BRE = "BRE";
	public static final String ENDERECO_BRL = "BRL";
	public static final String ENDERECO_BRG = "BRG";
	public static final String ENDERECO_BRC = "BRC";
	public static final String ENDERECO_JMP = "JMP";
	public static final String ENDERECO_XOR = "XOR";
	public static final String ENDERECO_TEST = "TEST";
	public static final String ENDERECO_INC = "INC";
	public static final String ENDERECO_DEC = "DEC";
	public static final String ENDERECO_BRNZ = "BRNZ";
	public static final String ENDERECO_BRNN = "BRNN";
	public static final String ENDERECO_BRNC = "BRNC";
	public static final String ENDERECO_BRO = "BRO";
	public static final String ENDERECO_BRNO = "BRNO";
	public static final String ENDERECO_HALT = "HALT";
	public static final long LIMITE_CONSTANTE = 2147483648L;
	public static final long LIMITE_NEGATIVO_CONSTANTE = -2147483648L;
	public static final long LIMITE_LABEL = 4294967295L;
	public static final long LIMITE_NEGATIVO_LABEL = -4294967295l;
	public static final int ERRO = -999999;
	public static final int CONSTANTE = 0;
	public static final int R0 = 1;
	public static final int R1 = 2;
	public static final int R2 = 3;
	public static final int R3 = 4;
	public static final int R4 = 5;
	public static final int PR0 = 6;
	public static final int PR1 = 7;
	public static final int PR2 = 8;
	public static final int PR3 = 9;
	public static final int PR4 = 10;
	public static final int R0_ATIVADO = 0;
	public static final int R0_DESATIVADO = 1;
	public static final int R1_ATIVADO = 2;
	public static final int R1_DESATIVADO = 3;
	public static final int PC_ATIVADO = 4;
	public static final int PC_DESATIVADO = 5;
	public static final int R2_ATIVADO = 6;
	public static final int R2_DESATIVADO = 7;
	public static final int R3_ATIVADO = 8;
	public static final int R3_DESATIVADO = 9;
	public static final int R4_ATIVADO = 10;
	public static final int R4_DESATIVADO = 11;
	public static final int IR_ATIVADO = 12;
	public static final int IR_DESATIVADO = 13;
	public static final int RDADO_ATIVADO = 14;
	public static final int RDADO_DESATIVADO = 15;
	public static final int REND_ATIVADO = 16;
	public static final int REND_DESATIVADO = 17;
	public static final int MUX_ATIVADO = 18;
	public static final int MUX_DESATIVADO = 19;
	public static final int MUX_A_RDADO = 20;
	public static final int MUX_A_R0 = 21;
	public static final int MUX_A_R1 = 22;
	public static final int MUX_A_RX = 23;
	public static final int MUX_B_R2 = 24;
	public static final int MUX_B_R3 = 25;
	public static final int MUX_B_R4 = 26;
	public static final int MUX_B_RY = 27;
	public static final int MUX_B_PC = 28;
	public static final int A = 29;
	public static final int B = 30;
	public static final int A_MAIS_1 = 31;
	public static final int A_MAIS_B = 32;
	public static final int A_MENOS_B = 33;
	public static final int A_AND_B = 34;
	public static final int A_OR_B = 35;
	public static final int A_SHIFT_LEFT = 36;
	public static final int A_SHIFT_RIGHT = 37;
	public static final int B_SHIFT_LEFT = 38;
	public static final int B_SHIFT_RIGHT = 39;
	public static final int A_MENOS_1 = 40;
	public static final int B_MAIS_1 = 41;
	public static final int B_MENOS_1 = 42;
	public static final int B_MENOS_A = 43;
	public static final int MEMORIA_ATIVADO = 44;
	public static final int MEMORIA_DESATIVADO = 45;
	public static final int RX_ATIVADO = 46;
	public static final int RX_DESATIVADO = 47;
	public static final int RY_ATIVADO = 48;
	public static final int RY_DESATIVADO = 49;
	public static final int NOT_A = 50;
	public static final String BITS_CONSTANTE = "00";
	public static final String BITS_LABEL = "01";
	public static final String BITS_INSTRUCAO = "10";
	public static final String ADD = "10000000";
	public static final String SUB = "10000001";
	public static final String MOV = "10000010";
	public static final String CMP = "10000011";
	public static final String AND = "10000100";
	public static final String OR  = "10000101";
	public static final String NOT = "10000110";
	public static final String CLR = "10000111";
	public static final String NEG = "10001000";
	public static final String SHL = "10001001";
	public static final String SHR = "10001010";
	public static final String BRZ = "10001011";
	public static final String BRN = "10001100";
	public static final String BRE = "10001101";
	public static final String BRL = "10001110";
	public static final String BRG = "10001111";
	public static final String BRC = "10010000";
	public static final String JMP = "10010001";
	public static final String XOR = "10010010";
	public static final String TEST = "10010011";
	public static final String INC = "10010100";
	public static final String DEC = "10010101";
	public static final String BRNZ = "10010110";
	public static final String BRNN = "10010111";
	public static final String BRNC = "10011000";
	public static final String BRO = "10011001";
	public static final String BRNO = "10011010";
	public static final String HALT = "10011100";
	public static final String CONSTANTE_FONTE = "0000";
	public static final String R0_FONTE = "0001";
	public static final String R1_FONTE = "0010";
	public static final String R2_FONTE = "0011";
	public static final String R3_FONTE = "0100";
	public static final String R4_FONTE = "0101";
	public static final String PR0_FONTE = "0110";
	public static final String PR1_FONTE = "0111";
	public static final String PR2_FONTE = "1000";
	public static final String PR3_FONTE = "1001";
	public static final String PR4_FONTE = "1010";
	public static final String LABEL = "1011";
	public static final String NENHUMA_FONTE = "1100";
	public static final String R0_DESTINO = "0000";
	public static final String R1_DESTINO = "0001";
	public static final String R2_DESTINO = "0010";
	public static final String R3_DESTINO = "0011";
	public static final String R4_DESTINO = "0100";
	public static final String PR0_DESTINO = "0101";
	public static final String PR1_DESTINO = "0110";
	public static final String PR2_DESTINO = "0111";
	public static final String PR3_DESTINO = "1000";
	public static final String PR4_DESTINO = "1001";
	public static final String NENHUM_DESTINO = "1010";
	public static final int RODAPROGRAMA = 0;
	public static final int RODAINSTRUCAO = 1;
	public static final int RODAMICRO = 2;
	public static final int TAMANHO_PALAVRA = 32;
	public static final int TAMANHO_CACHE = 12;
	public static final int TAMANHO_BLOCO_CACHE = 4;
}
