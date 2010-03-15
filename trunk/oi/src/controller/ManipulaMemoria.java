package controller;

import java.util.ArrayList;

import model.Constantes;
import model.Registrador;

public class ManipulaMemoria {
	private Arquitetura arquitetura;
	private Conversor conversor;
	
	public ManipulaMemoria(Arquitetura arquitetura){
		this.arquitetura = arquitetura;
		conversor = new Conversor();
	}
	
	public void adicionaTodasLabels(String caminhoArquivo){
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		Parser parser = new Parser();
		String label;
		int posicao = 0;
		int[] tipos;
		String instrucao;
		
		ArrayList<String> linhas = manipulaArquivo
		.ler(caminhoArquivo);
		for (String linha : linhas) {
			
			instrucao = parser.decifraInstrucao(linha);
			
			if(parser.hasLabel(linha)){
				label = parser.decifraLabel(linha);
				posicao++;
				arquitetura.getMemoria().relacionaLabelMemoria(label, posicao);
			}
			
			if (getTipo(instrucao) == 1) {
				tipos = parser.decifraArgumentos(linha);
				if (tipos[0] != Constantes.ERRO && tipos[1] != Constantes.ERRO) {
					if (parser.getConstante(linha) != Constantes.ERRO) {
						posicao++;
					}
				}
			}
			
			if (getTipo(instrucao) == 3) {
				label = parser.decifraLabelArgumento(linha);
				if(label != ""){
					posicao++;
				}
			}
			if(!linha.equals("\n") && !linha.equals("")){
				posicao++;
			}
		}
	}
	
	public void decifraInstrucao(String caminhoArquivo) {
		adicionaTodasLabels(caminhoArquivo);
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		Parser parser = new Parser();
		ArrayList<String> linhas = manipulaArquivo
				.ler(caminhoArquivo);
		String instrucao,label,temp;
		int[] tipos;
		int tipo1,posicao = 0;
		long constanteLabel;

		for (String linha : linhas) {
			

			instrucao = parser.decifraInstrucao(linha);

			if (instrucao.equals("")) {

				continue;
			}
			
			if(parser.hasLabel(linha)){
				label = parser.decifraLabel(linha);

				constanteLabel = arquitetura.getMemoria().getConstanteLabel(label);
				temp = conversor.labelParaBinario(constanteLabel);
				arquitetura.getMemoria().addDado(temp);
				posicao+=2;
			}
			
			if(instrucao.equals("halt")){
				halt();
			}
			
			if (getTipo(instrucao) == 1) {
				tipos = parser.decifraArgumentos(linha);
				if (tipos[0] != Constantes.ERRO && tipos[1] != Constantes.ERRO) {
					if (parser.getConstante(linha) != Constantes.ERRO) {
						instrucaoGrupo1Constante(parser.getConstante(linha), tipos[1] , instrucao);
						posicao+=2;
					} else {
						instrucaoGrupo1(tipos[0], tipos[1],instrucao);
						posicao++;
					}
				} else {

				}
				continue;
			}
			
			if (getTipo(instrucao) == 2) {
				tipo1 = parser.decifraArgumento(linha);
				if (tipo1 != Constantes.ERRO && tipo1 != Constantes.CONSTANTE) {
					instrucaoGrupo2(tipo1,instrucao);
					posicao++;
				} else {
					//System.out.println("Instrução Inválida");
				}
				continue;
			}
			
			if (getTipo(instrucao) == 3) {
				label = parser.decifraLabelArgumento(linha);
				if(label != ""){
					instrucaoGrupo3(label,instrucao);
					posicao+=2;
				}else{
					//System.out.println("Instrução Inválida");
				}
			}
		}
	}
	
	public void halt(){
		String binario = Constantes.HALT;
		binario += Constantes.NENHUMA_FONTE + Constantes.NENHUM_DESTINO;
		binario += Constantes.ZEROS_FINAL_INSTRUCAO;
		arquitetura.getMemoria().addDado(binario);
	}
	
	public boolean isHalt(String binario){
		String binarioHalt = Constantes.HALT;
		binarioHalt += Constantes.NENHUMA_FONTE + Constantes.NENHUM_DESTINO;
		if(binarioHalt.equals(binario)){
			return true;
		}
		return false;
	}
	
