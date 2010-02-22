package controller;
import java.util.ArrayList;

import model.Constantes;
import model.Memoria;
import model.MemoriaCache;
import model.MemoriaDeControle;
import model.Microinstrucao;
import model.Multiplexador;
import model.Registrador;
import model.ULA;
	
	public class Arquitetura {
	
	private view.PainelBaixo painelBaixo;
	private view.PainelULA ulaGrafica;
	private Registrador r0, r1, r2, r3, r4, rx, ry, pc, rDado, rEnd, ir;
	private Multiplexador mux, muxA, muxB;
	private Memoria memoria;
	private MemoriaCache cache;
	private ULA ula;
	private MemoriaDeControle memoriaDeControle;
	private int modo;
	private Conversor conversor;
	private boolean[] pontosDeControle = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	private boolean continuar;
	public boolean rodaThread;
	private RodarThread rodarThread;
	private boolean isHexa;
	private GeradorEnderecos gerador;
	private boolean halt;
		
	public Arquitetura(){
		r0 = new Registrador(false, 0);
		r1 = new Registrador(false, 0);
		r2 = new Registrador(false, 0);
		r3 = new Registrador(false, 0);
		r4 = new Registrador(false, 0);
		rx = new Registrador(false, 0);
		ry = new Registrador(false, 0);
		pc = new Registrador(false, 0);
		rDado = new Registrador(false, 0);
		rEnd = new Registrador(false, 0);
		ir = new Registrador(false, 0);
		mux = new Multiplexador(false);
		muxA = new Multiplexador(false, false);
		muxB = new Multiplexador(false, false, false);
		cache = new MemoriaCache();
		memoria = new Memoria(false,cache);
		ula = new ULA(false, false, false, false, false, false);
		memoriaDeControle = new MemoriaDeControle();
		modo = Constantes.RODAMICRO;
		conversor = new Conversor();
		ulaGrafica = null;
		painelBaixo = null;
		continuar = false;
		rodaThread = false;
		isHexa = false;
		gerador = new GeradorEnderecos();
		halt = false;
	}
	
	public void setULA(boolean multiplexador){
		if(multiplexador){
			
			ula.setA(muxA.ativaPontoDeControle(rDado.getValor(), r0.getValor(), r1.getValor(), rx.getValor()));
			
		}
		else{
			
			
			ula.setB(muxB.ativaPontoDeControle(r2.getValor(), r3.getValor(), r4.getValor(), ry.getValor(), pc.getValor()));
			
		}
	}
	
	
	public void ativaPontoDeControle(Microinstrucao microinstrucao){
		ArrayList<Character> pontoDeControle = microinstrucao.getPontoDeControle();
		boolean[] pontoDeControle2 = new boolean[24];
		long conteudoMemoria,valorMux;
		
		for(int i = 0; i < pontoDeControle.size(); i++){
			if(pontoDeControle.get(i)== 'a'){
				if(microinstrucao.getPontoDeControle2()[0] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'b'){
				if(microinstrucao.getPontoDeControle2()[1] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'c'){
				if(microinstrucao.getPontoDeControle2()[2] == '2'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'd'){
				if(microinstrucao.getPontoDeControle2()[3] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'e'){
				if(microinstrucao.getPontoDeControle2()[4] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'f'){
				if(microinstrucao.getPontoDeControle2()[5] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'g'){
				if(microinstrucao.getPontoDeControle2()[6] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'h'){
				if(microinstrucao.getPontoDeControle2()[7] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'i'){
				if(microinstrucao.getPontoDeControle2()[8] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'j'){
				if(microinstrucao.getPontoDeControle2()[9] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'k'){
				if(microinstrucao.getPontoDeControle2()[10] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'l'){
				if(microinstrucao.getPontoDeControle2()[11] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'm'){
				if(microinstrucao.getPontoDeControle2()[12] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'n'){
				if(microinstrucao.getPontoDeControle2()[13] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'o'){
				if(microinstrucao.getPontoDeControle2()[14] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'p'){
				if(microinstrucao.getPontoDeControle2()[15] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'q'){
				if(microinstrucao.getPontoDeControle2()[16] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'r'){
				if(microinstrucao.getPontoDeControle2()[17] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 's'){
				if(microinstrucao.getPontoDeControle2()[18] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 't'){
				if(microinstrucao.getPontoDeControle2()[19] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'u'){
				if(microinstrucao.getPontoDeControle2()[20] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'v'){
				if(microinstrucao.getPontoDeControle2()[21] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'w'){
				if(microinstrucao.getPontoDeControle2()[22] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
			if(pontoDeControle.get(i) == 'x'){
				if(microinstrucao.getPontoDeControle2()[23] == '1'){
					pontoDeControle2[i] = true;
				}
				else{
					pontoDeControle2[i] = false;
				}
			}
		}

		for(int i = 0; i < pontoDeControle.size(); i++)
		{

			switch(pontoDeControle.get(i)){
				case 'a':
					pontosDeControle[0] = pontoDeControle2[i];
					r0.setPontoDeControle(pontoDeControle2[i]);
					r0.ativaPontoDeControle(ula.getValor());

					break;
				case 'b':
					pontosDeControle[1] = pontoDeControle2[i];
					r1.setPontoDeControle(pontoDeControle2[i]);
					r1.ativaPontoDeControle(ula.getValor());

					break;
				case 'c':
					pontosDeControle[2] = pontoDeControle2[i];
					pc.setPontoDeControle(pontoDeControle2[i]);
					pc.ativaPontoDeControle(ula.getValor());
					
					break;
				case 'd':
					pontosDeControle[3] = pontoDeControle2[i];
					r2.setPontoDeControle(pontoDeControle2[i]);
					r2.ativaPontoDeControle(ula.getValor());

					break;
				case 'e':
					pontosDeControle[4] = pontoDeControle2[i];
					r3.setPontoDeControle(pontoDeControle2[i]);
					r3.ativaPontoDeControle(ula.getValor());

					break;
				case 'f':
					pontosDeControle[5] = pontoDeControle2[i];
					r4.setPontoDeControle(pontoDeControle2[i]);
					r4.ativaPontoDeControle(ula.getValor());

					break;
				case 'g':
					pontosDeControle[6] = pontoDeControle2[i];
					ir.setPontoDeControle(pontoDeControle2[i]);
					ir.ativaPontoDeControle(ula.getValor());
					
					memoria.atualizaPosicao();
					
					break;
				case 'h':
					pontosDeControle[7] = pontoDeControle2[i];
					rDado.setPontoDeControle(pontoDeControle2[i]);
					conteudoMemoria = conversor.binarioParaInteiro(memoria.obtemDadoBacking(rEnd.getValor()));

					valorMux = mux.ativaPontoDeControle(conteudoMemoria,ula.getValor());

					rDado.ativaPontoDeControle(valorMux);
					break;
				case 'i':
					pontosDeControle[8] = pontoDeControle2[i];
					rEnd.setPontoDeControle(pontoDeControle2[i]);
       				rEnd.ativaPontoDeControle(ula.getValor());

					break;
				case 'j':
					pontosDeControle[9] = pontoDeControle2[i];
					mux.setPontoDeControle(pontoDeControle2[i]);
					break;
				case 'k':
					pontosDeControle[10] = pontoDeControle2[i];
					muxA.setPontoDeControle(pontoDeControle2[i]);
					break;
				case 'l':
					pontosDeControle[11] = pontoDeControle2[i];
					muxA.setPontoDeControle2(pontoDeControle2[i]);
					setULA(true);
					break;
				case 'm':
					pontosDeControle[12] = pontoDeControle2[i];
					muxB.setPontoDeControle(pontoDeControle2[i]);
					break;
				case 'n':
					pontosDeControle[13] = pontoDeControle2[i];
					muxB.setPontoDeControle2(pontoDeControle2[i]);
					break;
				case 'o':
					pontosDeControle[14] = pontoDeControle2[i];
					muxB.setPontoDeControle3(pontoDeControle2[i]);
					setULA(false);
					break;
				case 'p':
					pontosDeControle[15] = pontoDeControle2[i];
					ula.setPontoDeControle1(pontoDeControle2[i]);
					break;
				case 'q':
					pontosDeControle[16] = pontoDeControle2[i];
					ula.setPontoDeControle2(pontoDeControle2[i]);
					break;
				case 'r':
					pontosDeControle[17] = pontoDeControle2[i];
					ula.setPontoDeControle3(pontoDeControle2[i]);
					break;
				case 's':
					pontosDeControle[18] = pontoDeControle2[i];
					ula.setPontoDeControle4(pontoDeControle2[i]);
					break;
				case 't':
					pontosDeControle[19] = pontoDeControle2[i];
					ula.setPontoDeControle5(pontoDeControle2[i]);
					break;
				case 'u':
					pontosDeControle[20] = pontoDeControle2[i];
					ula.setPontoDeControle6(pontoDeControle2[i]);
					ula.ativaPontoDeControle();
					break;
				case 'v':
					pontosDeControle[21] = pontoDeControle2[i];
					memoria.setPontoDeControle(pontoDeControle2[i]);
					memoria.ativaPontoDeControle(rEnd.getValor());
					painelBaixo.setTextoLabelPercentagemCache(getCache().getPorcentagemAcerto());
					painelBaixo.setTextoLabelLocalBusca(getLocalBusca());
					break;
				case 'w':
					pontosDeControle[22] = pontoDeControle2[i];
					rx.setPontoDeControle(pontoDeControle2[i]);
					rx.ativaPontoDeControle(ula.getValor());
					break;
				case 'x':
					pontosDeControle[23] = pontoDeControle2[i];
					ry.setPontoDeControle(pontoDeControle2[i]);
					ry.ativaPontoDeControle(ula.getValor());
			}
		}
		atualizaPainel();	
		
		if(gerador.proximoEndereco(microinstrucao.getProximo(), memoria.getCodigo()).equals(Constantes.INSTRUCAO_HALT)){
			halt = true;
		}
		
		if(gerador.proximoEndereco(microinstrucao.getProximo(), memoria.getCodigo()).equals(Constantes.REND_RECEBE_RY)){
			memoria.setLer(false);
		}
		
		ativaPontoDeControle(memoriaDeControle.getMemoriaDeControle().get(conversor.binarioParaInteiro(gerador.proximoEndereco(microinstrucao.getProximo(), memoria.getCodigo()))));
	}

	
	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public Registrador getR0() {
		return r0;
	}

	public void setR0(Registrador r0) {
		this.r0 = r0;
	}

	public Registrador getR1() {
		return r1;
	}

	public void setR1(Registrador r1) {
		this.r1 = r1;
	}

	public Registrador getR2() {
		return r2;
	}

	public void setR2(Registrador r2) {
		this.r2 = r2;
	}

	public Registrador getR3() {
		return r3;
	}

	public void setR3(Registrador r3) {
		this.r3 = r3;
	}

	public Registrador getR4() {
		return r4;
	}

	public void setR4(Registrador r4) {
		this.r4 = r4;
	}

	public MemoriaDeControle getMemoriaDeControle() {
		return memoriaDeControle;
	}

	public void setMemoriaDeControle(MemoriaDeControle memoriaDeControle) {
		this.memoriaDeControle = memoriaDeControle;
	}

	public ULA getUla() {
		return ula;
	}

	public void setUla(ULA ula) {
		this.ula = ula;
	}
	
	public boolean[] getPontosDeControle(){
		//boolean[] pontosDeControle = {r0.isPontoDeControle(), r1.isPontoDeControle(), pc.isPontoDeControle(), r2.isPontoDeControle(), r3.isPontoDeControle(), r4.isPontoDeControle(), ir.isPontoDeControle(), rDado.isPontoDeControle(), rEnd.isPontoDeControle(), mux.isPontoDeControle(), muxA.isPontoDeControle(), muxA.isPontoDeControle2(), muxB.isPontoDeControle(), muxB.isPontoDeControle2(), muxB.isPontoDeControle3(), ula.isPontoDeControle1(), ula.isPontoDeControle2(), ula.isPontoDeControle3(), ula.isPontoDeControle4(), ula.isPontoDeControle5(), ula.isPontoDeControle6(), memoria.isPontoDeControle(), rx.isPontoDeControle(), ry.isPontoDeControle()};
		return pontosDeControle;
	}
	
	public void atualizaPainel(){
		mostraPontosDeControle();
		atualizaRegistradores();
		ulaGrafica.atualizarConteudo();
		painelBaixo.atualizarConteudo();
		rodarThread.travaThread();
	}
	
	public void mostraPontosDeControle(){
		boolean[] pontosDeControle;
		pontosDeControle = getPontosDeControle();
		if(pontosDeControle[0]){
			System.out.println("a:"+1);
		}else{
			System.out.println("a:"+0);
		}
		if(pontosDeControle[1]){
			System.out.println("b:"+1);
		}else{
			System.out.println("b:"+0);
		}
		if(pontosDeControle[2]){
			System.out.println("c:"+1);
		}else{
			System.out.println("c:"+0);
		}
		if(pontosDeControle[3]){
			System.out.println("d:"+1);
		}else{
			System.out.println("d:"+0);
		}
		if(pontosDeControle[4]){
			System.out.println("e:"+1);
		}else{
			System.out.println("e:"+0);
		}
		if(pontosDeControle[5]){
			System.out.println("f:"+1);
		}else{
			System.out.println("f:"+0);
		}
		if(pontosDeControle[6]){
			System.out.println("g:"+1);
		}else{
			System.out.println("g:"+0);
		}
		if(pontosDeControle[7]){
			System.out.println("h:"+1);
		}else{
			System.out.println("h:"+0);
		}
		if(pontosDeControle[8]){
			System.out.println("i:"+1);
		}else{
			System.out.println("i:"+0);
		}
		if(pontosDeControle[9]){
			System.out.println("j:"+1);
		}else{
			System.out.println("j:"+0);
		}
		if(pontosDeControle[10]){
			System.out.println("k:"+1);
		}else{
			System.out.println("k:"+0);
		}
		if(pontosDeControle[11]){
			System.out.println("l:"+1);
		}else{
			System.out.println("l:"+0);
		}
		if(pontosDeControle[12]){
			System.out.println("m:"+1);
		}else{
			System.out.println("m:"+0);
		}
		if(pontosDeControle[13]){
			System.out.println("n:"+1);
		}else{
			System.out.println("n:"+0);
		}
		if(pontosDeControle[14]){
			System.out.println("o:"+1);
		}else{
			System.out.println("o:"+0);
		}
		if(pontosDeControle[15]){
			System.out.println("p:"+1);
		}else{
			System.out.println("p:"+0);
		}
		if(pontosDeControle[16]){
			System.out.println("q:"+1);
		}else{
			System.out.println("q:"+0);
		}
		if(pontosDeControle[17]){
			System.out.println("r:"+1);
		}else{
			System.out.println("r:"+0);
		}
		if(pontosDeControle[18]){
			System.out.println("s:"+1);
		}else{
			System.out.println("s:"+0);
		}
		if(pontosDeControle[19]){
			System.out.println("t:"+1);
		}else{
			System.out.println("t:"+0);
		}
		if(pontosDeControle[20]){
			System.out.println("u:"+1);
		}else{
			System.out.println("u:"+0);
		}
		if(pontosDeControle[21]){
			System.out.println("v:"+1);
		}else{
			System.out.println("v:"+0);
		}
		if(pontosDeControle[22]){
			System.out.println("w:"+1);
		}else{
			System.out.println("w:"+0);
		}
		if(pontosDeControle[23]){
			System.out.println("x:"+1);
		}else{
			System.out.println("x:"+0);
		}
		
		//System.out.println(pontosDeControle[0]);
		ulaGrafica.setA(pontosDeControle[0]);
		ulaGrafica.setB(pontosDeControle[1]);
		ulaGrafica.setC(pontosDeControle[2]);
		ulaGrafica.setD(pontosDeControle[3]);
		ulaGrafica.setE(pontosDeControle[4]);
		ulaGrafica.setF(pontosDeControle[5]);
		ulaGrafica.setG(pontosDeControle[6]);
		ulaGrafica.setH(pontosDeControle[7]);
		ulaGrafica.setI(pontosDeControle[8]);
		ulaGrafica.setJ(pontosDeControle[9]);
		ulaGrafica.setK(pontosDeControle[10]);
		ulaGrafica.setL(pontosDeControle[11]);
		ulaGrafica.setM(pontosDeControle[12]);
		ulaGrafica.setN(pontosDeControle[13]);
		ulaGrafica.setO(pontosDeControle[14]);
		ulaGrafica.setP(pontosDeControle[15]);
		ulaGrafica.setQ(pontosDeControle[16]);
		ulaGrafica.setR(pontosDeControle[17]);
		ulaGrafica.setS(pontosDeControle[18]);
		ulaGrafica.setT(pontosDeControle[19]);
		ulaGrafica.setU(pontosDeControle[20]);
		ulaGrafica.setV(pontosDeControle[21]);
		ulaGrafica.setW(pontosDeControle[22]);
		ulaGrafica.setXx(pontosDeControle[23]);
		for(int i = 0; i < pontosDeControle.length;i++){
			pontosDeControle[i] = false;
		}
	}
	
	public void atualizaRegistradores(){
		if(isHexa){
			System.out.println("RDados :" + getRDado().getValor());
			System.out.println("R0 :" + getR0().getValor());
			System.out.println("R1 :" + getR1().getValor());
			System.out.println("R2 :" + getR2().getValor());
			System.out.println("R3 :" + getR3().getValor());
			System.out.println("R4 :" + getR4().getValor());
			System.out.println("RX :" + getRx().getValor());
			System.out.println("RY :" + getRy().getValor());
			System.out.println("REnd :" + getREnd().getValor());
			System.out.println("PC :" + getPc().getValor());
			System.out.println("IR :" + getIr().getValor());
			
			ulaGrafica.setRdados(String.valueOf(getRDado().getValor()));
			ulaGrafica.setReg0(String.valueOf(getR0().getValor()));
			ulaGrafica.setReg1(String.valueOf(getR1().getValor()));
			ulaGrafica.setReg2(String.valueOf(getR2().getValor()));
			ulaGrafica.setReg3(String.valueOf(getR3().getValor()));
			ulaGrafica.setReg4(String.valueOf(getR4().getValor()));
			ulaGrafica.setRegX(String.valueOf(getRx().getValor()));
			ulaGrafica.setRegY(String.valueOf(getRy().getValor()));
			ulaGrafica.setRend(String.valueOf(getREnd().getValor()));
			ulaGrafica.setPc(String.valueOf(getPc().getValor()));
			ulaGrafica.setIr(String.valueOf(getIr().getValor()));
		}else{
			System.out.println("RDados :" + Long.toHexString(getRDado().getValor()));
			System.out.println("R0 :" + Long.toHexString(getR0().getValor()));
			System.out.println("R1 :" + Long.toHexString(getR1().getValor()));
			System.out.println("R2 :" + Long.toHexString(getR2().getValor()));
			System.out.println("R3 :" + Long.toHexString(getR3().getValor()));
			System.out.println("R4 :" + Long.toHexString(getR4().getValor()));
			System.out.println("RX :" + Long.toHexString(getRx().getValor()));
			System.out.println("RY :" + Long.toHexString(getRy().getValor()));
			System.out.println("REnd :" + Long.toHexString(getREnd().getValor()));
			System.out.println("PC :" + Long.toHexString(getPc().getValor()));
			System.out.println("IR :" + Long.toHexString(getIr().getValor()));
			
			ulaGrafica.setRdados(Long.toHexString(getRDado().getValor()));
			ulaGrafica.setReg0(Long.toHexString(getR0().getValor()));
			ulaGrafica.setReg1(Long.toHexString(getR1().getValor()));
			ulaGrafica.setReg2(Long.toHexString(getR2().getValor()));
			ulaGrafica.setReg3(Long.toHexString(getR3().getValor()));
			ulaGrafica.setReg4(Long.toHexString(getR4().getValor()));
			ulaGrafica.setRegX(Long.toHexString(getRx().getValor()));
			ulaGrafica.setRegY(Long.toHexString(getRy().getValor()));
			ulaGrafica.setRend(Long.toHexString(getREnd().getValor()));
			ulaGrafica.setPc(Long.toHexString(getPc().getValor()));
			ulaGrafica.setIr(Long.toHexString(getIr().getValor()));
		}

	}
	
	/*public void buscaInstrucao(){

		ativaPontoDeControle(memoriaDeControle.rEndRecebePC());

		ativaPontoDeControle(memoriaDeControle.rDadoRecebeInformacaoLida());

		ativaPontoDeControle(memoriaDeControle.irRecebeRDado());

	}*/

	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {

		this.modo = modo;
	}

	public Registrador getPc() {
		return pc;
	}

	public MemoriaCache getCache() {
		return cache;
	}

	public Conversor getConversor() {
		return conversor;
	}

	public Registrador getIr() {
		return ir;
	}

	public Multiplexador getMux() {
		return mux;
	}

	public Multiplexador getMuxA() {
		return muxA;
	}

	public Multiplexador getMuxB() {
		return muxB;
	}

	public Registrador getRDado() {
		return rDado;
	}

	public Registrador getREnd() {
		return rEnd;
	}

	public Registrador getRx() {
		return rx;
	}

	public Registrador getRy() {
		return ry;
	}

	public void setUlaGrafica(view.PainelULA ulaGrafica) {
		this.ulaGrafica = ulaGrafica;
	}

	public void setPainelBaixo(view.PainelBaixo painelBaixo) {
		this.painelBaixo = painelBaixo;
	}
	
	public void zeraPontosDeControle(){
		
		for(int i = 0; i < pontosDeControle.length;i++){
			pontosDeControle[i] = false;
		}
		
	}
	
	public void zeraPontosDeControleGrafico(){
		
		for(int i = 0; i < pontosDeControle.length;i++){
			pontosDeControle[i] = false;
		}
		
		ulaGrafica.setA(pontosDeControle[0]);
		ulaGrafica.setB(pontosDeControle[1]);
		ulaGrafica.setC(pontosDeControle[2]);
		ulaGrafica.setD(pontosDeControle[3]);
		ulaGrafica.setE(pontosDeControle[4]);
		ulaGrafica.setF(pontosDeControle[5]);
		ulaGrafica.setG(pontosDeControle[6]);
		ulaGrafica.setH(pontosDeControle[7]);
		ulaGrafica.setI(pontosDeControle[8]);
		ulaGrafica.setJ(pontosDeControle[9]);
		ulaGrafica.setK(pontosDeControle[10]);
		ulaGrafica.setL(pontosDeControle[11]);
		ulaGrafica.setM(pontosDeControle[12]);
		ulaGrafica.setN(pontosDeControle[13]);
		ulaGrafica.setO(pontosDeControle[14]);
		ulaGrafica.setP(pontosDeControle[15]);
		ulaGrafica.setQ(pontosDeControle[16]);
		ulaGrafica.setR(pontosDeControle[17]);
		ulaGrafica.setS(pontosDeControle[18]);
		ulaGrafica.setT(pontosDeControle[19]);
		ulaGrafica.setU(pontosDeControle[20]);
		ulaGrafica.setV(pontosDeControle[21]);
		ulaGrafica.setW(pontosDeControle[22]);
		ulaGrafica.setXx(pontosDeControle[23]);
		
	}

	public void setContinuar(boolean continuar) {

		this.continuar = continuar;
	}

	public boolean isContinuar() {
		return continuar;
	}

	public void setRodarThread(RodarThread rodarThread) {
		this.rodarThread = rodarThread;
		ula.setRodarThread(rodarThread);
	}
	
	public boolean isRodaThread() {
		return rodaThread;
	}

	public void setRodaThread(boolean rodaThread) {
		this.rodaThread = rodaThread;
	}

	public view.PainelBaixo getPainelBaixo() {
		return painelBaixo;
	}
	
	public void zeraRegistradores(){
		getRDado().setValor(0);
		getR0().setValor(0);
		getR1().setValor(0);
		getR2().setValor(0);
		getR3().setValor(0);
		getR4().setValor(0);
		getRx().setValor(0);
		getRy().setValor(0);
		getREnd().setValor(0);
		getPc().setValor(0);
		getIr().setValor(0);
		
		ulaGrafica.setRdados(String.valueOf(getRDado().getValor()));
		ulaGrafica.setReg0(String.valueOf(getR0().getValor()));
		ulaGrafica.setReg1(String.valueOf(getR1().getValor()));
		ulaGrafica.setReg2(String.valueOf(getR2().getValor()));
		ulaGrafica.setReg3(String.valueOf(getR3().getValor()));
		ulaGrafica.setReg4(String.valueOf(getR4().getValor()));
		ulaGrafica.setRegX(String.valueOf(getRx().getValor()));
		ulaGrafica.setRegY(String.valueOf(getRy().getValor()));
		ulaGrafica.setRend(String.valueOf(getREnd().getValor()));
		ulaGrafica.setPc(String.valueOf(getPc().getValor()));
		ulaGrafica.setIr(String.valueOf(getIr().getValor()));
		
	}
	
	public void paraThreads(){
		rodarThread.paraThread();
	}
	
	public String getLocalBusca(){
		if(getCache().isAcessoBacking() == true){
			return "Busca realizada na backing";
		}
		return "Busca realizada na cache";
	}

	public boolean isHexa() {
		return isHexa;
	}

	public void setHexa(boolean isHexa) {
		this.isHexa = isHexa;
	}

	public boolean isHalt() {
		return halt;
	}
	
}
