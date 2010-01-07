	package controller;
	
import model.Constantes;
import model.Memoria;
import model.MemoriaCache;
import model.MemoriaDeControle;
import model.Microinstrucao;
import model.Multiplexador;
import model.Registrador;
import model.ULA;
	
	public class Arquitetura {
	
	/*private Registrador r0, r1, r2, r3, r4, rx, ry, pc, rDado, rEnd, ir;
	private Multiplexador mux, muxA, muxB;
	private Memoria memoria;
	private ULA ula;
	private MemoriaDeControle memoriaDeControle;
	private int modo;
	private Conversor conversor;
	*/
	public view.ULA ulaGrafica;
	public Registrador r0, r1, r2, r3, r4, rx, ry, pc, rDado, rEnd, ir;
	public Multiplexador mux, muxA, muxB;
	public Memoria memoria;
	public MemoriaCache cache;
	public ULA ula;
	public MemoriaDeControle memoriaDeControle;
	public int modo;
	public Conversor conversor;
		
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
		modo = Constantes.RODAPROGRAMA;
		conversor = new Conversor();
		ulaGrafica = new view.ULA();
	}
	
	public void setULA(boolean multiplexador){
		if(multiplexador){
			System.out.println("Setando o A");
			ula.setA(muxA.ativaPontoDeControle(rDado.getValor(), r0.getValor(), r1.getValor(), rx.getValor()));
			System.out.println("Depois de setar o A"  + ula.getA());
		}
		else{
			System.out.println("Setando o B");
			System.out.println("RY na ula: "+ry.getValor());
			ula.setB(muxB.ativaPontoDeControle(r2.getValor(), r3.getValor(), r4.getValor(), ry.getValor(), pc.getValor()));
			System.out.println("Depois de setar o B"  + ula.getB());
		}
	}
	
	
	public void ativaPontoDeControle(Microinstrucao microinstrucao){
		char[] pontoDeControle = microinstrucao.getPontoDeControle();
		boolean[] pontoDeControle2 = microinstrucao.getPontoDeControle2();
		int conteudoMemoria,valorMux;
		
		//System.out.println("REND : "+ rEnd.getValor());
		for(int i = 0; i < pontoDeControle.length; i++)
		{
			System.out.println(memoria.getDado(0));
			
			//System.out.println("REND : "+ rEnd.getValor());
			
			switch(pontoDeControle[i]){
				case 'a':
					r0.setPontoDeControle(pontoDeControle2[i]);
					r0.ativaPontoDeControle(ula.getValor());
					System.out.println("R0:" + r0.getValor());
					break;
				case 'b':
					r1.setPontoDeControle(pontoDeControle2[i]);
					r1.ativaPontoDeControle(ula.getValor());
					System.out.println("R1:" + r1.getValor());
					break;
				case 'c':
					pc.setPontoDeControle(pontoDeControle2[i]);
					pc.ativaPontoDeControle(ula.getValor());
					break;
				case 'd':
					r2.setPontoDeControle(pontoDeControle2[i]);
					r2.ativaPontoDeControle(ula.getValor());
					System.out.println("R2:" + r2.getValor());
					break;
				case 'e':
					r3.setPontoDeControle(pontoDeControle2[i]);
					r3.ativaPontoDeControle(ula.getValor());
					System.out.println("R3:" + r3.getValor());
					break;
				case 'f':
					r4.setPontoDeControle(pontoDeControle2[i]);
					r4.ativaPontoDeControle(ula.getValor());
					System.out.println(ula.getValor());
					System.out.println("R4:" + r4.getValor());
					break;
				case 'g':
					ir.setPontoDeControle(pontoDeControle2[i]);
					ir.ativaPontoDeControle(ula.getValor());
					break;
				case 'h':
					rDado.setPontoDeControle(pontoDeControle2[i]);
					conteudoMemoria = conversor.binarioParaInteiro(memoria.obtemDadoBacking(rEnd.getValor()));
					System.out.println("CONTEUDOMEMORIA:"+conteudoMemoria);
					valorMux = mux.ativaPontoDeControle(conteudoMemoria,ula.getValor());
					System.out.println("VALOR MUX :"+valorMux);
					rDado.ativaPontoDeControle(valorMux);
					break;
				case 'i':
					rEnd.setPontoDeControle(pontoDeControle2[i]);
					rEnd.ativaPontoDeControle(ula.getValor());
					break;
				case 'j':
					mux.setPontoDeControle(pontoDeControle2[i]);
					//conteudoMemoria = conversor.binarioParaInteiro(memoria.getDado(rEnd.getValor()));
					//mux.ativaPontoDeControle(conteudoMemoria,ula.getValor());
					break;
				case 'k':
					muxA.setPontoDeControle(pontoDeControle2[i]);
					break;
				case 'l':
					muxA.setPontoDeControle2(pontoDeControle2[i]);
					setULA(true);
					break;
				case 'm':
					muxB.setPontoDeControle(pontoDeControle2[i]);
					break;
				case 'n':
					muxB.setPontoDeControle2(pontoDeControle2[i]);
					break;
				case 'o':
					muxB.setPontoDeControle3(pontoDeControle2[i]);
					setULA(false);
					//System.out.println(ula.getB());
					//System.out.println(ula.getValor());
					break;
				case 'p':
					ula.setPontoDeControle1(pontoDeControle2[i]);
					break;
				case 'q':
					ula.setPontoDeControle2(pontoDeControle2[i]);
					break;
				case 'r':
					ula.setPontoDeControle3(pontoDeControle2[i]);
					break;
				case 's':
					ula.setPontoDeControle4(pontoDeControle2[i]);
					break;
				case 't':
					ula.setPontoDeControle5(pontoDeControle2[i]);
					break;
				case 'u':
					ula.setPontoDeControle6(pontoDeControle2[i]);
					ula.ativaPontoDeControle();
					System.out.println(ula.getValor());
					break;
				case 'v':
					memoria.setPontoDeControle(pontoDeControle2[i]);
					System.out.println("REND pra mem"+rEnd.getValor());
					memoria.ativaPontoDeControle(rEnd.getValor());
					break;
				case 'w':
					rx.setPontoDeControle(pontoDeControle2[i]);
					rx.ativaPontoDeControle(ula.getValor());
					break;
				case 'x':
					ry.setPontoDeControle(pontoDeControle2[i]);
					ry.ativaPontoDeControle(ula.getValor());
			}
		}
		//System.out.println("Modo : "+ modo);
		if(modo == Constantes.RODAMICRO){
			mostraPontosDeControle();
		}
		
	}

	
	/*public void teste(){
	soma3(r3, r4);
	System.out.println(r4.getValor());*/
	
	/*ativaPontoDeControle(memoriaDeControle.rEndRecebePC());
	ativaPontoDeControle(memoriaDeControle.rDadoRecebeInformacaoLida());
	ativaPontoDeControle(memoriaDeControle.irRecebeRDado());
	ativaPontoDeControle(memoriaDeControle.rEndRecebePCMais1());
	ativaPontoDeControle(memoriaDeControle.rDadoRecebeInformacaoLida());
	ativaPontoDeControle(memoriaDeControle.r2RecebeRDado());
	ativaPontoDeControle(memoriaDeControle.r0MenosR2());
	ativaPontoDeControle(memoriaDeControle.atualizaPC());
	
	System.out.println(r0.getValor());*/
	//}

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
		boolean[] pontosDeControle = {r0.isPontoDeControle(), r1.isPontoDeControle(), pc.isPontoDeControle(), r2.isPontoDeControle(), r3.isPontoDeControle(), r4.isPontoDeControle(), ir.isPontoDeControle(), rDado.isPontoDeControle(), rEnd.isPontoDeControle(), mux.isPontoDeControle(), muxA.isPontoDeControle(), muxA.isPontoDeControle2(), muxB.isPontoDeControle(), muxB.isPontoDeControle2(), muxB.isPontoDeControle3(), ula.isPontoDeControle1(), ula.isPontoDeControle2(), ula.isPontoDeControle3(), ula.isPontoDeControle4(), ula.isPontoDeControle5(), ula.isPontoDeControle6(), memoria.isPontoDeControle(), rx.isPontoDeControle(), ry.isPontoDeControle()};
		
		return pontosDeControle;
	}
	
	public void mostraPontosDeControle(){
		boolean[] pontosDeControle;
		pontosDeControle = getPontosDeControle();
		System.out.println(pontosDeControle[0]);
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
		//ulaGrafica.setXx(pontosDeControle[23]);
		ulaGrafica.setXx(true);
		//for
		//System.out.println(pontosDeControle);
	}
	
	public void buscaInstrucao(){
		//System.out.println("Primeiro na busca");
		ativaPontoDeControle(memoriaDeControle.rEndRecebePC());
		//System.out.println("Segundo na busca");
		ativaPontoDeControle(memoriaDeControle.rDadoRecebeInformacaoLida());
		//System.out.println("Terceiro na busca");
		ativaPontoDeControle(memoriaDeControle.irRecebeRDado());
		//System.out.println("Final da busca");
	}

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
	
}