	public void instrucaoGrupo1(int tipo1, int tipo2, String instrucao) {
		String codigoInstrucao = getConstanteInstrucao(instrucao);

		switch (tipo1) {
		case Constantes.R0:
			codigoInstrucao += Constantes.R0_FONTE;
			break;
		case Constantes.R1:
			codigoInstrucao += Constantes.R1_FONTE;
			break;
		case Constantes.R2:
			codigoInstrucao += Constantes.R2_FONTE;
			break;
		case Constantes.R3:
			codigoInstrucao += Constantes.R3_FONTE;
			break;
		case Constantes.R4:
			codigoInstrucao += Constantes.R4_FONTE;
			break;
		case Constantes.PR0:
			codigoInstrucao += Constantes.PR0_FONTE;
			break;
		case Constantes.PR1:
			codigoInstrucao += Constantes.PR1_FONTE;
			break;
		case Constantes.PR2:
			codigoInstrucao += Constantes.PR2_FONTE;
			break;
		case Constantes.PR3:
			codigoInstrucao += Constantes.PR3_FONTE;
			break;
		case Constantes.PR4:
			codigoInstrucao += Constantes.PR4_FONTE;
			break;
		}

		switch (tipo2) {
		case Constantes.R0:
			codigoInstrucao += Constantes.R0_DESTINO;
			break;
		case Constantes.R1:
			codigoInstrucao += Constantes.R1_DESTINO;
			break;
		case Constantes.R2:
			codigoInstrucao += Constantes.R2_DESTINO;
			break;
		case Constantes.R3:
			codigoInstrucao += Constantes.R3_DESTINO;
			break;
		case Constantes.R4:
			codigoInstrucao += Constantes.R4_DESTINO;
			break;
		case Constantes.PR0:
			codigoInstrucao += Constantes.PR0_DESTINO;
			break;
		case Constantes.PR1:
			codigoInstrucao += Constantes.PR1_DESTINO;
			break;
		case Constantes.PR2:
			codigoInstrucao += Constantes.PR2_DESTINO;
			break;
		case Constantes.PR3:
			codigoInstrucao += Constantes.PR3_DESTINO;
			break;
		case Constantes.PR4:
			codigoInstrucao += Constantes.PR4_DESTINO;
			break;
		}

		codigoInstrucao += Constantes.ZEROS_FINAL_INSTRUCAO;
		arquitetura.getMemoria().addDado(codigoInstrucao);
	}

	public void instrucaoGrupo1Constante(int constante, int tipo2, String instrucao) {
		String codigoInstrucao = getConstanteInstrucao(instrucao) + Constantes.CONSTANTE_FONTE;

		switch (tipo2) {
		case Constantes.R0:
			codigoInstrucao += Constantes.R0_DESTINO;
			break;
		case Constantes.R1:
			codigoInstrucao += Constantes.R1_DESTINO;
			break;
		case Constantes.R2:
			codigoInstrucao += Constantes.R2_DESTINO;
			break;
		case Constantes.R3:
			codigoInstrucao += Constantes.R3_DESTINO;
			break;
		case Constantes.R4:
			codigoInstrucao += Constantes.R4_DESTINO;
			break;
		case Constantes.PR0:
			codigoInstrucao += Constantes.PR0_DESTINO;
			break;
		case Constantes.PR1:
			codigoInstrucao += Constantes.PR1_DESTINO;
			break;
		case Constantes.PR2:
			codigoInstrucao += Constantes.PR2_DESTINO;
			break;
		case Constantes.PR3:
			codigoInstrucao += Constantes.PR3_DESTINO;
			break;
		case Constantes.PR4:
			codigoInstrucao += Constantes.PR4_DESTINO;
			break;
		}
		
		codigoInstrucao += Constantes.ZEROS_FINAL_INSTRUCAO;
		arquitetura.getMemoria().addDado(codigoInstrucao);
		arquitetura.getMemoria().addDado(conversor.inteiroParaBinario(constante));
	}	
	
