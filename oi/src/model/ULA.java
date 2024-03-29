package model;

import controller.Conversor;
import controller.RodarThread;

public class ULA{
	
	private boolean pontoDeControle1, pontoDeControle2, pontoDeControle3, pontoDeControle4, pontoDeControle5, pontoDeControle6;
	private Integer c, z, n, o;
	private long valor, a, b;
	private Conversor conversor;
	private RodarThread rodarThread;
	
	public long getValor() {
		return valor;
	}
     
	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public ULA(boolean pontoDeControle1, boolean pontoDeControle2, boolean pontoDeControle3, boolean pontoDeControle4, boolean pontoDeControle5, boolean pontoDeControle6){
		this.pontoDeControle1 = pontoDeControle1;
		this.pontoDeControle2 = pontoDeControle2;
		this.pontoDeControle3 = pontoDeControle3;
		this.pontoDeControle4 = pontoDeControle4;
		this.pontoDeControle5 = pontoDeControle5;
		this.pontoDeControle6 = pontoDeControle6;
		c = 0;
		z = 0;
		n = 0;
		o = 0;
		conversor = new Conversor();
	}

	public long getA() {
		return a;
	}

	public void setA(long a) {
		this.a = a;
	}

	public long getB() {
		return b;
	}

	public void setB(long b) {
		this.b = b;
	}

	public boolean isPontoDeControle1() {
		return pontoDeControle1;
	}

	public void setPontoDeControle1(boolean pontoDeControle1) {
		this.pontoDeControle1 = pontoDeControle1;
	}

	public boolean isPontoDeControle2() {
		return pontoDeControle2;
	}

	public void setPontoDeControle2(boolean pontoDeControle2) {
		this.pontoDeControle2 = pontoDeControle2;
	}

	public boolean isPontoDeControle3() {
		return pontoDeControle3;
	}

	public void setPontoDeControle3(boolean pontoDeControle3) {
		this.pontoDeControle3 = pontoDeControle3;
	}

	public boolean isPontoDeControle4() {
		return pontoDeControle4;
	}

	public void setPontoDeControle4(boolean pontoDeControle4) {
		this.pontoDeControle4 = pontoDeControle4;
	}

	public boolean isPontoDeControle5() {
		return pontoDeControle5;
	}

	public void setPontoDeControle5(boolean pontoDeControle5) {
		this.pontoDeControle5 = pontoDeControle5;
	}

	public boolean isPontoDeControle6() {
		return pontoDeControle6;
	}

	public void setPontoDeControle6(boolean pontoDeControle6) {
		this.pontoDeControle6 = pontoDeControle6;
	}
	
	public void ativaPontoDeControle(){
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			A();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			B();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			aMais1();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			aMaisB();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			aMenosB();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			aAndB();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			aOrB();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			aShiftLeft();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			aShiftRight();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			bShiftLeft();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			bShiftRight();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			zera();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			aNegacao();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			bNegacao();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			bMenosA();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			notA();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			notB();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			bMais1();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			aXorB();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			aMenos1();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			bMenos1();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			brz();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			brn();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			brl();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			brg();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			brc();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			brnz();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			brnn();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			brnc();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			bro();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			brno();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			jmp();
		}
		
