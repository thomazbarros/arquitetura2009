package controller;

import model.Constantes;

public class Conversor {

	public String inteiroParaBinario(int numero){
		String temp = "";
		//System.out.println(numero);
		while(numero != 0){
			temp += String.valueOf(numero%2);
			numero /= 2;
			//System.out.println(numero);
			//System.out.println("TEMP : " + temp);
		}
		temp = 	reverter(temp);
		//System.out.println(temp);
		return completaBinario(temp);
	}
	
	public void hexadecimalParaInteiro(long hexadecimal){
		int numero = 0, i = 0;
		
		while(hexadecimal > 0){
			numero += (hexadecimal%16) * (16^i);
			i++;
			hexadecimal /= 16;
		}
		
		System.out.println(numero);
		
		inteiroParaBinario(numero);
	}
	
	public String labelParaBinario(int label){
		String temp = "";
		System.out.println(label);
		while(label != 0){
			temp += String.valueOf(label%2);
			label /= 2;
			System.out.println(label);
			System.out.println("TEMP : " + temp);
		}
		temp = 	reverter(temp);
		//System.out.println(temp);
		return completaLabel(temp);
	}
	
	public int binarioParaInteiro(String binario){
		int numero = 0;
		String aux;
		
		aux = binario.substring(2, binario.length());
		
		for(int i = 0; i < aux.length(); i++){
			if(aux.charAt(aux.length()-i-1) == '1'){
			//	System.out.println("I:"+i);
				numero += Math.pow(2,i);
			//	System.out.println(numero);
			//	System.out.println(2^i);
			}
		}
	//	System.out.println("BINARIO : "+binario);
	//	System.out.println("NUMERO : "+numero);
		return numero;
	}
	
	public String completaBinario(String fim){
		//Metodo responsavel por preencher os 0's que faltam em um binario
		
		String meio = "";
		int numeroLoops;
		
		numeroLoops = Constantes.TAMANHO_PALAVRA - fim.length();
		numeroLoops -= Constantes.BITS_CONSTANTE.length();
		
		for(int i = 0; i < numeroLoops; i++){
			meio += "0";
		}
		
		return Constantes.BITS_CONSTANTE + meio + fim;
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

}
