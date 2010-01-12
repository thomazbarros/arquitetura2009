package model;
 
import java.util.TreeMap;

import controller.Conversor;

public class Memoria{
	private Conversor conversor;
	private boolean pontoDeControle;
	private String [] dados;
	private String valor;
	private Integer posicaoLivre;
	private final int tamanho = 1024;
	TreeMap<String,Integer> labels; 
	TreeMap<Integer,Integer> labelMemoria;
	MemoriaCache cache;
	int constanteLabel;
	
	public Memoria(boolean pontoDeControle,MemoriaCache cache){
		this.pontoDeControle = pontoDeControle;
		dados = new String[tamanho]; 
		for(int i = 0; i < dados.length; i++){
			dados[i] = "0000000000000000";
		}
		posicaoLivre = 0;
		labels = new TreeMap<String, Integer>();
		labelMemoria = new TreeMap<Integer, Integer>();
		conversor = new Conversor();
		this.cache = cache;
		constanteLabel = 1;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isPontoDeControle() {
		return pontoDeControle;
	}

	public void setPontoDeControle(boolean pontoDeControle) {
		this.pontoDeControle = pontoDeControle;
	}

	public String[] getDados() {
		return dados;
	}

	public void setDados(String[] dados) {
		this.dados = dados;
	}
	
	public String getDado(int posicao){
		//return dados[posicao];
		System.out.println("PEGANDO DADOS. POSICAO :"+posicao);
		if(cache.verificaElementoCache(posicao)){
			System.out.println("Esta na cache");
			return cache.getElementoCache(posicao);
		}
		if(posicao < tamanho){
				System.out.println("nao esta na cache");
				cache.getDadosBacking(posicao, this);
				return dados[posicao];
		}
		return "";
	}
	
	public void addDado(String dado){
		if(posicaoLivre < tamanho){
			this.dados[posicaoLivre] = dado;
			posicaoLivre++;
		}
	}
	
	public void ativaPontoDeControle(Integer posicao) {
		if(pontoDeControle){
			//this.valor = dados[posicao];
			this.valor = getDado(posicao);
			pontoDeControle = false;
		}
	}

	public Integer getPosicaoAtual() {
		return posicaoLivre;
	}

	public void setPosicaoAtual(Integer posicaoAtual) {
		this.posicaoLivre = posicaoAtual;
	}
	
	public void zeraLabels(){
		for(String chave : labels.keySet()){
			labels.remove(chave);
		}
		for(Integer chave : labelMemoria.keySet()){
			labelMemoria.remove(chave);
		}
	}
	
	/*public void relacionaLabelMemoria(String label,int posicao){
		//try{
		int chave = labels.get(label);
		labelMemoria.put(chave, posicao);
		/*}catch(Exception e){
			//e.printStackTrace();
			//System.out.println("Label sem desvio antes");
			return;
		}
	}*/
	
	public void adicionaLabel(String label){
		/*if(labels.isEmpty()){
			labels.put(label,1);
			this.addDado(conversor.labelParaBinario(1));
			return;
		}
		labels.put(label,posicaoLivre);*/
		int constante;
		
		constante = getConstanteLabel(label);
		
		//System.out.println(label);
		//System.out.println(constante);
		//if(!label.equals("BLA"))
		//System.exit(1);
		if(constante != -1){
			this.addDado(conversor.labelParaBinario(constante));
		}else{
			//System.out.println("ERRO DO -1[2]");
			//System.exit(1);
			////System.out.println("ERRO!");
			//System.exit(1);
		}
	}
	
	public void relacionaLabelMemoria(String label,int posicao){
		/*if(labels.isEmpty()){
			labels.put(label,1);
			//this.addDado(conversor.labelParaBinario(1));
			//return;
		}*/
		labels.put(label,constanteLabel);
		labelMemoria.put(constanteLabel,posicao);
		constanteLabel++;
	}
	
	public int getPosicaoLabel(int label){
		int temp; 
		try{
			temp = labelMemoria.get(label);
			return temp;
		}catch(Exception e){
			//System.out.println("ERRO DO -1");
			//System.out.println("LABEL :"+label);
			//System.out.println(labelMemoria);
			//System.exit(1);
			return -1;
		}
	}
	
	public int getConstanteLabel(String label){
		int temp; 
		try{
			temp = labels.get(label);
			return temp;
		}catch(Exception e){
			//System.out.println("ERRO DO -1");
			//System.out.println("LABEL :"+label);
			//System.out.println(labelMemoria);
			//System.exit(1);
			return -1;
		}
	}
	
	/*public int getPosicaoLabel(String label){
		int temp;
		temp = labels.get(label);
		return labelMemoria.get(temp);
	}*/
	
	public String obtemDadoBacking(int posicao){
			return dados[posicao];
	}
	
	public String getDadoAtual() {
		/*if(cache.verificaElementoCache(posicaoLivre)){
			//System.out.println("Leitura realizada na cache");
			return cache.getElementoCache(posicaoLivre);
		}
		//System.out.println("Leitura realizada na backing");
		cache.getDadosBacking(posicaoLivre, this);*/
		return dados[posicaoLivre];
	}
	
	public String toString(){
		String res = "";
		for(int i = 0; i < posicaoLivre ;i++){
			res += dados[i] + " ";
		}
		return res;
	}

	public int getTamanho() {
		return tamanho;
	}

	public Integer getPosicaoLivre() {
		return posicaoLivre;
	}
	
	public void zeraMemoria(){
		for(int i = 0; i < dados.length; i++){
			dados[i] = "0000000000000000";
		}
		zeraLabels();
		posicaoLivre = 0;
		constanteLabel = 1;
	}
	
	public void imprimeTestes(){
		System.out.println(labels);
		System.out.println(labelMemoria);
	}
}
