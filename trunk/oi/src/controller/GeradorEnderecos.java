package controller;

import model.Constantes;

public class GeradorEnderecos {
	
	public String proximoEndereco(String endereco,String codigo){
		if(endereco.equals(Constantes.RX_RECEBE_RI)){
			return rxRecebeRi(codigo);
		}
		if(endereco.equals(Constantes.RY_RECEBE_RJ)){
			return ryRecebeRj(codigo);
		}
		if(endereco.equals(Constantes.REALIZA_OPERACAO)){
			return realizaOperacao(codigo);
		}
		return endereco;
	}
	
	public String rxRecebeRi(String codigo){
		int registrador;
		
		registrador = identificaRegistradorFonte(codigo.substring(10,12));
		switch(registrador){
			case Constantes.R0:
				return Constantes.RX_RECEBE_R0;
			case Constantes.R1:
				return Constantes.RX_RECEBE_R1;
			case Constantes.R2:
				return Constantes.RX_RECEBE_R2;
			case Constantes.R3:
				return Constantes.RX_RECEBE_R3;
			case Constantes.R4:
				return Constantes.RX_RECEBE_R4;
		}
		return "";
	}
	
	public String ryRecebeRj(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(14,16));
		switch(registrador){
			case Constantes.R0:
				return Constantes.RY_RECEBE_R0;
			case Constantes.R1:
				return Constantes.RY_RECEBE_R1;
			case Constantes.R2:
				return Constantes.RY_RECEBE_R2;
			case Constantes.R3:
				return Constantes.RY_RECEBE_R3;
			case Constantes.R4:
				return Constantes.RY_RECEBE_R4;
		}
		return "";
	}

	/*public int identificaRegistrador(String codigo,boolean isFonte){
		Parser parser = new Parser();
		int [] tiposArgumentos;
		tiposArgumentos = parser.decifraArgumentos(codigo);
		if(isFonte){
			return tiposArgumentos[0];
		}
		return tiposArgumentos[1];
	}*/
	
	public int identificaRegistradorFonte(String codigo){
		
		if(codigo.equals(Constantes.R0_FONTE)){// || codigo.equals(Constantes.PR0_FONTE)){
			return Constantes.R0;
		}
		if(codigo.equals(Constantes.R1_FONTE)){// || codigo.equals(Constantes.PR1_FONTE)){
			return Constantes.R1;
		}
		if(codigo.equals(Constantes.R2_FONTE)){// || codigo.equals(Constantes.PR2_FONTE)){
			return Constantes.R2;
		}
		if(codigo.equals(Constantes.R3_FONTE)){// || codigo.equals(Constantes.PR3_FONTE)){
			return Constantes.R3;
		}
		if(codigo.equals(Constantes.R4_FONTE)){//) || codigo.equals(Constantes.PR4_FONTE)){
			return Constantes.R4;
		}
		
		return Constantes.ERRO;
	}
	
	public int identificaRegistradorDestino(String codigo){
		if(codigo.equals(Constantes.R0_DESTINO)){// || codigo.equals(Constantes.PR0_DESTINO)){
			return Constantes.R0;
		}
		if(codigo.equals(Constantes.R1_DESTINO)){// || codigo.equals(Constantes.PR1_DESTINO)){
			return Constantes.R1;
		}
		if(codigo.equals(Constantes.R2_DESTINO)){// || codigo.equals(Constantes.PR2_DESTINO)){
			return Constantes.R2;
		}
		if(codigo.equals(Constantes.R3_DESTINO)){// || codigo.equals(Constantes.PR3_DESTINO)){
			return Constantes.R3;
		}
		if(codigo.equals(Constantes.R4_DESTINO)){// || codigo.equals(Constantes.PR4_DESTINO)){
			return Constantes.R4;
		}
		return Constantes.ERRO;
	}
	
	
	public String realizaOperacao(String codigo){
		String operacao = codigo.substring(Constantes.BITS_INSTRUCAO.length(),
				Constantes.BITS_INSTRUCAO.length()+Constantes.ADD.length());
		if(operacao.equals(Constantes.ADD)){
			return Constantes.ENDERECO_ADD;
		}
		if(operacao.equals(Constantes.SUB)){
			return Constantes.ENDERECO_SUB;	
		}
		if(operacao.equals(Constantes.MOV)){
			return Constantes.ENDERECO_MOV;
		}
		if(operacao.equals(Constantes.CMP)){
			return Constantes.ENDERECO_CMP;
		}
		if(operacao.equals(Constantes.AND)){
			return Constantes.ENDERECO_AND;
		}
		if(operacao.equals(Constantes.OR)){
			return Constantes.ENDERECO_OR;	
		}
		if(operacao.equals(Constantes.NOT)){
			return Constantes.ENDERECO_NOT;
		}
		if(operacao.equals(Constantes.CLR)){
			return Constantes.ENDERECO_CLR;
		}
		if(operacao.equals(Constantes.NEG)){
			return Constantes.ENDERECO_NEG;
		}
		if(operacao.equals(Constantes.SHL)){
			return Constantes.ENDERECO_SHL;
		}
		if(operacao.equals(Constantes.SHR)){
			return Constantes.ENDERECO_SHR;	
		}
		if(operacao.equals(Constantes.BRZ)){
			return Constantes.ENDERECO_BRZ;
		}
		if(operacao.equals(Constantes.BRN)){
			return Constantes.ENDERECO_BRN;
		}
		if(operacao.equals(Constantes.BRE)){
			return Constantes.ENDERECO_BRE;	
		}
		if(operacao.equals(Constantes.BRL)){
			return Constantes.ENDERECO_BRL;	
		}
		if(operacao.equals(Constantes.BRG)){
			return Constantes.ENDERECO_BRG;	
		}
		if(operacao.equals(Constantes.BRC)){
			return Constantes.ENDERECO_BRC;	
		}
		if(operacao.equals(Constantes.JMP)){
			return Constantes.ENDERECO_JMP;
		}
		if(operacao.equals(Constantes.XOR)){
			return Constantes.ENDERECO_XOR;	
		}
		if(operacao.equals(Constantes.TEST)){
			return Constantes.ENDERECO_TEST;
		}
		if(operacao.equals(Constantes.INC)){
			return Constantes.ENDERECO_INC;
		}
		if(operacao.equals(Constantes.DEC)){
			return Constantes.ENDERECO_DEC;
		}
		if(operacao.equals(Constantes.BRNZ)){
			return Constantes.ENDERECO_BRNZ;
		}
		if(operacao.equals(Constantes.BRNN)){
			return Constantes.ENDERECO_BRNN;
		}
		if(operacao.equals(Constantes.BRNC)){
			return Constantes.ENDERECO_BRNC;
		}
		if(operacao.equals(Constantes.BRO)){
			return Constantes.ENDERECO_BRO;
		}
		if(operacao.equals(Constantes.BRNO)){
			return Constantes.ENDERECO_BRNO;
		}
		if(operacao.equals(Constantes.HALT)){
			return Constantes.ENDERECO_HALT;
		}
		return "";
	}
}