	public void instrucaoGrupo2(int tipo,String instrucao) {
		String codigoInstrucao = getConstanteInstrucao(instrucao);

		switch (tipo) {
		case Constantes.R0:
			codigoInstrucao += Constantes.R0_FONTE;
			break;
		case Constantes.R1:
			codigoInstrucao += Constantes.R1_FONTE;
			break;
		case Constantes.R2:
			codigoInstrucao += Constantes.R2_FONTE;
			break;
		case Constantes.R3:
			codigoInstrucao += Constantes.R3_FONTE;
			break;
		case Constantes.R4:
			codigoInstrucao += Constantes.R4_FONTE;
			break;
		case Constantes.PR0:
			codigoInstrucao += Constantes.PR0_FONTE;
			break;
		case Constantes.PR1:
			codigoInstrucao += Constantes.PR1_FONTE;
			break;
		case Constantes.PR2:
			codigoInstrucao += Constantes.PR2_FONTE;
			break;
		case Constantes.PR3:
			codigoInstrucao += Constantes.PR3_FONTE;
			break;
		case Constantes.PR4:
			codigoInstrucao += Constantes.PR4_FONTE;
			break;
		}

		codigoInstrucao += Constantes.NENHUM_DESTINO;
		
		codigoInstrucao += Constantes.ZEROS_FINAL_INSTRUCAO;
		arquitetura.getMemoria().addDado(codigoInstrucao);
	}
	
	public void instrucaoGrupo3(String label, String instrucao) {
		String codigoInstrucao = getConstanteInstrucao(instrucao); 
		codigoInstrucao += Constantes.LABEL_FONTE + Constantes.NENHUM_DESTINO;

		codigoInstrucao += Constantes.ZEROS_FINAL_INSTRUCAO;
		arquitetura.getMemoria().addDado(codigoInstrucao);
		arquitetura.getMemoria().adicionaLabel(label);
	}
	
	public String getConstanteInstrucao(String instrucao){
		if(instrucao.equals("add")){
			return Constantes.ADD;
		}
		if(instrucao.equals("sub")){
			return Constantes.SUB;
		}
		if(instrucao.equals("mov")){
			return Constantes.MOV;
		}
		if(instrucao.equals("cmp")){
			return Constantes.CMP;
		}
		if(instrucao.equals("and")){
			return Constantes.AND;
		}
		if(instrucao.equals("or")){
			return Constantes.OR;
		}
		if(instrucao.equals("not")){
			return Constantes.NOT;
		}
		if(instrucao.equals("clr")){
			return Constantes.CLR;
		}
		if(instrucao.equals("neg")){
			return Constantes.NEG;
		}
		if(instrucao.equals("shl")){
			return Constantes.SHL;
		}
		if(instrucao.equals("shr")){
			return Constantes.SHR;
		}
		if(instrucao.equals("brz")){
			return Constantes.BRZ;
		}
		if(instrucao.equals("brn")){
			return Constantes.BRN;
		}
		if(instrucao.equals("bre")){
			return Constantes.BRE;
		}
		if(instrucao.equals("brl")){
			return Constantes.BRL;
		}	
		if(instrucao.equals("brg")){
			return Constantes.BRG;
		}
		if(instrucao.equals("brc")){
			return Constantes.BRC;
		}
		if(instrucao.equals("jmp")){
			return Constantes.JMP;
		}
		if(instrucao.equals("xor")){
			return Constantes.XOR;
		}
		if(instrucao.equals("test")){
			return Constantes.TEST;
		}
		if(instrucao.equals("inc")){
			return Constantes.INC;
		}
		if(instrucao.equals("dec")){
			return Constantes.DEC;
		}
		if(instrucao.equals("brnz")){
			return Constantes.BRNZ;
		}
		if(instrucao.equals("brnn")){
			return Constantes.BRNN;
		}
		if(instrucao.equals("brnc")){
			return Constantes.BRNC;
		}
		if(instrucao.equals("bro")){
			return Constantes.BRO;
		}
		if(instrucao.equals("brno")){
			return Constantes.BRNO;
		}
		if(instrucao.equals("halt")){
			return Constantes.HALT;
		}
		return "";
	}
	
