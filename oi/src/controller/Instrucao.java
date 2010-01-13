package controller;

import model.Constantes;
import model.Registrador;

public class Instrucao extends Thread{
	
	private Arquitetura arquitetura;
	private boolean sair;
 
	public Instrucao(){
		arquitetura = new Arquitetura();
		sair = false;
	}
	
	Instrucao(Arquitetura arquitetura){
		this.arquitetura = arquitetura;
		sair = false;
	}
	
	public void soma1(Registrador destino){
		
		//System.out.println("R0 1:"+arquitetura.getR0().getValor());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		//System.out.println("R0 2:"+arquitetura.getR0().getValor());		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());	
		//System.out.println("PC : "+arquitetura.pc.getValor());
		//System.out.println("REND :"+arquitetura.rEnd.getValor());
		
		if(destino == arquitetura.getR0()){
			//System.out.println("R0 3:"+arquitetura.getR0().getValor());
			//System.out.println("RDados:"+arquitetura.rDado.getValor());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			//System.out.println("RDados depois :"+arquitetura.rDado.getValor());
			//System.out.println("R0 4:"+arquitetura.getR0().getValor());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			//System.out.println("RY:"+arquitetura.ry.getValor());
			//System.out.println("R0 5:"+arquitetura.getR0().getValor());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MaisRY());
			//System.out.println("R0 6:"+arquitetura.getR0().getValor());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MaisRY());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MaisRX());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MaisRX());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MaisRX());
		}
		//System.out.println("PC ANTES : "+arquitetura.getPc().getValor());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		//System.out.println("PC DEPOIS : "+arquitetura.getPc().getValor());
		//System.out.println("R0 No FInal:"+arquitetura.getR0().getValor());
		//System.out.println("R1 No FInal:"+arquitetura.getR1().getValor());
	}
	
