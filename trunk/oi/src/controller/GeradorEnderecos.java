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
		return endereco;
	}
	
	public String rxRecebeRi(String codigo){
		int registrador;
		
		registrador = identificaRegistradorFonte(codigo.substring(8,12));
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
		System.out.println("Passei por aqui");
		registrador = identificaRegistradorDestino(codigo.substring(12,16));
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
}
