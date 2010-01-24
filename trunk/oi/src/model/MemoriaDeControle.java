package model;
 
public class MemoriaDeControle {
	private Microinstrucao microinstrucao;
	
	public Microinstrucao rEndRecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebePC(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'i', 'v'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rDadoRecebeInformacaoLida(){
		char[] pontoDeControle = {'j', 'h'};
		boolean[] pontoDeControle2 = {false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeRDado(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao irRecebeRDado(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'g'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao irRecebePC(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'g'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao atualizaPC(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rEndRecebePCMais1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c', 'i', 'v'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MaisR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0MaisR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MaisR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MaisRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		//boolean[] pontoDeControle2 = {false, true, false, false, true, true, false, false, false, true, true, true};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MaisR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1MaisR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MaisR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MaisRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMaisR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXMaisR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMaisR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMaisRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'}; 
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMaisR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMaisR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMaisRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MenosR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0MenosR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MenosR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0MenosRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MenosR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1MenosR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MenosR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',  'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1MenosRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMenosR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXMenosR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMenosR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXMenosRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2MenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3MenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o',  'k', 'l', 'p', 'q', 'r', 's', 't', 'u',  'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4MenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMenosR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMenosR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYMenosRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r4RecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeR0(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r4RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r4RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYRecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeRX(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXRecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeRY(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0AndR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0AndR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0AndR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0AndRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1AndR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1AndR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1AndR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1AndRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXAndR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXAndR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXAndR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXAndRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2AndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = { false, false, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2AndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2AndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = { false, false, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3AndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3AndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3AndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4AndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4AndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4AndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYAndR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = { false, true, true, false, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYAndR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYAndRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0OrR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0OrR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0OrR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0OrRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1OrR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1OrR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1OrR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1OrRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXOrR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXOrR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXOrR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXOrRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2OrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2OrR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2OrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3OrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3OrR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3OrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4OrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4OrR1(){
		char[] pontoDeControle = {'m', 'n', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4OrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYOrR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYOrR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYOrRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ComparaR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0ComparaR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ComparaR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ComparaRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ComparaR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1ComparaR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ComparaR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ComparaRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXComparaR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao rXComparaR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXComparaR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXComparaRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYComparaR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYComparaR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, true, false, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYComparaRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, true, true, true, false};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0RecebeR1(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1RecebeR0(){ 
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3RecebeR4(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeR2(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4RecebeR3(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Zera(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Zera(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXZera(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Zera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Zera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Zera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYZera(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ShiftLeft(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ShiftLeft(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXShiftLeft(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYShiftLeft(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0ShiftRight(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1ShiftRight(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXShiftRight(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2ShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3ShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4ShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYShiftRight(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'y'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Negacao(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Negacao(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXNegacao(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Negacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Negacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Negacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYNegacao(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'y'};
		boolean[] pontoDeControle2 = {false, true, true, false, false, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Not(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Not(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXNot(){
		char[] pontoDeControle = {'k','l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Not(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Not(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Not(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYNot(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0XorR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0XorR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0XorR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0XorRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1XorR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1XorR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1XorR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1XorRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXXorR2(){
      char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
      boolean[] pontoDeControle2 = {true, true, false, false, false, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }

  public Microinstrucao rXXorR3(){
      char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
      boolean[] pontoDeControle2 = {true, true, false, false, true, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
  
  public Microinstrucao rXXorR4(){
      char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
      boolean[] pontoDeControle2 = {true, true, false, true, false, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
	
	public Microinstrucao rXXorRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2XorR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2XorR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2XorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3XorR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3XorR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3XorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4XorR0(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4XorR1(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4XorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYXorR0(){
      char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'v'};
      boolean[] pontoDeControle2 = {false, true, true, false, true, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
  
  public Microinstrucao rYXorR1(){
      char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'v'};
      boolean[] pontoDeControle2 = {false, true, true, true, false, false, true, false, false, true, false, true};
      
      microinstrucao.setPontoDeControle(pontoDeControle);
      microinstrucao.setPontoDeControle2(pontoDeControle2);
      return microinstrucao;
  }
	
	public Microinstrucao rYXorRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, true, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0TestR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r0TestR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0TestR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0TestRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1TestR2(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}

	public Microinstrucao r1TestR3(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, false, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1TestR4(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1TestRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, false, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXTestRY(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {true, true, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2TestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = { false, false, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3TestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, false, true, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4TestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, false, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYTestRX(){
		char[] pontoDeControle = {'m', 'n', 'o', 'k', 'l', 'p', 'q', 'r', 's', 't', 'u'};
		boolean[] pontoDeControle2 = {false, true, true, true, true, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Incrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Incrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXIncrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, false, false, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Incrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Incrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Incrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYIncrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r0Decrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'a'};
		boolean[] pontoDeControle2 = {false, true, false, true, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r1Decrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'b'};
		boolean[] pontoDeControle2 = {true, false, false, true, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rXDecrementa(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		boolean[] pontoDeControle2 = {true, true, false, true, false, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r2Decrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'd'};
		boolean[] pontoDeControle2 = {false, false, false, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r3Decrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'e'};
		boolean[] pontoDeControle2 = {false, false, true, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao r4Decrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'f'};
		boolean[] pontoDeControle2 = {false, true, false, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao rYDecrementa(){
		char[] pontoDeControle = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'x'};
		boolean[] pontoDeControle2 = {false, true, true, false, true, false, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao jump(){
		char[] pontoDeControle = {'k', 'l', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, false, true, true, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brz(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, false, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brn(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, false, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brl(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, false, true, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brg(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brc(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brnz(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brnn(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, false, true, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brnc(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, true, false, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao bro(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, true, false, true, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
	
	public Microinstrucao brno(){
		char[] pontoDeControle = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'c'};
		boolean[] pontoDeControle2 = {false, false, true, false, false, false, true, true, true, true, false, true};
		
		microinstrucao.setPontoDeControle(pontoDeControle);
		microinstrucao.setPontoDeControle2(pontoDeControle2);
		return microinstrucao;
	}
}
