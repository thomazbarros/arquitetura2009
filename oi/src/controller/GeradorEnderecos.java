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
		registradorOperacao.add(Constantes.R0_RECEBE_NEGACAO);
		registradorOperacao.add(Constantes.R1_RECEBE_NEGACAO);
		registradorOperacao.add(Constantes.R2_RECEBE_NEGACAO);
		registradorOperacao.add(Constantes.R3_RECEBE_NEGACAO);
		registradorOperacao.add(Constantes.R4_RECEBE_NEGACAO);
		registradorOperacao.add(Constantes.R0_LIMPA);
		registradorOperacao.add(Constantes.R1_LIMPA);
		registradorOperacao.add(Constantes.R2_LIMPA);
		registradorOperacao.add(Constantes.R3_LIMPA);
		registradorOperacao.add(Constantes.R4_LIMPA);
		registradorOperacao.add(Constantes.R0_RECEBE_OU_EXCLUSIVO);
		registradorOperacao.add(Constantes.R1_RECEBE_OU_EXCLUSIVO);
		registradorOperacao.add(Constantes.R2_RECEBE_OU_EXCLUSIVO);
		registradorOperacao.add(Constantes.R3_RECEBE_OU_EXCLUSIVO);
		registradorOperacao.add(Constantes.R4_RECEBE_OU_EXCLUSIVO);
		registradorOperacao.add(Constantes.R0_RECEBE_INCREMENTA);
		registradorOperacao.add(Constantes.R1_RECEBE_INCREMENTA);
		registradorOperacao.add(Constantes.R2_RECEBE_INCREMENTA);
		registradorOperacao.add(Constantes.R3_RECEBE_INCREMENTA);
		registradorOperacao.add(Constantes.R4_RECEBE_INCREMENTA);
		registradorOperacao.add(Constantes.R0_RECEBE_DECREMENTA);
		registradorOperacao.add(Constantes.R1_RECEBE_DECREMENTA);
		registradorOperacao.add(Constantes.R2_RECEBE_DECREMENTA);
		registradorOperacao.add(Constantes.R3_RECEBE_DECREMENTA);
		registradorOperacao.add(Constantes.R4_RECEBE_DECREMENTA);
	}
	
	public String proximoEndereco(String endereco,String codigo){
		//System.out.println("PROXIMO ENDERECO :" + endereco);
		if(endereco.equals(Constantes.RX_RECEBE_RI)){
			return rxRecebeRi(codigo);
		}
		if(endereco.equals(Constantes.RX_RECEBE_RI_2)){
			return rxRecebeRi2(codigo);
		}
		if(endereco.equals(Constantes.RY_RECEBE_RJ)){
			return ryRecebeRj(codigo);
		}
		if(endereco.equals(Constantes.RY_RECEBE_RI)){
			return ryRecebeRi(codigo);
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
		//if(endereco.equals(Constantes.REALIZA_OPERACAO)){
		//	return realizaOperacao(codigo);
		//}
		if(endereco.equals(Constantes.RJ_RECEBE_RDADO)){
			return rjRecebeRDado(codigo);
		}
		if(endereco.equals(Constantes.RJ_RECEBE_RI)){
			return rjRecebeRi(codigo);
		}
		if(endereco.equals(Constantes.RJ_RECEBE_OPERACAO)){
			return rjRecebeOperacao(codigo);
		}
		if(endereco.equals(Constantes.RY_RECEBE_OPERACAO)){
			return ryRecebeOperacao(codigo);
		}
		if(endereco.equals(Constantes.RI_RECEBE_OPERACAO)){
			return riRecebeOperacao(codigo);
		}
		if(endereco.equals(Constantes.PC_RECEBE_OPERACAO)){
			return pcRecebeOperacao(codigo);
		}
		if(endereco.equals(Constantes.PRIMEIRA_MICRO_INSTRUCAO)){
			//System.out.println("ENTREI NA PRIMEIRA MICRO INSTRUCAO");
			return primeiraMicro(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO)){
			return caminho(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO_2)){
			return caminho2(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO_3)){
			return caminho3(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO_4)){
			return caminho4(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO_5)){
			return caminho5(codigo);
		}
		if(endereco.equals(Constantes.CAMINHO_6)){
			return caminho6(codigo);
		}
		return endereco;
	}
	
	public String rxRecebeRi(String codigo){
		int registrador;
		
		registrador = identificaRegistradorFonte(codigo.substring(8,12));
				
		//System.out.println("REGISTRADOR :" + registrador);
		
		switch(registrador){
			case Constantes.R0:
				
				//System.out.println("R0");
				
				return Constantes.RX_RECEBE_R0;
			case Constantes.R1:
				
				//System.out.println("R1");
				
				return Constantes.RX_RECEBE_R1;
			case Constantes.R2:
				
				//System.out.println("R2");
				
				return Constantes.RX_RECEBE_R2;
			case Constantes.R3:
				
				//System.out.println("R3");
				
				return Constantes.RX_RECEBE_R3;
			case Constantes.R4:
				
				//System.out.println("R4");
				
				return Constantes.RX_RECEBE_R4;
		}
		return "";
	}
	
	public String rjRecebeRi(String codigo){
		int fonte,destino;
		
		fonte = identificaRegistradorFonte(codigo.substring(8,12));
		destino = identificaRegistradorDestino(codigo.substring(12,16));
		
		switch(destino){
			case Constantes.R0:
				switch(fonte){
					case Constantes.R1:
						return Constantes.R0_RECEBE_R1;
					case Constantes.R2:
						return Constantes.R0_RECEBE_R2;
					case Constantes.R3:
						return Constantes.R0_RECEBE_R3;
					case Constantes.R4:
						return Constantes.R0_RECEBE_R4;
					default:
						return "";
				}
			case Constantes.R1:
				switch(fonte){
					case Constantes.R0:
						return Constantes.R1_RECEBE_R0;
					case Constantes.R2:
						return Constantes.R1_RECEBE_R2;
					case Constantes.R3:
						return Constantes.R1_RECEBE_R3;
					case Constantes.R4:
						return Constantes.R1_RECEBE_R4;
					default:
						return "";
				}
			case Constantes.R2:
				switch(fonte){	
					case Constantes.R0:
						return Constantes.R2_RECEBE_R0;
					case Constantes.R1:
						return Constantes.R2_RECEBE_R1;
					case Constantes.R3:
						return Constantes.R2_RECEBE_R3;
					case Constantes.R4:
						return Constantes.R2_RECEBE_R4;
					default:
						return "";
				}
			case Constantes.R3:
				switch(fonte){
					case Constantes.R0:
						return Constantes.R3_RECEBE_R0;
					case Constantes.R1:
						return Constantes.R3_RECEBE_R1;
					case Constantes.R2:
						return Constantes.R3_RECEBE_R2;
					case Constantes.R4:
						return Constantes.R3_RECEBE_R4;
					default:
						return "";
				}
			case Constantes.R4:
				switch(fonte){
					case Constantes.R0:
						return Constantes.R4_RECEBE_R0;
					case Constantes.R1:
						return Constantes.R4_RECEBE_R1;
					case Constantes.R2:
						return Constantes.R4_RECEBE_R2;
					case Constantes.R3:
						return Constantes.R4_RECEBE_R3;
					default:
						return "";
				}
		}
		return "";
	}
	
	public String rxRecebeRi2(String codigo){
		int registrador;
		
		registrador = identificaRegistradorFonte(codigo.substring(8,12));
		switch(registrador){
			case Constantes.R0:
				return Constantes.RX_RECEBE_R0_2;
			case Constantes.R1:
				return Constantes.RX_RECEBE_R1_2;
			case Constantes.R2:
				return Constantes.RX_RECEBE_R2_2;
			case Constantes.R3:
				return Constantes.RX_RECEBE_R3_2;
			case Constantes.R4:
				return Constantes.RX_RECEBE_R4_2;
		}
		return "";
	}
	
	public String ryRecebeRi(String codigo){
		int registrador;
		
		registrador = identificaRegistradorFonte(codigo.substring(8,12));
		switch(registrador){
			case Constantes.R0:
				return Constantes.RY_RECEBE_R0_2;
			case Constantes.R1:
				return Constantes.RY_RECEBE_R1_2;
			case Constantes.R2:
				return Constantes.RY_RECEBE_R2_2;
			case Constantes.R3:
				return Constantes.RY_RECEBE_R3_2;
			case Constantes.R4:
				return Constantes.RY_RECEBE_R4_2;
		}
		return "";
	}
	
	public String ryRecebeRj(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(12,16));
		//System.out.println("DESTINO :"+registrador);
		switch(registrador){
			case Constantes.R0:
				//System.out.println("A CONSTANTE ESTA ERRADA!!!!!");
				return Constantes.RY_RECEBE_R0;
			case Constantes.R1:
				//System.out.println("A CONSTANTE ESTA CERTA!!!!!!!");
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
	
	public String rjRecebeRDado(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(12,16));
		switch(registrador){
			case Constantes.R0:
				return Constantes.R0_RECEBE_RDADO;
			case Constantes.R1:
				return Constantes.R1_RECEBE_RDADO;
			case Constantes.R2:
				return Constantes.R2_RECEBE_RDADO;
			case Constantes.R3:
				return Constantes.R3_RECEBE_RDADO;
			case Constantes.R4:
				return Constantes.R4_RECEBE_RDADO;
		}
		return "";
	}
	
	public String rEndRecebeRi(String codigo){
		int registrador;
		registrador = identificaRegistradorFonte(codigo.substring(8,12));
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
	
	public String rEndRecebeRj(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(12,16));
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
		registrador = identificaRegistradorFonte(codigo.substring(8,12));
		switch(registrador){
			case Constantes.R0:
				return Constantes.REND_RECEBE_R0_4;
			case Constantes.R1:
				return Constantes.REND_RECEBE_R1_4;
			case Constantes.R2:
				return Constantes.REND_RECEBE_R2_4;
			case Constantes.R3:
				return Constantes.REND_RECEBE_R3_4;
			case Constantes.R4:
				return Constantes.REND_RECEBE_R4_4;
		}
		return "";
	}
	
	public String rEndRecebeRj2(String codigo){
		int registrador;
		registrador = identificaRegistradorDestino(codigo.substring(12,16));
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
		registrador = identificaRegistradorFonte(codigo.substring(8,12));
		switch(registrador){
			case Constantes.R0:
				return Constantes.REND_RECEBE_R0_5;
			case Constantes.R1:
				return Constantes.REND_RECEBE_R1_5;
			case Constantes.R2:
				return Constantes.REND_RECEBE_R2_5;
			case Constantes.R3:
				return Constantes.REND_RECEBE_R3_5;
			case Constantes.R4:
				return Constantes.REND_RECEBE_R4_5;
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
		
		if(codigo.equals(Constantes.R0_FONTE) || codigo.equals(Constantes.PR0_FONTE)){
			return Constantes.R0;
		}
		if(codigo.equals(Constantes.R1_FONTE) || codigo.equals(Constantes.PR1_FONTE)){
			return Constantes.R1;
		}
		if(codigo.equals(Constantes.R2_FONTE) || codigo.equals(Constantes.PR2_FONTE)){
			return Constantes.R2;
		}
		if(codigo.equals(Constantes.R3_FONTE) || codigo.equals(Constantes.PR3_FONTE)){
			return Constantes.R3;
		}
		if(codigo.equals(Constantes.R4_FONTE) || codigo.equals(Constantes.PR4_FONTE)){
			return Constantes.R4;
		}
		
		//System.out.println("Erro");
		
		return Constantes.ERRO;
	}
	
	public int identificaRegistradorDestino(String codigo){
		//System.out.println("CODIGO DESTINO :"+codigo);
		if(codigo.equals(Constantes.R0_DESTINO) || codigo.equals(Constantes.PR0_DESTINO)){
			return Constantes.R0;
		}
		if(codigo.equals(Constantes.R1_DESTINO) || codigo.equals(Constantes.PR1_DESTINO)){
			return Constantes.R1;
		}
		if(codigo.equals(Constantes.R2_DESTINO) || codigo.equals(Constantes.PR2_DESTINO)){
			return Constantes.R2;
		}
		if(codigo.equals(Constantes.R3_DESTINO) || codigo.equals(Constantes.PR3_DESTINO)){
			return Constantes.R3;
		}
		if(codigo.equals(Constantes.R4_DESTINO) || codigo.equals(Constantes.PR4_DESTINO)){
			return Constantes.R4;
		}
		
		//System.out.println("Erro1");
		
		return Constantes.ERRO;
	}
	
	public int indiceOperacao(String codigo){
		String operacao = codigo.substring(0,Constantes.ADD.length());
		//System.out.println("OPERACAO :"+operacao);
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
		if(operacao.equals(Constantes.NEG)){
			return Constantes.INDICE_NEG;
		}
		if(operacao.equals(Constantes.CLR)){
			return Constantes.INDICE_CLR;
		}
		if(operacao.equals(Constantes.XOR)){
			return Constantes.INDICE_XOR;
		}
		if(operacao.equals(Constantes.INC)){
			return Constantes.INDICE_INC;
		}
		if(operacao.equals(Constantes.DEC)){
			return Constantes.INDICE_DEC;
		}
		
		//System.out.println("Erro2");
		
		return Constantes.ERRO;
	}
	
	public String realizaOperacao(String codigo){
		String operacao = codigo.substring(0,Constantes.ADD.length());
		
		if(operacao.equals(Constantes.ADD)){
			//System.out.println("EH UM ADD!!!!!");
			return Constantes.OPERACAO_ADD;
		}
		if(operacao.equals(Constantes.SUB)){
			//System.out.println("SUB");
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
		String operacao = codigo.substring(0,Constantes.ADD.length());
		if(operacao.equals(Constantes.HALT)){
			return true;
		}
		return false;
	}
	
	public String primeiraMicro(String codigo){
		
		if(codigo.substring(0,2).equals(Constantes.BITS_LABEL)){
			return Constantes.ATUALIZA_PC_4;
		}
		
		//System.out.println("PRIMEIRA MICRO");
		int tipo = getTipo(codigo);
		//System.out.println("GETEI O TIPO");
		boolean testaHalt = isHalt(codigo);
		//System.out.println("CODIGO DA PRIMEIRA MICRO:"+codigo);
		
		if(testaHalt){
			//System.out.println("ENTREI NO HALT!!!!");
			//return Constantes.ENDERECO_HALT;
			return Constantes.INSTRUCAO_HALT;
		}
		
		//System.out.println("TESTEI O HALT");
		switch(tipo){
			case Constantes.CONSTANTE_REGISTRADOR:
				//System.out.println("ELE INTERPRETOU CERTO");
				return Constantes.ATUALIZA_PC;
			case Constantes.CONSTANTE_ENDERECO:
				
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_MOV)){
					return Constantes.ATUALIZA_PC_3;
				}
				
				return rEndRecebeRj(codigo);
			case Constantes.REGISTRADOR_REGISTRADOR:
				//System.out.println("INSTRUCAO");
				
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_MOV)){
					return rjRecebeRi(codigo);
				}
				
				return rxRecebeRi(codigo);
			case Constantes.REGISTRADOR_ENDERECO:
				
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_MOV)){
					return ryRecebeRi(codigo);
				}
				
				return rEndRecebeRj(codigo);
			case Constantes.ENDERECO_REGISTRADOR:
				return rEndRecebeRi(codigo);
			case Constantes.ENDERECO_ENDERECO:
				
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_MOV)){
					return rEndRecebeRi2(codigo);
				}
				
				return rEndRecebeRj(codigo);
			case Constantes.REGISTRADOR:
				//System.out.println("TESTEI MICROINSTRUCAO");
				return rxRecebeRi2(codigo);
			case Constantes.ENDERECO:
				return rEndRecebeRi2(codigo);
			case Constantes.LABEL:
				return Constantes.ATUALIZA_PC;
		}
		return "";
	}
	
	public String caminho(String codigo){
		int tipo = getTipo(codigo);
		//System.out.println("CAMINHO:");
		
		switch(tipo){
			case Constantes.CONSTANTE_ENDERECO:
				//System.out.println("ATUALIZAPC3");
				
				return Constantes.ATUALIZA_PC_3;
			case Constantes.REGISTRADOR_ENDERECO:
				//System.out.println("RXRECEBERI");
				
				return rxRecebeRi(codigo);
			case Constantes.ENDERECO_ENDERECO:
				//System.out.println("RENDRECEBERI2");
				
				return rEndRecebeRi2(codigo);
		}
		return "";
	}
	
	public String caminho2(String codigo){
		int tipo = getTipo(codigo);
		//System.out.println("CAMINHO2");
		
		switch(tipo){
			case Constantes.CONSTANTE_ENDERECO:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_MOV)){
					//System.out.println("RYRECEBERDADO2");
					
					return Constantes.RY_RECEBE_RDADO_2;
				}
				
				//System.out.println("RXRECEBERDADO2");
				
				return Constantes.RX_RECEBE_RDADO_2;
			case Constantes.ENDERECO_ENDERECO:
				
				//System.out.println("RXRECEBERDADO2");
				
				return Constantes.RX_RECEBE_RDADO_2;
			case Constantes.ENDERECO:
				//System.out.println("RXRECEBERDADO2");
				
				return Constantes.RX_RECEBE_RDADO_2;
		}
		return "";
	}
		
	public String caminho3(String codigo){
		int tipo = getTipo(codigo);
		
		//System.out.println("CAMINHO3");
		
		switch(tipo){
			case Constantes.CONSTANTE_REGISTRADOR:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_MOV)){
					
					//System.out.println("RJRECEBERDADO");
					
					return rjRecebeRDado(codigo);
				}
				
				//System.out.println("RXRECEBERDADO");
				
				return Constantes.RX_RECEBE_RDADO;
			case Constantes.ENDERECO_REGISTRADOR:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_MOV)){
					
					//System.out.println("RJRECEBERDADO");
					
					return rjRecebeRDado(codigo);
				}
				
				//System.out.println("RXRECEBERDADO");
				
				return Constantes.RX_RECEBE_RDADO;
			case Constantes.LABEL:
				
				//System.out.println("PCRECEBEOPERACAO");
				
				return pcRecebeOperacao(codigo);
		}
		return "";
	}
	
	public String caminho4(String codigo){
		int tipo = getTipo(codigo);
		//System.out.println("CAMINHO4");
		
		switch(tipo){
			case Constantes.CONSTANTE_REGISTRADOR:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_CMP)){
					
					//System.out.println("RXCOMPARARY");
					
					return Constantes.RX_COMPARA_RY;
				}
				
				//System.out.println("RJRECEBEOPERACAO");
				
				return rjRecebeOperacao(codigo);
			case Constantes.REGISTRADOR_REGISTRADOR:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_CMP)){
					
					//System.out.println("RXCOMPARARY");
					
					return Constantes.RX_COMPARA_RY;
				}
				
				//System.out.println("RJRECEBEOPERACAO");
				
				return rjRecebeOperacao(codigo);
			case Constantes.ENDERECO_REGISTRADOR:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_CMP)){
					
					//System.out.println("RXCOMPARARY");
					
					return Constantes.RX_COMPARA_RY;
				}
				
				//System.out.println("RJRECEBEOPERACAO");
				
				return rjRecebeOperacao(codigo);
		}
		
		return "";
	}
	
	public String rjRecebeOperacao(String codigo){
		int posicao = -1;
		
		posicao += indiceOperacao(codigo) + identificaRegistradorDestino(codigo.substring(12,16));
		
		//System.out.println(posicao);
		
		return registradorOperacao.get(posicao);
	}
	
	public String riRecebeOperacao(String codigo){
		int posicao = -1;
		
		posicao += indiceOperacao(codigo) + identificaRegistradorFonte(codigo.substring(8,12));
		
		return registradorOperacao.get(posicao);
	}
	
	public String rxRecebeOperacao(String codigo){
		String operacao = realizaOperacao(codigo);
		if(operacao.equals(Constantes.OPERACAO_NOT)){
			return Constantes.RX_RECEBE_NOT;
		}
		if(operacao.equals(Constantes.OPERACAO_SHL)){
			return Constantes.RX_RECEBE_DESLOCAMENTO_ESQUERDA;
		}
		if(operacao.equals(Constantes.OPERACAO_SHR)){
			return Constantes.RX_RECEBE_DESLOCAMENTO_DIREITA;
		}
		if(operacao.equals(Constantes.OPERACAO_NEG)){
			return Constantes.RX_RECEBE_NEGACAO;
		}
		if(operacao.equals(Constantes.OPERACAO_CLR)){
			return Constantes.RX_LIMPA;
		}
		if(operacao.equals(Constantes.OPERACAO_INC)){
			return Constantes.RX_RECEBE_INCREMENTA;
		}
		if(operacao.equals(Constantes.OPERACAO_DEC)){
			return Constantes.RX_RECEBE_DECREMENTA;
		}
		
		return "";
	}
	
	public String pcRecebeOperacao(String codigo){
		String operacao = realizaOperacao(codigo);
		
		if(operacao.equals(Constantes.OPERACAO_BRZ)){
			return Constantes.PC_RECEBE_DESVIO_SE_ZERO;
		}
		if(operacao.equals(Constantes.OPERACAO_BRN)){
			return Constantes.PC_RECEBE_DESVIO_SE_NEGATIVO;
		}
		if(operacao.equals(Constantes.OPERACAO_BRE)){
			return Constantes.PC_RECEBE_DESVIO_SE_ZERO;
		}
		if(operacao.equals(Constantes.OPERACAO_BRL)){
			return Constantes.PC_RECEBE_DESVIO_SE_MENOR;
		}
		if(operacao.equals(Constantes.OPERACAO_BRG)){
			return Constantes.PC_RECEBE_DESVIO_SE_MAIOR;
		}
		if(operacao.equals(Constantes.OPERACAO_BRC)){
			return Constantes.PC_RECEBE_DESVIO_SE_CARRY;
		}
		if(operacao.equals(Constantes.OPERACAO_BRNZ)){
			return Constantes.PC_RECEBE_DESVIO_SE_NAO_ZERO;
		}
		if(operacao.equals(Constantes.OPERACAO_BRNN)){
			return Constantes.PC_RECEBE_DESVIO_SE_NAO_NEGATIVO;
		}
		if(operacao.equals(Constantes.OPERACAO_BRNC)){
			return Constantes.PC_RECEBE_DESVIO_SE_NAO_CARRY;
		}
		if(operacao.equals(Constantes.OPERACAO_BRO)){
			return Constantes.PC_RECEBE_DESVIO_SE_OVERFLOW;
		}
		if(operacao.equals(Constantes.OPERACAO_BRNO)){
			return Constantes.PC_RECEBE_DESVIO_SE_NAO_OVERFLOW;
		}
		if(operacao.equals(Constantes.OPERACAO_JMP)){
			return Constantes.PC_RECEBE_JUMP;
		}
		
		return "";
	}
	
	public String ryRecebeOperacao(String codigo){
		String operacao = realizaOperacao(codigo);
		if(operacao.equals(Constantes.OPERACAO_ADD)){
			return Constantes.RY_RECEBE_SOMA;
		}
		if(operacao.equals(Constantes.OPERACAO_SUB)){
			return Constantes.RY_RECEBE_DIFERENCA;
		}
		if(operacao.equals(Constantes.OPERACAO_AND)){
			return Constantes.RY_RECEBE_E;
		}
		if(operacao.equals(Constantes.OPERACAO_OR)){
			return Constantes.RY_RECEBE_OU;
		}
		if(operacao.equals(Constantes.OPERACAO_XOR)){
			return Constantes.RY_RECEBE_OU_EXCLUSIVO;
		}
		
		return "";
	}
	
	public String caminho5(String codigo){
		int tipo = getTipo(codigo);
		
		//System.out.println("CAMINHO5");
		
		switch(tipo){
			case Constantes.CONSTANTE_ENDERECO:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_CMP)){
					
					//System.out.println("RXCOMPARARY");
					
					return Constantes.RX_COMPARA_RY;
				}
				
				//System.out.println("RYRECEBEOPERACAO");
				
				return ryRecebeOperacao(codigo);
			case Constantes.ENDERECO_ENDERECO:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_CMP)){
					
					//System.out.println("RXCOMPARARY");
					
					return Constantes.RX_COMPARA_RY;
				}
				
				//System.out.println("RYRECEBEOPERACAO");
				
				return ryRecebeOperacao(codigo);
			case Constantes.ENDERECO:
				
				//System.out.println("RXRECEBEOPERACAO");
				
				return rxRecebeOperacao(codigo);
		}
		return "";
	}
	
	public String caminho6(String codigo){
		int tipo = getTipo(codigo);
		
		//System.out.println("CAMINHO6");
		
		switch(tipo){
			case Constantes.REGISTRADOR_REGISTRADOR:
				
				//System.out.println("RYRECEBERJ");
				
				return ryRecebeRj(codigo);
			case Constantes.REGISTRADOR_ENDERECO:
				if(realizaOperacao(codigo).equals(Constantes.OPERACAO_CMP)){
					
					//System.out.println("RXCOMPARARY");
					
					return Constantes.RX_COMPARA_RY;
				}
				
				//System.out.println("RYRECEBEOPERACAO");
				
				return ryRecebeOperacao(codigo);
		}
		return "";
	}
	
	public int getTipo(String codigo){
		String primeiroArgumento,segundoArgumento;
		int tipo1,tipo2;
		
		primeiroArgumento = codigo.substring(8,12);
		segundoArgumento = codigo.substring(12,16);
		
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
				if(tipo2 == Constantes.TIPO_NENHUM){
					return Constantes.REGISTRADOR;
				}
				return Constantes.REGISTRADOR_ENDERECO;
				
			case Constantes.TIPO_ENDERECO:
				if(tipo2 == Constantes.TIPO_REGISTRADOR){
					return Constantes.ENDERECO_REGISTRADOR;
				}
				if(tipo2 == Constantes.TIPO_NENHUM){
					return Constantes.ENDERECO;
				}
				return Constantes.ENDERECO_ENDERECO;
			case Constantes.TIPO_LABEL:
				return Constantes.LABEL;
		}
		
		return Constantes.ERRO;
	}
	
	public int getTipoFonte(String argumento){
		if(argumento.equals(Constantes.CONSTANTE_FONTE)){
			return Constantes.TIPO_CONSTANTE;
		}
		if(argumento.equals(Constantes.LABEL_FONTE)){
			return Constantes.TIPO_LABEL;
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
		if(argumento.equals(Constantes.NENHUM_DESTINO)){
			return Constantes.TIPO_NENHUM;
		}
		
		return Constantes.ERRO;
	}
}
