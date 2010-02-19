package controller;

import java.util.ArrayList;

import model.Constantes;

public class GeradorEnderecos {
	ArrayList<String> registradorOperacao;
	
	public GeradorEnderecos(){
		inicializaComponentes();
	}
	
	public void inicializaComponentes(){
		registradorOperacao = new ArrayList<String>();
		registradorOperacao.add(Constantes.R0_RECEBE_SOMA);
		registradorOperacao.add(Constantes.R1_RECEBE_SOMA);
		registradorOperacao.add(Constantes.R2_RECEBE_SOMA);
		registradorOperacao.add(Constantes.R3_RECEBE_SOMA);
		registradorOperacao.add(Constantes.R4_RECEBE_SOMA);
		registradorOperacao.add(Constantes.R0_RECEBE_DIFERENCA);
		registradorOperacao.add(Constantes.R1_RECEBE_DIFERENCA);
		registradorOperacao.add(Constantes.R2_RECEBE_DIFERENCA);
		registradorOperacao.add(Constantes.R3_RECEBE_DIFERENCA);
		registradorOperacao.add(Constantes.R4_RECEBE_DIFERENCA);
		registradorOperacao.add(Constantes.R0_RECEBE_E);
		registradorOperacao.add(Constantes.R1_RECEBE_E);
		registradorOperacao.add(Constantes.R2_RECEBE_E);
		registradorOperacao.add(Constantes.R3_RECEBE_E);
		registradorOperacao.add(Constantes.R4_RECEBE_E);
		registradorOperacao.add(Constantes.R0_RECEBE_OU);
		registradorOperacao.add(Constantes.R1_RECEBE_OU);
		registradorOperacao.add(Constantes.R2_RECEBE_OU);
		registradorOperacao.add(Constantes.R3_RECEBE_OU);
		registradorOperacao.add(Constantes.R4_RECEBE_OU);
		registradorOperacao.add(Constantes.R0_RECEBE_NOT);
		registradorOperacao.add(Constantes.R1_RECEBE_NOT);
		registradorOperacao.add(Constantes.R2_RECEBE_NOT);
		registradorOperacao.add(Constantes.R3_RECEBE_NOT);
		registradorOperacao.add(Constantes.R4_RECEBE_NOT);
		registradorOperacao.add(Constantes.R0_RECEBE_DESLOCAMENTO_ESQUERDA);
		registradorOperacao.add(Constantes.R1_RECEBE_DESLOCAMENTO_ESQUERDA);
		registradorOperacao.add(Constantes.R2_RECEBE_DESLOCAMENTO_ESQUERDA);
		registradorOperacao.add(Constantes.R3_RECEBE_DESLOCAMENTO_ESQUERDA);
		registradorOperacao.add(Constantes.R4_RECEBE_DESLOCAMENTO_ESQUERDA);
		registradorOperacao.add(Constantes.R0_RECEBE_DESLOCAMENTO_DIREITA);
		registradorOperacao.add(Constantes.R1_RECEBE_DESLOCAMENTO_DIREITA);
		registradorOperacao.add(Constantes.R2_RECEBE_DESLOCAMENTO_DIREITA);
		registradorOperacao.add(Constantes.R3_RECEBE_DESLOCAMENTO_DIREITA);
		registradorOperacao.add(Constantes.R4_RECEBE_DESLOCAMENTO_DIREITA);
	}
	
	public String proximoEndereco(String endereco,String codigo){
		if(endereco.equals(Constantes.RX_RECEBE_RI)){
			return rxRecebeRi(codigo);
		}
		if(endereco.equals(Constantes.RY_RECEBE_RJ)){
			return ryRecebeRj(codigo);
		}
		if(endereco.equals(Constantes.REND_RECEBE_RI)){
			return rEndRecebeRi(codigo);
		}
		if(endereco.equals(Constantes.REND_RECEBE_RJ)){
			return rEndRecebeRj(codigo);
		}
		if(endereco.equals(Constantes.REND_RECEBE_RI_2)){
			return rEndRecebeRi2(codigo);
		}
		if(endereco.equals(Constantes.REND_RECEBE_RJ_2)){
			return rEndRecebeRj2(codigo);
		}
		if(endereco.equals(Constantes.REND_RECEBE_RI_3)){
			return rEndRecebeRi3(codigo);
		}
		if(endereco.equals(Constantes.REALIZA_OPERACAO)){
			return realizaOperacao(codigo);
		}
		if(endereco.equals(Constantes.PRIMEIRA_MICRO_INSTRUCAO)){
			return primeiraMicro(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO)){
			return caminho(codigo);
		}
		/*if(endereco.equals(Constantes.CAMINHO_2)){
			return caminho2(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO_3)){
			return caminho3(codigo);
		}*/
		if(endereco.equals(Constantes.CAMINHO_4)){
			return caminho4(codigo);
		}/*
		if(endereco.equals(Constantes.CAMINHO_5)){
			return caminho5(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO_6)){
			return caminho6(codigo);
		}*/
		return endereco;
	}
	