	public int getTipo(String instrucao){
		if(instrucao.equals("add")||
			instrucao.equals("sub")||
			instrucao.equals("mov")||
			instrucao.equals("cmp")||
			instrucao.equals("and")||
			instrucao.equals("or") ||
			instrucao.equals("xor")||
			instrucao.equals("test"))
		{
			return 1;
		}
		if(instrucao.equals("not")||
			instrucao.equals("clr")||
			instrucao.equals("neg")||
			instrucao.equals("shl")||
			instrucao.equals("shr")||
			instrucao.equals("inc")||
			instrucao.equals("dec"))
			
		{
			return 2;
		}
		
		if(instrucao.equals("brz")||
			instrucao.equals("brn")||
			instrucao.equals("bre")||
			instrucao.equals("brl")||
			instrucao.equals("brg")||
			instrucao.equals("brc")||
			instrucao.equals("brnz")||
			instrucao.equals("brnn")||
			instrucao.equals("brnc")||
			instrucao.equals("bro") ||
			instrucao.equals("brno") ||
			instrucao.equals("jmp"))
		{
			return 3;
		}
		
		return 0;
	}
	
	public int ler(int posicao){

		String binario;

		binario = arquitetura.getMemoria().obtemDadoBacking(posicao);

		
		if(binario.substring(0, 1).equals("1")){
			//decodificaInstrucao(binario);

			if(arquitetura.getModo() == Constantes.RODAINSTRUCAO){
				arquitetura.atualizaPainel();
			}
			return -1;
		}

		//arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		return conversor.binarioParaInteiro(binario);
		
	}
	
	public int decodificaOperacaoGrupo1(String instrucao){
		
		if(isConstante(instrucao.substring(8, 12))){
			if(isRegistradorDestino(instrucao.substring(12 , 16))){
				return 1;
			}else{
				return 2;
			}
		}
		if(isRegistradorFonte(instrucao.substring(8, 12))){
			if(isRegistradorDestino(instrucao.substring(12 , 16))){
				return 3;
			}else{
				return 4;
			}
		}
		if(isEnderecoRegistradorFonte(instrucao.substring(8, 12))){
			if(isRegistradorDestino(instrucao.substring(12 , 16))){
				return 5;
			}else{
				return 6;
			}
		}
		
		return 0;
	}

	public int decodificaOperacaoGrupo2(String instrucao){
		

		if(isRegistradorFonte(instrucao.substring(8, 12))){
			return 1;
		}
		if(isEnderecoRegistradorFonte(instrucao.substring(8, 12))){
			return 2;
		}
		
		return 0;
	}	
	
	public boolean isConstante(String codigo){
		if(codigo.equals(Constantes.CONSTANTE_FONTE)){
			return true;
		}
		return false;
	}
	
	public boolean isRegistradorFonte(String codigo){
		if(codigo.equals(Constantes.R0_FONTE)||
			codigo.equals(Constantes.R1_FONTE)||
			codigo.equals(Constantes.R2_FONTE)||
			codigo.equals(Constantes.R3_FONTE)||
			codigo.equals(Constantes.R4_FONTE))
		{
			return true;
		}
		return false;
	}
	
	public boolean isRegistradorDestino(String codigo){
		if(codigo.equals(Constantes.R0_DESTINO)||
			codigo.equals(Constantes.R1_DESTINO)||
			codigo.equals(Constantes.R2_DESTINO)||
			codigo.equals(Constantes.R3_DESTINO)||
			codigo.equals(Constantes.R4_DESTINO))
		{
			return true;
		}
		return false;
	}
	
	public boolean isEnderecoRegistradorFonte(String codigo){
		if(codigo.equals(Constantes.PR0_FONTE)||
			codigo.equals(Constantes.PR1_FONTE)||
			codigo.equals(Constantes.PR2_FONTE)||
			codigo.equals(Constantes.PR3_FONTE)||
			codigo.equals(Constantes.PR4_FONTE))
		{
			return true;
		}
		return false;
	}
	
	public boolean isEnderecoRegistradorDestino(String codigo){
		if(codigo.equals(Constantes.PR0_DESTINO)||
			codigo.equals(Constantes.PR1_DESTINO)||
			codigo.equals(Constantes.PR2_DESTINO)||
			codigo.equals(Constantes.PR3_DESTINO)||
			codigo.equals(Constantes.PR4_DESTINO))
		{
			return true;
		}
		return false;
	}
	
