package controller;
 
import model.Constantes;

public class Conversor {

	public String inteiroParaBinario(long numero){
		String temp = "";
		boolean isNegativo = false;
		
		numero = valorOverflow(numero);		
		
		if(numero < 0){
			isNegativo = true;
		}
		numero = Math.abs(numero);

		System.out.println("NUMERO :"+numero);

		while(numero != 0){
			temp += String.valueOf(numero%2);
			numero /= 2;

		}
		temp = 	reverter(temp);

		
		return completaBinario(temp,isNegativo);
	}
		
	public String labelParaBinario(long label){
		String temp = "";

		while(label != 0){
			temp += String.valueOf(label%2);
			label /= 2;

		}
		temp = 	reverter(temp);

		return completaLabel(temp);
	}
	
	public int binarioParaInteiro(String binario){
		int numero = 0;
		String aux;
		
		if(isConstante(binario)){
			aux = binario.substring(3,binario.length());
		}else{
			aux = binario.substring(2, binario.length());
		}
		
		for(int i = 0; i < aux.length(); i++){
			if(aux.charAt(aux.length()-i-1) == '1'){

				numero += Math.pow(2,i);

			}
		}

		if(isConstante(binario) && binario.charAt(2) == '1'){

			return -1 * numero;
		}
		
		return numero;
	}
	
	public int enderecoParaInteiro(String binario){
		//Metodo responsavel por converter enderecos para inteiros 
		//Nao existem numeros negativos como em constantes
		
		int numero = 0;
				
		for(int i = 0; i < binario.length(); i++){
			if(binario.charAt(binario.length()-i-1) == '1'){

				numero += Math.pow(2,i);

			}
		}
		
		return numero;
	}
	
	public String completaBinario(String fim,boolean isNegativo){
		//Metodo responsavel por preencher os 0's que faltam em um binario
		
		String meio = "";
		int numeroLoops;
		
		numeroLoops = Constantes.TAMANHO_PALAVRA - fim.length() - 1;
		numeroLoops -= Constantes.BITS_CONSTANTE.length();
		
		for(int i = 0; i < numeroLoops; i++){
			meio += "0";
		}
		if(isNegativo){
			return Constantes.BITS_CONSTANTE +"1"+ meio + fim;
		}
		
		return Constantes.BITS_CONSTANTE + "0" + meio + fim;
	}
	
	public String completaLabel(String fim){
		//Metodo responsavel por preencher os 0's que faltam em um binario
		
		String meio = "";
		int numeroLoops;
		
		numeroLoops = Constantes.TAMANHO_PALAVRA - fim.length();
		numeroLoops -= Constantes.BITS_LABEL.length();
		
		for(int i = 0; i < numeroLoops; i++){
			meio += "0";
		}
		
		return Constantes.BITS_LABEL + meio + fim;
	}
	public String reverter(String binario){
		String resultado = "";
		for(int i = 0; i < binario.length(); i++){
			resultado += binario.charAt(binario.length()-i-1);
		}
		return resultado;
	}
	
	public boolean isConstante(String binario){
		String aux;
		aux = binario.substring(0, 2);
		
		if(aux.equals(Constantes.BITS_CONSTANTE)){
			return true;
		}
		
		return false;
	}
	
	public long valorOverflow(long valor){
		long aux;
		
		if(valor <= Constantes.LIMITE_CONSTANTE){
			return valor;
		}
				
		aux = valor / Constantes.LIMITE_CONSTANTE;
		
		if(aux % 2 == 0){
			return valor % Constantes.LIMITE_CONSTANTE;
		}
		
		if(valor % Constantes.LIMITE_CONSTANTE == 0){
			return Constantes.LIMITE_CONSTANTE;
		}
		return valor % Constantes.LIMITE_CONSTANTE + Constantes.LIMITE_NEGATIVO_CONSTANTE - 1;
		
	}
	
}
