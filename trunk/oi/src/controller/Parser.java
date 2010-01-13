package controller;
 
import model.Constantes;

public class Parser {

	public String decifraInstrucao(String instrucao){
		String [] separaEspaco;
		
		separaEspaco = instrucao.split(" ");
		
		if(separaEspaco.length > 0){
			if(separaEspaco.length == 1){
				if(isHalt(instrucao)){
					return separaEspaco[0].toLowerCase();
				}else{
					return "";
				}
			}
			
			if(separaEspaco.length == 3){
				if(isHalt(instrucao)){
					return separaEspaco[2].toLowerCase();
				}
			}
			
			if(separaEspaco[1].equals(":")){
				if(isValido(separaEspaco[2].toLowerCase())){
					return separaEspaco[2].toLowerCase();
				}else{
					return "";
				}
			}else{
				if(isValido(separaEspaco[0].toLowerCase())){
					return separaEspaco[0].toLowerCase();
				}
			}
		}
				
		return "";
	}
	
	public int[] decifraArgumentos(String instrucao){
		int [] tiposArgumentos= new int[2];
		int tipo1 ,tipo2;
		String [] separaEspaco;
		String primeiroArgumento;
		
		instrucao = instrucao.replaceAll("<", "");
		instrucao = instrucao.replaceAll(">", ""); 
		
		separaEspaco = instrucao.split(" ");
		
		if(separaEspaco.length > 2){
			if(separaEspaco[1].equals(":")){
				if(separaEspaco.length > 4){
					primeiroArgumento = separaEspaco[3].substring(0, separaEspaco[3].length()-1);
					tipo1 = getTipo(primeiroArgumento.toLowerCase());
					tipo2 = getTipo(separaEspaco[4].toLowerCase());
					tiposArgumentos[0] = tipo1;
					tiposArgumentos[1] = tipo2;
					
					return tiposArgumentos;
				}else{
					tiposArgumentos[0] = Constantes.ERRO;
					tiposArgumentos[1] = Constantes.ERRO;
					
					return tiposArgumentos;
				}
			}else{
				primeiroArgumento = separaEspaco[1].substring(0, separaEspaco[1].length()-1);
				tipo1 = getTipo(primeiroArgumento.toLowerCase());
				tipo2 = getTipo(separaEspaco[2].toLowerCase());
				tiposArgumentos[0] = tipo1;
				tiposArgumentos[1] = tipo2;
			
				return tiposArgumentos;
			}
		}else{
			tiposArgumentos[0] = Constantes.ERRO;
			tiposArgumentos[1] = Constantes.ERRO;
			
			return tiposArgumentos;
		}
	}
	
	public int decifraArgumento(String instrucao){
		String [] separaEspaco;
		
		instrucao = instrucao.replaceAll("<", "");
		instrucao = instrucao.replaceAll(">", "");
		
		separaEspaco = instrucao.split(" ");
		
		if(separaEspaco.length >= 2){
			if(separaEspaco[1].equals(":")){
				if(separaEspaco.length == 4){
					return getTipo(separaEspaco[3].toLowerCase());
				}else{
					return Constantes.ERRO;
				}
			}else{
				if(separaEspaco.length == 2){
					return getTipo(separaEspaco[1].toLowerCase());
				}else{
					return Constantes.ERRO;
				}
			}	
		}else{
			return Constantes.ERRO;
		}
	}
	
	public String decifraLabel(String instrucao){
		String [] separaEspaco;
		instrucao = instrucao.replaceAll("<", "");
		instrucao = instrucao.replaceAll(">", "");		
		
		separaEspaco = instrucao.split(" ");
		
		if(separaEspaco.length >= 2){
			if(separaEspaco[1].equals(":")){
				return separaEspaco[0];
			}else{
				if(separaEspaco.length == 2){
					return separaEspaco[1];
				}else{
					return "";
				}
			}	
		}else{
			return "";
		}
	}
	
	public String decifraLabelArgumento(String instrucao){
		String [] separaEspaco;
		instrucao = instrucao.replaceAll("<", "");
		instrucao = instrucao.replaceAll(">", "");
		
		separaEspaco = instrucao.split(" ");
		
		if(separaEspaco.length == 2){
			return separaEspaco[1];
		}
		if(separaEspaco.length == 4){
			if(separaEspaco[1].equals(":")){
				return separaEspaco[3];
			}
		}
		
		return "";
	}
	
