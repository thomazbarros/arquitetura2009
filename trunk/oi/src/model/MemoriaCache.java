package model;
 
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MemoriaCache {
	private HashMap<Integer,String> dados;
	private TreeMap<Integer,Integer> fila;
	private int tamanhoBloco;
	private int tamanho;
	private int contadorFifo;
	private int posicoesOcupadas;
	private int numeroAcertos;
	private int totalTentativas;
	private boolean acessoBacking;
	
	public MemoriaCache()
	{
		tamanho = Constantes.TAMANHO_CACHE;
		tamanhoBloco = Constantes.TAMANHO_BLOCO_CACHE;
		dados = new HashMap<Integer,String>(tamanho);
		fila = new TreeMap<Integer, Integer>();
		contadorFifo = 0;
		posicoesOcupadas = 0;
		numeroAcertos = 0;
		totalTentativas = 0;
		acessoBacking = true;
	}
	
	public void getDadosBacking(int posicao, Memoria backing){
		totalTentativas++;
		int posicoesNecessarias,posicoesDisponiveis;
		posicoesNecessarias = posicao+tamanhoBloco;
		posicoesDisponiveis = backing.getTamanho() - posicao;
		if(posicoesNecessarias < posicoesDisponiveis){
			adicionaCache(posicao,tamanhoBloco,backing);
		}else{
			adicionaCache(posicao,
					posicoesNecessarias - posicoesDisponiveis,backing);
		}
		exibeMensagem(false);
	}
	
	public void adicionaCache(int posicaoInicial,int numeroPalavras,Memoria backing){
		//System.out.println("POSICOES OCUPADAS :"+posicoesOcupadas);
		//System.out.println("NUMEROPALAVRAS :"+numeroPalavras);
		//System.out.println("TAMANHO :"+tamanho);
		if(posicoesOcupadas+numeroPalavras <= tamanho){
			posicoesOcupadas += numeroPalavras;
		}else{
			removeFifo(numeroPalavras);
		}
		
		for(int i = posicaoInicial; i < posicaoInicial + numeroPalavras;i++){
			dados.put(i,backing.obtemDadoBacking(i));
			fila.put(i,contadorFifo);
			contadorFifo++;
		}
	}
	
	public void removeFifo(int numeroPalavras){
		for(int i = 0; i < numeroPalavras;i++){
			dados.remove(fila.get(i));
			fila.remove(i);
			contadorFifo--;
		}
		posicoesOcupadas -= numeroPalavras;
		arrumaFila(numeroPalavras);
	}
	
	public void arrumaFila(int numeroPalavras){
		Set<Integer> chaves;
		TreeMap<Integer, Integer> aux = new TreeMap<Integer, Integer>();
		int temp;
		
		chaves = (Set<Integer>)fila.keySet();
		
		for(int chave : chaves){
			temp = fila.get(chave);
			aux.put(chave-numeroPalavras,temp);
		}
		fila = aux;
		
	}
	
	public boolean verificaElementoCache(int posicao){
		if(dados.containsKey(posicao)){
			return true;
		}
		return false;
	}
	
	public String getElementoCache(int posicao){
		numeroAcertos++;
		totalTentativas++;
		exibeMensagem(true);
		return dados.get(posicao);
	}
	
	public String getDado(int posicao){
		return dados.get(posicao);
	}
	
	public String imprimeCache(int posicao){
		if(dados.get(posicao) == null){
			return "00000000000000000000000000000000";
		}
		return dados.get(posicao);
	}
	
	public double getPorcentagemAcerto(){
		if(totalTentativas == 0){
			return 0.0;
		}
		return (double)numeroAcertos/totalTentativas;
	}
	
	public void exibeMensagem(boolean acerto){
		if(acerto){
			System.out.println("Leitura realizada na cache");
			System.out.println("Porcentagem de acerto :"+getPorcentagemAcerto());
			acessoBacking = false;
		}else{
			System.out.println("Leitura realizada na backing");
			System.out.println("Porcentagem de acerto :"+getPorcentagemAcerto());
			acessoBacking = true;
		}
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getPosicoesOcupadas() {
		return posicoesOcupadas;
	}
	
	public void zeraCache(){
		dados = null;
		fila = null;
		dados = new HashMap<Integer,String>(tamanho);
		fila = new TreeMap<Integer, Integer>();
		contadorFifo = 0;
		posicoesOcupadas = 0;
		numeroAcertos = 0;
		totalTentativas = 0;
	}

	public boolean isAcessoBacking() {
		return acessoBacking;
	}
	
}