	public String rxRecebeRi(String codigo){
		int registrador;
		
		registrador = identificaRegistradorFonte(codigo.substring(10,14));
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
		registrador = identificaRegistradorDestino(codigo.substring(14,18));
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
	
	public String rEndRecebeRi(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(10,14));
		switch(registrador){
			case Constantes.R0:
				return Constantes.REND_RECEBE_R0;
			case Constantes.R1:
				return Constantes.REND_RECEBE_R1;
			case Constantes.R2:
				return Constantes.REND_RECEBE_R2;
			case Constantes.R3:
				return Constantes.REND_RECEBE_R3;
			case Constantes.R4:
				return Constantes.REND_RECEBE_R4;
		}
		return "";
	}
	
	public String rEndRecebeRj(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(14,18));
		switch(registrador){
			case Constantes.R0:
				return Constantes.REND_RECEBE_R0;
			case Constantes.R1:
				return Constantes.REND_RECEBE_R1;
			case Constantes.R2:
				return Constantes.REND_RECEBE_R2;
			case Constantes.R3:
				return Constantes.REND_RECEBE_R3;
			case Constantes.R4:
				return Constantes.REND_RECEBE_R4;
		}
		return "";
	}
	
	public String rEndRecebeRi2(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(10,14));
		switch(registrador){
			case Constantes.R0:
				return Constantes.REND_RECEBE_R0_2;
			case Constantes.R1:
				return Constantes.REND_RECEBE_R1_2;
			case Constantes.R2:
				return Constantes.REND_RECEBE_R2_2;
			case Constantes.R3:
				return Constantes.REND_RECEBE_R3_2;
			case Constantes.R4:
				return Constantes.REND_RECEBE_R4_2;
		}
		return "";
	}
	
	public String rEndRecebeRj2(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(14,18));
		switch(registrador){
			case Constantes.R0:
				return Constantes.REND_RECEBE_R0_2;
			case Constantes.R1:
				return Constantes.REND_RECEBE_R1_2;
			case Constantes.R2:
				return Constantes.REND_RECEBE_R2_2;
			case Constantes.R3:
				return Constantes.REND_RECEBE_R3_2;
			case Constantes.R4:
				return Constantes.REND_RECEBE_R4_2;
		}
		return "";
	}
	
	public String rEndRecebeRi3(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(10,14));
		switch(registrador){
			case Constantes.R0:
				return Constantes.REND_RECEBE_R0_3;
			case Constantes.R1:
				return Constantes.REND_RECEBE_R1_3;
			case Constantes.R2:
				return Constantes.REND_RECEBE_R2_3;
			case Constantes.R3:
				return Constantes.REND_RECEBE_R3_3;
			case Constantes.R4:
				return Constantes.REND_RECEBE_R4_3;
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
	
	public int indiceOperacao(String codigo){
		String operacao = codigo.substring(Constantes.BITS_INSTRUCAO.length(),
				Constantes.BITS_INSTRUCAO.length()+Constantes.ADD.length());
		if(operacao.equals(Constantes.ADD)){
			return Constantes.INDICE_ADD;
		}
		if(operacao.equals(Constantes.SUB)){
			return Constantes.INDICE_SUB;	
		}
		if(operacao.equals(Constantes.AND)){
			return Constantes.INDICE_AND;
		}
		if(operacao.equals(Constantes.OR)){
			return Constantes.INDICE_OR;	
		}
		if(operacao.equals(Constantes.NOT)){
			return Constantes.INDICE_NOT;
		}
		if(operacao.equals(Constantes.SHL)){
			return Constantes.INDICE_SHL;
		}
		if(operacao.equals(Constantes.SHR)){
			return Constantes.INDICE_SHR;	
		}
		return Constantes.ERRO;
	}
	
	public String realizaOperacao(String codigo){
		String operacao = codigo.substring(Constantes.BITS_INSTRUCAO.length(),
				Constantes.BITS_INSTRUCAO.length()+Constantes.ADD.length());
		if(operacao.equals(Constantes.ADD)){
			return Constantes.OPERACAO_ADD;
		}
		if(operacao.equals(Constantes.SUB)){
			return Constantes.OPERACAO_SUB;	
		}
		if(operacao.equals(Constantes.MOV)){
			return Constantes.OPERACAO_MOV;
		}
		if(operacao.equals(Constantes.CMP)){
			return Constantes.OPERACAO_CMP;
		}
		if(operacao.equals(Constantes.AND)){
			return Constantes.OPERACAO_AND;
		}
		if(operacao.equals(Constantes.OR)){
			return Constantes.OPERACAO_OR;	
		}
		if(operacao.equals(Constantes.NOT)){
			return Constantes.OPERACAO_NOT;
		}
		if(operacao.equals(Constantes.CLR)){
			return Constantes.OPERACAO_CLR;
		}
		if(operacao.equals(Constantes.NEG)){
			return Constantes.OPERACAO_NEG;
		}
		if(operacao.equals(Constantes.SHL)){
			return Constantes.OPERACAO_SHL;
		}
		if(operacao.equals(Constantes.SHR)){
			return Constantes.OPERACAO_SHR;	
		}
		if(operacao.equals(Constantes.BRZ)){
			return Constantes.OPERACAO_BRZ;
		}
		if(operacao.equals(Constantes.BRN)){
			return Constantes.OPERACAO_BRN;
		}
		if(operacao.equals(Constantes.BRE)){
			return Constantes.OPERACAO_BRE;	
		}
		if(operacao.equals(Constantes.BRL)){
			return Constantes.OPERACAO_BRL;	
		}
		if(operacao.equals(Constantes.BRG)){
			return Constantes.OPERACAO_BRG;	
		}
		if(operacao.equals(Constantes.BRC)){
			return Constantes.OPERACAO_BRC;	
		}
		if(operacao.equals(Constantes.JMP)){
			return Constantes.OPERACAO_JMP;
		}
		if(operacao.equals(Constantes.XOR)){
			return Constantes.OPERACAO_XOR;	
		}
		if(operacao.equals(Constantes.TEST)){
			return Constantes.OPERACAO_TEST;
		}
		if(operacao.equals(Constantes.INC)){
			return Constantes.OPERACAO_INC;
		}
		if(operacao.equals(Constantes.DEC)){
			return Constantes.OPERACAO_DEC;
		}
		if(operacao.equals(Constantes.BRNZ)){
			return Constantes.OPERACAO_BRNZ;
		}
		if(operacao.equals(Constantes.BRNN)){
			return Constantes.OPERACAO_BRNN;
		}
		if(operacao.equals(Constantes.BRNC)){
			return Constantes.OPERACAO_BRNC;
		}
		if(operacao.equals(Constantes.BRO)){
			return Constantes.OPERACAO_BRO;
		}
		if(operacao.equals(Constantes.BRNO)){
			return Constantes.OPERACAO_BRNO;
		}
		if(operacao.equals(Constantes.HALT)){
			return Constantes.OPERACAO_HALT;
		}
		return "";
	}
	
	public boolean isHalt(String codigo){
		String operacao = codigo.substring(Constantes.BITS_INSTRUCAO.length(),
				Constantes.BITS_INSTRUCAO.length()+Constantes.ADD.length());
		if(operacao.equals(Constantes.HALT)){
			return true;
		}
		return false;
	}
	
	public String primeiraMicro(String codigo){		
		int tipo = getTipo(codigo);
		boolean testaHalt = isHalt(codigo);
		
		if(testaHalt){
			return Constantes.ENDERECO_HALT;
		}
		
		switch(tipo){
			case Constantes.CONSTANTE_REGISTRADOR:
				return Constantes.ATUALIZA_PC;
			case Constantes.CONSTANTE_ENDERECO:
				return rEndRecebeRi(codigo);
			case Constantes.REGISTRADOR_REGISTRADOR:
				return rxRecebeRi(codigo);
			case Constantes.REGISTRADOR_ENDERECO:
				return rEndRecebeRj(codigo);
			case Constantes.ENDERECO_REGISTRADOR:
				return rEndRecebeRi(codigo);
			case Constantes.ENDERECO_ENDERECO:
				return rEndRecebeRi(codigo);
			case Constantes.REGISTRADOR:
				return Constantes.ATUALIZA_PC;
			case Constantes.ENDERECO:
				return rEndRecebeRj(codigo);
		}
		return "";
	}
	
	public String caminho(String codigo){
		int tipo = getTipo(codigo);
		switch(tipo){
			case Constantes.CONSTANTE_ENDERECO:
				return Constantes.REND_RECEBE_PC_MAIS_1;
			case Constantes.REGISTRADOR_ENDERECO:
				return rxRecebeRi(codigo);
			case Constantes.ENDERECO_ENDERECO:
				return rEndRecebeRi2(codigo);
		}
		return "";
	}
	
	/*public String caminho2(String codigo){
		int tipo = getTipo(codigo);
		switch(tipo){
			case Constantes.CONSTANTE_ENDERECO:
				if(realizaOperacao(codigo).equals(Constantes.ENDERECO_MOV)){
					return ryRecebeRDado2(codigo);
				}
				return rxRecebeRDado2(codigo);
			case Constantes.ENDERECO:
				return rxRecebeRDado2(codigo);
		}
		return "";
	}
		
	public String caminho3(String codigo){
		int tipo = getTipo(codigo);
		switch(tipo){
			case Constantes.CONSTANTE_REGISTRADOR:
				if(realizaOperacao(codigo).equals(Constantes.ENDERECO_MOV)){
					return rjRecebeRDado(codigo);
				}
				return Constantes.RX_RECEBE_RDADO;
		}
		return "";
	}*/
	
	public String caminho4(String codigo){
		int tipo = getTipo(codigo);
		switch(tipo){
			case Constantes.CONSTANTE_REGISTRADOR:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_CMP)){
					return Constantes.RX_COMPARA_RY;
				}
				return rjRecebeOperacao(codigo);
		}
		return "";
	}
	
	public String rjRecebeOperacao(String codigo){
		int posicao = -1;
		
		posicao += indiceOperacao(codigo) + identificaRegistradorDestino(codigo);
		
		return registradorOperacao.get(posicao);
	}
	
	/*public String caminho5(String codigo){
		int tipo = getTipo(codigo);
		switch(tipo){
			case Constantes.CONSTANTE_ENDERECO:
				if(realizaOperacao(codigo).equals(Constantes.ENDERECO_CMP)){
					return rxComparaRy(codigo);
				}
				return ryRecebeOperacao(codigo);
			case Constantes.ENDERECO:
				return rxRecebeOperacao(codigo);
		}
		return "";
	}
	
	public String caminho6(String codigo){
		int tipo = getTipo(codigo);
		switch(tipo){
			case Constantes.REGISTRADOR_ENDERECO:
				if(realizaOperacao(codigo).equals(Constantes.ENDERECO_CMP)){
					return rxComparaRi(codigo);
				}
				return ryRecebeOperacao(codigo);
		}
		return "";
	}*/
	
	public int getTipo(String codigo){
		String primeiroArgumento,segundoArgumento;
		int tipo1,tipo2;
		
		primeiroArgumento = codigo.substring(10,14);
		segundoArgumento = codigo.substring(14,18);
		
		tipo1 = getTipoFonte(primeiroArgumento);
		tipo2 = getTipoDestino(segundoArgumento);
		
		switch(tipo1){
			case Constantes.TIPO_CONSTANTE:
				if(tipo2 == Constantes.TIPO_REGISTRADOR){
					return Constantes.CONSTANTE_REGISTRADOR;
				}
				return Constantes.CONSTANTE_ENDERECO;
				
			case Constantes.TIPO_REGISTRADOR:
				if(tipo2 == Constantes.TIPO_REGISTRADOR){
					return Constantes.REGISTRADOR_REGISTRADOR;
				}
				return Constantes.REGISTRADOR_ENDERECO;
				
			case Constantes.TIPO_ENDERECO:
				if(tipo2 == Constantes.TIPO_REGISTRADOR){
					return Constantes.ENDERECO_REGISTRADOR;
				}
				return Constantes.ENDERECO_ENDERECO;
		}
		
		return Constantes.ERRO;
	}
	
	public int getTipoFonte(String argumento){
		if(argumento.equals(Constantes.CONSTANTE_FONTE)){
			return Constantes.TIPO_CONSTANTE;
		}
		if(argumento.equals(Constantes.R0_FONTE)||
				argumento.equals(Constantes.R1_FONTE)||
				argumento.equals(Constantes.R2_FONTE)||
				argumento.equals(Constantes.R3_FONTE)||
				argumento.equals(Constantes.R4_FONTE))
		{
			return Constantes.TIPO_REGISTRADOR;
		}
		if(argumento.equals(Constantes.PR0_FONTE)||
				argumento.equals(Constantes.PR1_FONTE)||
				argumento.equals(Constantes.PR2_FONTE)||
				argumento.equals(Constantes.PR3_FONTE)||
				argumento.equals(Constantes.PR4_FONTE))
		{
			return Constantes.TIPO_ENDERECO;
		}
		
		return Constantes.ERRO;
	}
	
	
	public int getTipoDestino(String argumento){

		if(argumento.equals(Constantes.R0_DESTINO)||
				argumento.equals(Constantes.R1_DESTINO)||
				argumento.equals(Constantes.R2_DESTINO)||
				argumento.equals(Constantes.R3_DESTINO)||
				argumento.equals(Constantes.R4_DESTINO))
		{
			return Constantes.TIPO_REGISTRADOR;
		}
		if(argumento.equals(Constantes.PR0_DESTINO)||
				argumento.equals(Constantes.PR1_DESTINO)||
				argumento.equals(Constantes.PR2_DESTINO)||
				argumento.equals(Constantes.PR3_DESTINO)||
				argumento.equals(Constantes.PR4_DESTINO))
		{
			return Constantes.TIPO_ENDERECO;
		}
		
		return Constantes.ERRO;
	}
}