		pontoDeControle1 = false;
		pontoDeControle2 = false;
		pontoDeControle3 = false;
		pontoDeControle4 = false;
		pontoDeControle5 = false;
		pontoDeControle6 = false;
	}
	
	public void A(){
		valor = a;
	}
	
	public void B(){
		
		valor = b;
	}
	
	public void aMais1(){
		valor = a+1;
	}
	
	public void aMaisB(){
		valor = conversor.valorOverflow(a+b);
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		String s1 = Long.toBinaryString(a), s2 = Long.toBinaryString(b);
		int i = 0;
		
		if(a>=0){
			s1 = "00000000000000000000000000000000";
		}
		else{
			s1 = s1.substring(16);
		}
		
		if(b>=0){
			s2 = "00000000000000000000000000000000";
		}
		else{
			s2 = s2.substring(16);
		}
		
		for(int j = 15; j>=0; j--){
			if(Long.parseLong(s1.substring(j, j+1)) + Long.parseLong(s2.substring(j, j+1)) + i >= 2){
				i = 1;
			}
			else{
				i = 0;
			}
		}
		
		if(i == 1){
			c = 1;
		}
		else{
			c = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		verificaOverflow();
	}
	
	public void aMenosB(){
		valor = a-b;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		if(a<0){
			a = -a;
		}
		
		if(b<0){
			b = -b;
		}
		
		if(b>a){
			c = 1;
		}
		else{
			c = 0;
		}
		
		verificaOverflow();
	}
	
	public void aAndB(){
		valor = a&b;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		c = 0;
		
		o = 0;
	}
	
	public void aOrB(){
		valor = a|b;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		c = 0;
		
		o = 0;
	}
	
	public void aShiftLeft(){
		valor = a<<1;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		if((a & 0x8000) == 0x8000){
			c = 1;
		}
		else{
			c = 0;
		}
		
		verificaOverflow();
	}
	
	public void aShiftRight(){
		valor = a>>1;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		if(a %2 == 1){
			c = 1;
		}
		else{
			c = 0;
		}
		
		verificaOverflow();
	}
	
	public void bShiftLeft(){
		valor = b<<1;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		if((b & 0x8000) == 0x8000){
			c = 1;
		}
		else{
			c = 0;
		}
		
		verificaOverflow();
	}
	
	public void bShiftRight(){
		valor = b>>1;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		if(b % 2 == 1){
			c = 1;
		}
		else{
			c = 0;
		}
		
		verificaOverflow();
	}
	
	public void zera(){
		valor = 0;
	}
	
	public void aNegacao(){
		valor = -a;
	}
	
	public void bNegacao(){
		valor = -b;
	}
	
	public void bMenosA(){
		valor = b - a;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		if(a<0){
			a = -a;
		}
		
		if(b<0){
			b = -b;
		}
		
		if(b>a){
			c = 1;
		}
		else{
			c = 0;
		}
		
		verificaOverflow();
	}
	
	public void notA(){
		valor = ~a;
	}
	
	public void notB(){
		valor = ~b;
	}
	
	public void bMais1(){
		valor = b+1;
	}
	
	public void aXorB(){
		valor = a ^ b;
		
		if(valor < 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		if(valor == 0){
			z = 1;
		}
		else{
			z = 0;
		}
		
		c = 0;
		
		o = 0;
	}
	
	public void aMenos1(){
		valor = a-1;
	}
	
	public void bMenos1(){
		valor = b-1;
	}
	
	public void brz(){
		if(z == 1){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brn(){
		if(n == 1){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brg(){
		if(n*o + (1-n)*(1-o) == 1){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brl(){
		if(n*(1-o) + (1-n)*o == 1){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brc(){
		if(c == 1){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brnz(){
		if(z == 0){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brnn(){
		if(n == 0){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brnc(){
		if(c == 0){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void jmp(){
		//System.out.println("CHEGUEI A JUMPAR");
		valor = rodarThread.getValorDesvio();
		if(valor == -1){
			//System.out.println("DEU ERRADO :/");
			valor = b+1;
		}//else{
		//	System.out.println("PSEUDO DEU CERTO");
		//}
		//System.out.println("VALOR FINAL : "+valor);
	}
	
	public void zeraPSW(){
		setO(0);
		setZ(0);
		setC(0);
		setN(0);
	}

	public void setC(Integer c) {
		this.c = c;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public void setO(Integer o) {
		this.o = o;
	}
	
	public void bro(){
		if(o == 1){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}
	
	public void brno(){
		if(o == 0){
			valor = rodarThread.getValorDesvio();
			if(valor == -1){
				valor = b+1;
			}
		}
		else{
			rodarThread.atualizaPosicao();
			valor = b+1;
		}
	}

	public Integer getC() {
		return c;
	}

	public Integer getN() {
		return n;
	}

	public Integer getO() {
		return o;
	}

	public Integer getZ() {
		return z;
	}
	
	public void setRodarThread(RodarThread rodarThread){
		this.rodarThread = rodarThread;
	}
	
	public void verificaOverflow(){
		if(valor > Constantes.LIMITE_CONSTANTE){
			o = 1;
			valor = conversor.valorOverflow(valor);
		}
		else{
			o = 0;
		}
	}
}