	/*public void decodificaInstrucao(String binario){
		String instrucao = binario.substring(0,8);
		//System.out.println("INSTRUCAO/POSICAO: "+instrucao+"/"+arquitetura.getPc().getValor());
		if(instrucao.equals(Constantes.ADD)){
			//System.out.println("add");
			add(binario);
			return;
		}
		if(instrucao.equals(Constantes.SUB)){
			sub(binario);
			return;
		}
		if(instrucao.equals(Constantes.MOV)){
			mov(binario);
			return;
		}
		if(instrucao.equals(Constantes.CMP)){
			cmp(binario);
			return;
		}
		if(instrucao.equals(Constantes.AND)){
			and(binario);
			return;
		}
		if(instrucao.equals(Constantes.OR)){
			or(binario);
			return;
		}
		if(instrucao.equals(Constantes.NOT)){
			not(binario);
			return;
		}
		if(instrucao.equals(Constantes.CLR)){
			clr(binario);
			return;
		}
		if(instrucao.equals(Constantes.NEG)){
			neg(binario);
			return;
		}
		if(instrucao.equals(Constantes.SHL)){
			shl(binario);
			return;
		}
		if(instrucao.equals(Constantes.SHR)){
			shr(binario);
			return;
		}
		if(instrucao.equals(Constantes.XOR)){
			xor(binario);
			return;
		}
		if(instrucao.equals(Constantes.TEST)){
			test(binario);
			return;
		}
		if(instrucao.equals(Constantes.INC)){
			inc(binario);
			return;
		}
		if(instrucao.equals(Constantes.DEC)){
			dec(binario);
			return;
		}
		
	if(instrucao.equals(Constantes.BRZ)){
			instrucao.desvioCondicional1();
			//brz(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRN)){
			this.instrucao.desvioCondicional2();
			//brn(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRE)){
			this.instrucao.desvioCondicional3();
			//bre(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRL)){
			this.instrucao.desvioCondicional4();
			//brl(binario);
			return;
		}	
		if(instrucao.equals(Constantes.BRG)){
			this.instrucao.desvioCondicional5();
			//brg(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRC)){
			this.instrucao.desvioCondicional6();
			//brc(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRNZ)){
			this.instrucao.desvioCondicional7();
			//brz(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRNN)){
			this.instrucao.desvioCondicional8();
			//brz(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRNC)){
			this.instrucao.desvioCondicional9();
			//brz(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRO)){
			this.instrucao.desvioCondicional10();
			//brz(binario);
			return;
		}
		if(instrucao.equals(Constantes.BRNO)){
			this.instrucao.desvioCondicional11();
			//brz(binario);
			return;
		}
		if(instrucao.equals(Constantes.JMP)){
			this.instrucao.desvioIncondicional();
			//jmp(binario);
			return;
		}
	}
	
	public Registrador getRegistradorFonte(String codigo){
		
		if(codigo.equals(Constantes.R0_FONTE) || codigo.equals(Constantes.PR0_FONTE)){
			return arquitetura.getR0();
		}
		if(codigo.equals(Constantes.R1_FONTE) || codigo.equals(Constantes.PR1_FONTE)){
			return arquitetura.getR1();
		}
		if(codigo.equals(Constantes.R2_FONTE) || codigo.equals(Constantes.PR2_FONTE)){
			return arquitetura.getR2();
		}
		if(codigo.equals(Constantes.R3_FONTE) || codigo.equals(Constantes.PR3_FONTE)){
			return arquitetura.getR3();
		}
		if(codigo.equals(Constantes.R4_FONTE) || codigo.equals(Constantes.PR4_FONTE)){
			return arquitetura.getR4();
		}
		
		return null;
	}
	
	public Registrador getRegistradorDestino(String codigo){
		if(codigo.equals(Constantes.R0_DESTINO) || codigo.equals(Constantes.PR0_DESTINO)){
			return arquitetura.getR0();
		}
		if(codigo.equals(Constantes.R1_DESTINO) || codigo.equals(Constantes.PR1_DESTINO)){
			return arquitetura.getR1();
		}
		if(codigo.equals(Constantes.R2_DESTINO) || codigo.equals(Constantes.PR2_DESTINO)){
			return arquitetura.getR2();
		}
		if(codigo.equals(Constantes.R3_DESTINO) || codigo.equals(Constantes.PR3_DESTINO)){
			return arquitetura.getR3();
		}
		if(codigo.equals(Constantes.R4_DESTINO) || codigo.equals(Constantes.PR4_DESTINO)){
			return arquitetura.getR4();
		}
		return null;
	}
	
	public void add(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.soma1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.soma2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.soma3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.soma4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.soma5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			
			break;
		case 6:
			instrucao.soma6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
		
	public void sub(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.subtracao1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.subtracao2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.subtracao3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.subtracao4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.subtracao5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 6:
			instrucao.subtracao6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
	
	public void mov(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.move1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.move2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.move3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.move4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.move5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 6:
			instrucao.move6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
	
	public void cmp(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.comparacao1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.comparacao2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.comparacao3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.comparacao4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.comparacao5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 6:
			instrucao.comparacao6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
	
	public void and(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.and1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.and2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.and3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.and4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.and5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 6:
			instrucao.and6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
	
	public void or(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.or1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.or2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.or3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.or4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.or5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 6:
			instrucao.or6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
	
	public void not(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo2(binario);
		
		switch(funcao){
		case 1:
			instrucao.not1(getRegistradorFonte(binario.substring(8,12)));
			break;
		case 2:
			instrucao.not2(getRegistradorFonte(binario.substring(8,12)));
			break;
		}
	}
	
	public void clr(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo2(binario);
		
		switch(funcao){
		case 1:
			instrucao.limpa1(getRegistradorFonte(binario.substring(8,12)));
			break;
		case 2:
			instrucao.limpa2(getRegistradorFonte(binario.substring(8,12)));
			break;
		}
	}

	public void neg(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo2(binario);
		
		switch(funcao){
		case 1:
			instrucao.negacao1(getRegistradorFonte(binario.substring(8,12)));
			break;
		case 2:
			instrucao.negacao2(getRegistradorFonte(binario.substring(8,12)));
			break;
		}
	}
	
	public void shl(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo2(binario);
		
		switch(funcao){
		case 1:
			instrucao.deslocamentoEsquerda1(getRegistradorFonte(binario.substring(8,12)));
			break;
		case 2:
			instrucao.deslocamentoEsquerda2(getRegistradorFonte(binario.substring(8,12)));
			break;
		}
	}
	
	public void shr(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo2(binario);
		
		switch(funcao){
		case 1:
			instrucao.deslocamentoDireita1(getRegistradorFonte(binario.substring(8,12)));
			break;
		case 2:
			instrucao.deslocamentoDireita2(getRegistradorFonte(binario.substring(8,12)));
			break;
		}
	}
	
	public void xor(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.xor1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.xor2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.xor3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.xor4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.xor5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 6:
			instrucao.xor6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
	
	public void test(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo1(binario);
		
		switch(funcao){
		case 1:
			instrucao.test1(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 2:
			instrucao.test2(getRegistradorDestino(binario.substring(12,16)));
			break;
		case 3:
			instrucao.test3(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));
			break;
		case 4:
			instrucao.test4(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 5:
			instrucao.test5(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
			break;
		case 6:
			instrucao.test6(getRegistradorFonte(binario.substring(8,12)),getRegistradorDestino(binario.substring(12,16)));			
		}
	}
	
	public void inc(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo2(binario);
		
		switch(funcao){
		case 1:
			instrucao.incrementa1(getRegistradorFonte(binario.substring(8,12)));
			break;
		case 2:
			instrucao.incrementa2(getRegistradorFonte(binario.substring(8,12)));
			break;
		}
	}
	
	public void dec(String binario){
		int funcao;
		
		funcao = decodificaOperacaoGrupo2(binario);
		
		switch(funcao){
		case 1:
			instrucao.decrementa1(getRegistradorFonte(binario.substring(8,12)));
			break;
		case 2:
			instrucao.decrementa2(getRegistradorFonte(binario.substring(8,12)));
			break;
		}
	}*/
	
	public boolean isLabel(String binario){
		if(binario.substring(0,2).equals(Constantes.BITS_LABEL)){
			return true;
		}
		return false;
	}

	public Arquitetura getArquitetura() {
		return arquitetura;
	}
	
}
