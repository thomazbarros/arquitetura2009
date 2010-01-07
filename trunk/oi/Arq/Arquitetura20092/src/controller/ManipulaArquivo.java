package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ManipulaArquivo {
	
	public ArrayList<String> ler(String caminho) {
		ArrayList<String> linhas = new ArrayList<String>();
		try {
	        BufferedReader in = new BufferedReader(new FileReader(caminho));
	            String str;
	            while (in.ready()) {
	                str = in.readLine();
	                linhas.add(str);
	                //System.out.println(str);
	            }
	            in.close();
	    } catch (IOException e) {
	    	return null;
	    }
	    return linhas;
	}
	
}