	public void soma2(Registrador enderecoDestino){	
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}

		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisRX());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisRX());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisRY());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisRY());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisRY());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void soma3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MaisRY());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MaisR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MaisR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MaisR0());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MaisRY());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MaisR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MaisR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MaisR1());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MaisR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MaisR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MaisRX());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MaisRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MaisR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MaisR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MaisRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MaisRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MaisR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MaisR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MaisRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MaisRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void soma4(Registrador fonte, Registrador enderecoDestino){
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	}
	
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.getMemoria().setLer(true);
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void soma5(Registrador enderecoFonte, Registrador destino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			}
			
			if(destino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MaisRY());
			}
			if(destino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MaisRY());
			}
			if(destino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MaisRX());
			}
			if(destino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MaisRX());
			}
			if(destino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MaisRX());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void soma6(Registrador enderecoFonte, Registrador enderecoDestino){
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}
		
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			
			if(enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisRX());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYMaisRX());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisRY());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisRY());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXMaisRY());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void subtracao1(Registrador destino){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());		
		
		if(destino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosRY());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosRY());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void subtracao2(Registrador enderecoDestino){
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
		
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosRY());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosRY());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void subtracao3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosRY());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR0());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosRY());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR1());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR0());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
	}
	
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void subtracao4(Registrador fonte, Registrador enderecoDestino){
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR0());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR1());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void subtracao5(Registrador enderecoFonte, Registrador destino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosRY());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR0());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR0());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR0());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosRY());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR1());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR1());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR1());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR2());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR2());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR3());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR3());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR4());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR4());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void subtracao6(Registrador enderecoFonte, Registrador enderecoDestino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
		if(enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
		
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosRY());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR0());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR0());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR0());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosRY());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosR1());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosR1());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosR1());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4MenosRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0MenosR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1MenosR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2MenosRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3MenosRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void move1(Registrador destino){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());				
		
		if(destino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
			//System.out.println("MOV:" + arquitetura.getR1().getValor());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void move2(Registrador enderecoDestino){
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
		}

		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.getMemoria().setLer(true);
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void move3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR0());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR1());
	//System.out.println("Moveu:" + arquitetura.getR4().getValor());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR2());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR3());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR4());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void move4(Registrador fonte, Registrador enderecoDestino){
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			}
			
			if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRY());
			}
			if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
			if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.getMemoria().setLer(true);
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeRX());
			}
		
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void move5(Registrador enderecoFonte, Registrador destino){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR1());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR1());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR1());
		//System.out.println("Moveu:" + arquitetura.getR4().getValor());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR4());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR4());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR4());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR4());
		}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void move6(Registrador enderecoFonte, Registrador enderecoDestino){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR0());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR1());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR1());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR1());
		//System.out.println("Moveu:" + arquitetura.getR4().getValor());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR2());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR3());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR4());
		}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void comparacao1(Registrador destino){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());		
		
		if(destino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaRY());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaRY());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void comparacao2(Registrador enderecoDestino){
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
			}
			
			if(enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaRY());
			}
			if(enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaRY());
			}
			if(enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
			}
			if(enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
			}
			if(enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void comparacao3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaRY());
	
	//System.out.println("COMPARA" + arquitetura.getUla().getN() + " " + arquitetura.getUla().getValor());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR2());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR3());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR4());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaRY());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR2());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR3());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR4());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR0());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR1());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR0());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR1());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR0());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR1());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void comparacao4(Registrador fonte, Registrador enderecoDestino){
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaRY());
		
		//System.out.println("COMPARA" + arquitetura.getUla().getN() + " " + arquitetura.getUla().getValor());
		}
		if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR2());
		}
		if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR3());
		}
		if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR4());
		}
		if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaRY());
		}
		if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR2());
		}
		if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR3());
		}
		if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR4());
		}
		if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR0());
		}
		if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR1());
		}
		if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
		}
		if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
		}
		if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR0());
		}
		if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR1());
		}
		if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
		}
		if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
		}
		if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR0());
		}
		if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR1());
		}
		if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
		}
		if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
		}
	
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void comparacao5(Registrador enderecoFonte, Registrador enderecoDestino){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaRY());
		
		//System.out.println("COMPARA" + arquitetura.getUla().getN() + " " + arquitetura.getUla().getValor());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR2());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR3());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR4());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaRY());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR2());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR3());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR4());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR0());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR1());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR0());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR1());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR0());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR1());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
		}
		
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void comparacao6(Registrador enderecoFonte, Registrador enderecoDestino){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaRY());
		
		//System.out.println("COMPARA" + arquitetura.getUla().getN() + " " + arquitetura.getUla().getValor());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR2());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR3());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ComparaR4());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaRY());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR2());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR3());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ComparaR4());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR0());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaR1());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR0());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaR1());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR0());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaR1());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ComparaRX());
		}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void and1(Registrador destino){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());				
		
		if(destino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndRY());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndRY());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
			//System.out.println(arquitetura.getR4().getValor());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void and2(Registrador enderecoDestino){
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
			}
			
			if(enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndRY());
			}
			if(enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndRY());
			}
			if(enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
			}
			if(enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
			}
			if(enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void and3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndRY());
	
		//System.out.println("AND " + arquitetura.getUla().getValor());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR0());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndRY());
	
	//System.out.println("AND " + arquitetura.getUla().getValor());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR1());
	//System.out.println(arquitetura.getUla().getValor());
	//System.out.println("AND:" + arquitetura.getR4().getValor());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void and4(Registrador fonte, Registrador enderecoDestino){
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR0());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR1());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void and5(Registrador enderecoFonte, Registrador destino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndRY());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR0());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR0());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR0());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndRY());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR1());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR1());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR1());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR2());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR2());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR3());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR3());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR4());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR4());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void and6(Registrador enderecoFonte, Registrador enderecoDestino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndRY());
	}
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR0());
	}
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR0());
	}
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR0());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndRY());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndR1());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndR1());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndR1());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR2());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR2());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR3());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR3());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4AndRX());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0AndR4());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1AndR4());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2AndRX());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3AndRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void or1(Registrador destino){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());			
		
		if(destino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrRY());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrRY());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void or2(Registrador enderecoDestino){
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
			}
			if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
			}
			
			if(enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrRY());
			}
			if(enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrRY());
			}
			if(enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
			}
			if(enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
			}
			if(enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void or3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrRY());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR0());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrRY());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR1());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void or4(Registrador fonte, Registrador enderecoDestino){
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR0());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR1());
	//System.out.println("OR: " + arquitetura.getUla().getValor());
	
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void or5(Registrador enderecoFonte, Registrador destino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
			
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
		
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrRY());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR0());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR0());
	}
	if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR0());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrRY());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR1());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR1());
	}
	if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR1());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR2());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR2());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR3());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR3());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR4());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR4());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void or6(Registrador enderecoFonte, Registrador enderecoDestino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrRY());
	}
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR0());
	}
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR0());
	}
	if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR0());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrRY());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrR1());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrR1());
	}
	if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrR1());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR2());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR2());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR3());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR3());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4OrRX());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0OrR4());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1OrR4());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2OrRX());
	}
	if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3OrRX());
	}
	
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void not1(Registrador fonte){
			if(fonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Not());
			}
			if(fonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Not());
			}
			if(fonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Not());
			}
			if(fonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Not());
			}
			if(fonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Not());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void not2(Registrador enderecoFonte){
		if(enderecoFonte == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
			}
		
			if(enderecoFonte == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Not());
			}
			if(enderecoFonte == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Not());
			}
			if(enderecoFonte == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Not());
			}
			if(enderecoFonte == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Not());
			}
			if(enderecoFonte == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Not());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void limpa1(Registrador fonte){
		
	if(fonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Zera());
	}
	if(fonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Zera());
	}
	if(fonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Zera());
	}
	if(fonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Zera());
	}
	if(fonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Zera());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void limpa2(Registrador enderecoFonte){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Zera());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Zera());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Zera());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Zera());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Zera());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void negacao1(Registrador fonte){
	if(fonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Negacao());
	}
	if(fonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Negacao());
	}
	if(fonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Negacao());
	}
	if(fonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Negacao());
	}
	if(fonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Negacao());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void negacao2(Registrador enderecoFonte){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Negacao());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Negacao());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Negacao());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Negacao());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Negacao());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void deslocamentoEsquerda1(Registrador fonte){
	if(fonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ShiftLeft());
	}
	if(fonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ShiftLeft());
	}
	if(fonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ShiftLeft());
	}
	if(fonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ShiftLeft());
	}
	if(fonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ShiftLeft());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void deslocamentoEsquerda2(Registrador enderecoFonte){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ShiftLeft());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ShiftLeft());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ShiftLeft());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ShiftLeft());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ShiftLeft());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void deslocamentoDireita1(Registrador fonte){
	if(fonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ShiftRight());
	}
	if(fonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ShiftRight());
	}
	if(fonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ShiftRight());
	}
	if(fonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ShiftRight());
	}
	if(fonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ShiftRight());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void deslocamentoDireita2(Registrador enderecoFonte){
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(enderecoFonte == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0ShiftRight());
	}
	if(enderecoFonte == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1ShiftRight());
	}
	if(enderecoFonte == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2ShiftRight());
	}
	if(enderecoFonte == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3ShiftRight());
	}
	if(enderecoFonte == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4ShiftRight());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	/*public void desvioCondicional1(){
		if(arquitetura.getUla().isZ()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
			
			//System.out.println("Zero");
		}
	}
	
	public void desvioCondicional2(){
		if(arquitetura.getUla().isN()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		}
	}
	
	public void desvioCondicional3(){
		if((!arquitetura.getUla().isN())&&(arquitetura.getUla().isZ())&&(!arquitetura.getUla().isC())){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		}
	}
	
	public void desvioCondicional4(){
		if((!arquitetura.getUla().isN())&&(!arquitetura.getUla().isZ())&&(!arquitetura.getUla().isC())){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		}
	}
	
	public void desvioCondicional5(){
		if((arquitetura.getUla().isN())&&(!arquitetura.getUla().isZ())&&(arquitetura.getUla().isC())){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		}
	}
	
	public void desvioCondicional6(){
		if(arquitetura.getUla().isC()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		}
	}
	
	public void desvioCondicional7(){
		if(!arquitetura.getUla().isZ()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		
		}
	}
	
	public void desvioCondicional8(){
		if(!arquitetura.getUla().isN()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		
		}
	}
	
	public void desvioCondicional9(){
		if(!arquitetura.getUla().isC()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		
		}
	}
	
	public void desvioCondicional10(){
		if(arquitetura.getUla().isO()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		
		}
	}
	
	public void desvioCondicional11(){
		if(!arquitetura.getUla().isO()){
			String binario = arquitetura.getMemoria().obtemDadoBacking(arquitetura.getMemoria().getPosicaoAtual()+1);
			int label = conversor.binarioParaInteiro(binario);
			
			arquitetura.getMemoria().setPosicaoAtual(arquitetura.getMemoria().getPosicaoLabel(label));
		
		}
	}*/
	
	public void desvioCondicional1(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brz());
	}
	
	public void desvioCondicional2(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brn());
	}
	
	public void desvioCondicional3(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brz());
	}
	
	public void desvioCondicional4(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brl());
	}
	
	public void desvioCondicional5(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brg());
	}
	
	public void desvioCondicional6(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brc());
	}
	
	public void desvioCondicional7(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brnz());
	}
	
	public void desvioCondicional8(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brnn());
	}
	
	public void desvioCondicional9(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brnc());
	}
	
	public void desvioCondicional10(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().bro());
	}
	
	public void desvioCondicional11(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().brno());
	}
	
	public void desvioIncondicional(){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().jump());
	}
	
	public void xor1(Registrador destino){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());		
		
		if(destino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorRY());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorRY());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void xor2(Registrador enderecoDestino){	
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}

		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorRY());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorRY());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void xor3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorRY());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR0());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR0());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorRY());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR1());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR1());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void xor4(Registrador fonte, Registrador enderecoDestino){
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR0());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR0());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR1());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR1());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
	}
	
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void xor5(Registrador enderecoFonte, Registrador destino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorRY());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR0());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR0());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR0());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorRY());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR1());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR1());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR1());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR2());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR2());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR3());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR3());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR4());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR4());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void xor6(Registrador enderecoFonte, Registrador enderecoDestino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
		if(enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
		
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorRY());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR0());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR0());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR0());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorRY());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorR1());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorR1());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorR1());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4XorRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0XorR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1XorR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2XorRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3XorRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void test1(Registrador destino){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePC());		
		
		if(destino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestRY());
		}
		if(destino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestRY());
		}
		if(destino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
		}
		if(destino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
		}
		if(destino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void test2(Registrador enderecoDestino){	
		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}

		if(enderecoDestino == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestRY());
		}
		if(enderecoDestino == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestRY());
		}
		if(enderecoDestino == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
		}
		if(enderecoDestino == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
		}
		if(enderecoDestino == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebePCMais1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeRDado());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void test3(Registrador fonte, Registrador destino){
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestRY());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
	}
	if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestRY());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
	}
	if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
	}
	if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
	}
	if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
	}
	if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
	}
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void test4(Registrador fonte, Registrador enderecoDestino){
	if(enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
	}
	if(enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
	}
	
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestRY());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
	}
	if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestRY());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
	}
	if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
	}
	if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
	}
	if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
	}
	if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
	}
	
	
	arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void test5(Registrador enderecoFonte, Registrador destino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestRY());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
		}
		if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestRY());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
		}
		if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
		}
		if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
		}
		if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
		}
		if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void test6(Registrador enderecoFonte, Registrador enderecoDestino){
		if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
	
		if(enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
		
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestRY());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
		}
		if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestRY());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
		}
		if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR2());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
		}
		if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR3());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
		}
		if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4TestRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0TestR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1TestR4());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2TestRX());
		}
		if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3TestRX());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
	
	public void incrementa1(Registrador fonte){
		if(fonte == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Incrementa());
		}
		if(fonte == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Incrementa());
		//System.out.println("INC:" + arquitetura.getUla().getValor());
		}
		if(fonte == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Incrementa());
		}
		if(fonte == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Incrementa());
		}
		if(fonte == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Incrementa());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		}
		
		public void incrementa2(Registrador enderecoFonte){
		if(enderecoFonte == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
		}
		if(enderecoFonte == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
		}
		
		if(enderecoFonte == arquitetura.getR0()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Incrementa());
		}
		if(enderecoFonte == arquitetura.getR1()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Incrementa());
		}
		if(enderecoFonte == arquitetura.getR2()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Incrementa());
		}
		if(enderecoFonte == arquitetura.getR3()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Incrementa());
		}
		if(enderecoFonte == arquitetura.getR4()){
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Incrementa());
		}
		
		arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
		
		public void decrementa1(Registrador fonte){
			if(fonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Decrementa());
			}
			if(fonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Decrementa());
			}
			if(fonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Decrementa());
			}
			if(fonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Decrementa());
			}
			if(fonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Decrementa());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
			}
			
			public void decrementa2(Registrador enderecoFonte){
			if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
			}
			if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
			}
			
			if(enderecoFonte == arquitetura.getR0()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0Decrementa());
			}
			if(enderecoFonte == arquitetura.getR1()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1Decrementa());
			}
			if(enderecoFonte == arquitetura.getR2()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2Decrementa());
			}
			if(enderecoFonte == arquitetura.getR3()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3Decrementa());
			}
			if(enderecoFonte == arquitetura.getR4()){
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4Decrementa());
			}
			
			arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		}
			
		public void xchg1(Registrador fonte, Registrador destino){
			
			//System.out.println("XCHG");
			
			if(fonte == arquitetura.getR0() && destino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
				}
				if(fonte == arquitetura.getR0() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
				}
				if(fonte == arquitetura.getR0() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
				}
				if(fonte == arquitetura.getR0() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
				}
				if(fonte == arquitetura.getR1() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
				}
				if(fonte == arquitetura.getR1() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
				}
				if(fonte == arquitetura.getR1() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
				}
				if(fonte == arquitetura.getR1() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
				}
				if(fonte == arquitetura.getR2() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(fonte == arquitetura.getR2() && destino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(fonte == arquitetura.getR2() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
				}
				if(fonte == arquitetura.getR2() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
				}
				if(fonte == arquitetura.getR3() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(fonte == arquitetura.getR3() && destino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(fonte == arquitetura.getR3() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
				}
				if(fonte == arquitetura.getR3() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
				}
				if(fonte == arquitetura.getR4() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(fonte == arquitetura.getR4() && destino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(fonte == arquitetura.getR4() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
				}
				if(fonte == arquitetura.getR4() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
				}
				
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
		}
		
		public void xchg2(Registrador fonte, Registrador enderecoDestino){
				if(enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
				}
				
				if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
				}
				if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
				}
				if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
				}
				if(fonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
				}
				if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
				}
				if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
				}
				if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
				}
				if(fonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
				}
				if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
				}
				if(fonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
				}
				if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
				}
				if(fonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
				}
				if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
				}
				if(fonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
				}
				
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
				}
				
				public void xchg3(Registrador enderecoFonte, Registrador destino){
				if(enderecoFonte == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
				}
				

				if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR0() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR1() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
				}
				if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR2() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR3() && destino == arquitetura.getR4()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR0()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR2()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR2());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
				}
				if(enderecoFonte == arquitetura.getR4() && destino == arquitetura.getR3()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR3());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
				}
				
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
				}
				
				public void xchg4(Registrador enderecoFonte, Registrador enderecoDestino){
				if(enderecoFonte == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
				}
				if(enderecoFonte == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
				}
				
				if(enderecoDestino == arquitetura.getR0()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR0());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR1()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR1());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR2()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR2());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR3()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR3());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRDado());
				}
				if(enderecoDestino == arquitetura.getR4()){
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rEndRecebeR4());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rDadoRecebeInformacaoLida());
				arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRDado());
				}
				
				if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR1()){
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR2()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR3()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR0() && enderecoDestino == arquitetura.getR4()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR0()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR0());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeR1());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR2()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR3()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR1() && enderecoDestino == arquitetura.getR4()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rYRecebeR1());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRY());
					}
					if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR0()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR0());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR1()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR1());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR3()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR2() && enderecoDestino == arquitetura.getR4()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR0()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR0());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR1()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR1());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR2()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR3() && enderecoDestino == arquitetura.getR4()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR0()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR0());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r0RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR1()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR1());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r1RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR2()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR2());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r2RecebeRX());
					}
					if(enderecoFonte == arquitetura.getR4() && enderecoDestino == arquitetura.getR3()){
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().rXRecebeR4());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r4RecebeR3());
						arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().r3RecebeRX());
					}
					
					arquitetura.ativaPontoDeControle(arquitetura.getMemoriaDeControle().atualizaPC());
	}
				
	public void travaThread(){
		if(arquitetura.getModo() == Constantes.RODAMICRO){
			try {				
				//System.out.println("RODAMICRO");
				while (!arquitetura.isContinuar() && !sair) {// interrompe a thread
					//System.out.println("ESTOU NO LOOP");
					sleep(1000 / 80);
					//AdministraView.getView().setStatus("Esperando ...");
				}
				arquitetura.setContinuar(false);
				sair = false;
				//if (arquitetura.isContinuar()){
				//	loop = true;
				//}
				System.out.println("SAINDO DA INSTRUCAO");
			} catch (Exception e) {
				System.out.println("Erro na Thread Instrucoes");
			}
		}
		
		/*while(loop){
			System.out.println("FOR");
			while(!arquitetura.isContinuar()){
				System.out.println("WHILE");
				try{
					System.out.println("SLEEP");
					sleep(1000);
					//Thread.currentThread().sleep(1000);
				}catch(Exception e){}
				//arquitetura.setContinuar(true);
			}
			System.out.println("IF "+arquitetura.isContinuar());
			if (arquitetura.isContinuar()) {
				System.out.println("NUNCA ENTREI AQUI");
				loop = false;
			}
		}
		loop = true;*/
	}
	
	public void setSair(boolean sair){
		this.sair = sair;
	}
}
