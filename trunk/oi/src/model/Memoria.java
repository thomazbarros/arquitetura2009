package model;
 
import java.util.TreeMap;

import controller.Conversor;

public class Memoria{
	private Conversor conversor;
	private boolean pontoDeControle, ler;
	private String [] dados;
	private String valor, codigo;
	private Integer posicaoLivre, posicaoAtual;
	private final int tamanho = 1024;
	private TreeMap<String,Integer> labels; 
    private TreeMap<Integer,Long> labelMemoria;
	private MemoriaCache cache;
	private long posicao;
	private int constanteLabel;
	
	public Memoria(boolean pontoDeControle,MemoriaCache cache){
		this.pontoDeControle = pontoDeControle;
		dados = new String[tamanho]; 
		for(int i = 0; i < dados.length; i++){
			dados[i] = "00000000000000000000000000000000";
		}
		posicaoLivre = 0;
		labels = new TreeMap<String, Integer>();
		labelMemoria = new TreeMap<Integer, Long>();
		conversor = new Conversor();
		this.cache = cache;
		constanteLabel = 1;
		ler = true;
		posicaoAtual = 0;
		posicao = -1;
		codigo = "";
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
	
	public void atualizaPosicao(){
		while(!dados[(int) posicao + 1].substring(0,2).equals(Constantes.BITS_INSTRUCAO)){
			posicao++;
		}
		
		posicao++;
		
		codigo = dados[(int) posicao];
		
		System.out.println("codigo" + codigo);
	}
	
	public String getDado(int posicao){
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
	
	public void ativaPontoDeControle(long posicao) {
		if(pontoDeControle){
			
			if(ler){
				valor = getDado((int) posicao);
				posicaoAtual = (int) posicao;
			}
			else{
				System.out.println("GRAVANDO");
				
				dados[posicaoAtual] = conversor.inteiroParaBinario(posicao);
				ler = true;
			}
			
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
	
	public void adicionaLabel(String label){
		long constante;
		
		constante = getConstanteLabel(label);
		
		if(constante != -1){
			this.addDado(conversor.labelParaBinario(constante));
		}else{
		}
	}
	
	public void relacionaLabelMemoria(String label, long posicao){
		labels.put(label,constanteLabel);
		labelMemoria.put(constanteLabel,posicao);
		constanteLabel++;
	}
	
	public long getPosicaoLabel(int label){
		long temp; 
		try{
			temp = labelMemoria.get(label);
			return temp;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	
	public long getConstanteLabel(String label){
		long temp; 
		try{
			temp = labels.get(label);
			return temp;
		}catch(Exception e){
			return -1;
		}
	}
	
	public String obtemDadoBacking(long posicao){
			return dados[(int) posicao];
	}
	
	public String getDadoAtual() {
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
			dados[i] = "00000000000000000000000000000000";
		}
		zeraLabels();
		posicaoLivre = 0;
		constanteLabel = 1;
	}


	public void setLer(boolean ler) {
		this.ler = ler;
	}

	
	public void imprimeTestes(){
		System.out.println(labels);
		System.out.println(labelMemoria);
	}

	public long getPosicao() {
		return posicao;
	}

	public void setPosicao(long posicao) {
		this.posicao = posicao;
	}

	public String getCodigo() {
		return codigo;
	}

}