	public boolean isValido(String palavra){
		if(palavra.length() > 1){
			if(palavra.equals("add") ||
				palavra.equals("sub") ||
				palavra.equals("mov") ||
				palavra.equals("cmp") ||
				palavra.equals("and") ||
				palavra.equals("or") ||
				palavra.equals("not") ||
				palavra.equals("clr") ||
				palavra.equals("neg") ||
				palavra.equals("shl") ||
				palavra.equals("shr") ||
				palavra.equals("brz") ||
				palavra.equals("brn") ||
				palavra.equals("bre") ||
				palavra.equals("brl") ||
				palavra.equals("brg") ||
				palavra.equals("brc") ||
				palavra.equals("jmp") ||
				palavra.equals("xor") ||
				palavra.equals("test")||
				palavra.equals("inc") ||
				palavra.equals("dec") ||
				palavra.equals("brnz") ||
				palavra.equals("brnn") ||
				palavra.equals("brnc") ||
				palavra.equals("bro") ||
				palavra.equals("brno"))
			{
				return true;
			}
		}
		
		return false;
		
	}
	
	public int getTipo(String tipo){
		String argumento;
		
		argumento = tipo.replaceAll("<", "");
		argumento = argumento.replaceAll(">", "");
		
		try{
			Integer.parseInt(argumento);
			return Constantes.CONSTANTE;
		}catch(Exception e){
			try{
				String aux;
			
				if(argumento.endsWith("H") || argumento.endsWith("h")){
					aux = argumento.substring(0, argumento.length()-1);
					Integer.parseInt(aux,16);
					return Constantes.CONSTANTE;
				}
			}catch (Exception e2) {}
		}
		
		if(argumento.equals("r0")){
			return Constantes.R0;
		}
		if(argumento.equals("r1")){
			return Constantes.R1;
		}
		if(argumento.equals("r2")){
			return Constantes.R2;
		}
		if(argumento.equals("r3")){
			return Constantes.R3;
		}
		if(argumento.equals("r4")){
			return Constantes.R4;
		}
		if(argumento.equals("(r0)")){
			return Constantes.PR0;
		}
		if(argumento.equals("(r1)")){
			return Constantes.PR1;
		}
		if(argumento.equals("(r2)")){
			return Constantes.PR2;
		}
		if(argumento.equals("(r3)")){
			return Constantes.PR3;
		}
		if(argumento.equals("(r4)")){
			return Constantes.PR4;
		}
		return Constantes.ERRO;
	}
	
	public int getConstante(String instrucao){
		int tipo;
		String [] separaEspaco;
		String primeiroArgumento;
		String aux;
		
		instrucao = instrucao.replaceAll("<", "");
		instrucao = instrucao.replaceAll(">", "");
		
		separaEspaco = instrucao.split(" ");
		
		if(separaEspaco.length > 2){
			if(separaEspaco[1].equals(":")){
				if(separaEspaco.length > 4){
					primeiroArgumento = separaEspaco[3].substring(0, separaEspaco[3].length()-1);
					tipo = getTipo(primeiroArgumento.toLowerCase());
					if(tipo == Constantes.CONSTANTE){
						if(primeiroArgumento.endsWith("H") || primeiroArgumento.endsWith("h")){
							aux = primeiroArgumento.substring(0, primeiroArgumento.length()-1);
							return Integer.parseInt(aux,16);
						}
						return Integer.parseInt(primeiroArgumento);
					}
				}else{
					return Constantes.ERRO;
				}
			}else{
				primeiroArgumento = separaEspaco[1].substring(0, separaEspaco[1].length()-1);
				tipo = getTipo(primeiroArgumento.toLowerCase());
				if(tipo == Constantes.CONSTANTE){
					if(primeiroArgumento.endsWith("H") || primeiroArgumento.endsWith("h")){
						aux = primeiroArgumento.substring(0, primeiroArgumento.length()-1);
						return Integer.parseInt(aux,16);
					}
					return Integer.parseInt(primeiroArgumento);
				}
			}
		}
		
		return Constantes.ERRO;
	}
	
	public boolean hasLabel(String instrucao){
		String [] separaEspaco;
		separaEspaco = instrucao.split(" ");
		if(separaEspaco.length >= 2){
			if(separaEspaco[1].equals(":")){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	public boolean isHalt(String instrucao){
		String [] separaEspaco;
		separaEspaco = instrucao.split(" ");
		if(separaEspaco.length > 0){
			if(separaEspaco[0].toLowerCase().equals("halt")){
				return true;
			}
		}
		
		if(separaEspaco.length > 2){
			if(separaEspaco[1].equals(":") &&
					separaEspaco[2].toLowerCase().equals("halt")){
				return true;
			}
		}
		
		return false;
	}

}
