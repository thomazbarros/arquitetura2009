package model;

import controller.Conversor;

public class ULA{
	
	private boolean pontoDeControle1, pontoDeControle2, pontoDeControle3, pontoDeControle4, pontoDeControle5, pontoDeControle6;
	private Integer a, b, valor, c, z, n, o;
	private Conversor conversor;
	
	public Integer getValor() {
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

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
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
			//System.out.println("PASSA O A");
			A();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			//System.out.println("PASSA O B");
			B();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			//System.out.println("PASSA O A + 1");
			aMais1();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			//System.out.println("A MAIS B");
			//System.out.println("A: "+a);
			//System.out.println("B: "+b);
			aMaisB();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			//System.out.println("A MENOS B:");
			//System.out.println("A:" + a);
			//System.out.println("B:" + b);
			aMenosB();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(pontoDeControle6)){
			//System.out.println("AND:");
			//System.out.println("A:" + a);
			//System.out.println("B:" + b);
			aAndB();
			//System.out.println(valor);
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			aOrB();
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			aShiftLeft();
			//System.out.println("Shift:" + valor);
		}
		if((!pontoDeControle1)&&(!pontoDeControle2)&&(pontoDeControle3)&&(!pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			aShiftRight();
			//System.out.println("Shift:" + valor);
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
			//System.out.println("PASSA O B + 1");
			bMais1();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(!pontoDeControle6)){
			aXorB();
			//System.out.println("XOR:" + valor);
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(!pontoDeControle4)&&(pontoDeControle5)&&(pontoDeControle6)){
			aMenos1();
		}
		if((!pontoDeControle1)&&(pontoDeControle2)&&(!pontoDeControle3)&&(pontoDeControle4)&&(!pontoDeControle5)&&(!pontoDeControle6)){
			bMenos1();
		}
		
		pontoDeControle1 = false;
		pontoDeControle2 = false;
		pontoDeControle3 = false;
		pontoDeControle4 = false;
		pontoDeControle5 = false;
		pontoDeControle6 = false;
		
		if(z == 1){
			//System.out.println("Z");
		}
		if(n == 1){
			//System.out.println("N");
		}
		if(c == 1){
			//System.out.println("C");
		}
		if(o == 1){
			//System.out.println("O");
		}
		
		//System.out.println(valor);
	}
	
	public void A(){
		valor = a;
	}
	
	public void B(){
		//System.out.println("B");
		
		valor = b;
	}
	
	public void aMais1(){
		valor = a+1;
	}
	
	public void aMaisB(){
		valor = conversor.valorOverflow(a+b);
		
		if(valor <= 0){
			n = 1;
		}
		else{
			n = 0;
		}
		
		String s1 = Integer.toBinaryString(a), s2 = Integer.toBinaryString(b);
		int i = 0;
		
		if(a>=0){
			s1 = "0000000000000000";
		}
		else{
			s1 = s1.substring(16);
		}
		
		if(b>=0){
			s2 = "0000000000000000";
		}
		else{
			s2 = s2.substring(16);
		}
		
		for(int j = 15; j>=0; j--){
			if(Integer.parseInt(s1.substring(j, j+1)) + Integer.parseInt(s2.substring(j, j+1)) + i >= 2){
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
		
		if(Math.abs(a+b) > 16383){
			o = 1;
		}
		else{
			o = 0;
		}
	}
	
	public void aMenosB(){
		valor = a-b;
		
		if(valor <= 0){
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
		
		if(Math.abs(a-b) > 16383){
			o = 1;
		}
		else{
			o = 0;
		}
	}
	
	public void aAndB(){
		valor = a&b;
		
		if(valor <= 0){
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
		
		if(valor <= 0){
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
		
		if(Math.abs(a<<1) > 16383){
			o = 1;
		}
		else{
			o = 0;
		}
	}
	
	public void aShiftRight(){
		valor = a>>1;
		
		if(valor <= 0){
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
		
		if(Math.abs(a>>1) > 16383){
			o = 1;
		}
		else{
			o = 0;
		}
	}
	
	public void bShiftLeft(){
		valor = b<<1;
		
		if(valor <= 0){
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
		
		if(Math.abs(b<<1) > 16383){
			o = 1;
		}
		else{
			o = 0;
		}
	}
	
	public void bShiftRight(){
		valor = b>>1;
		
		if(valor <= 0){
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
		
		if(Math.abs(b>>1) > 16383){
			o = 1;
		}
		else{
			o = 0;
		}
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
		
		if(valor <= 0){
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
		
		if(Math.abs(b-a) > 16383){
			o = 1;
		}
		else{
			o = 0;
		}
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
		
		if(valor <= 0){
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
	
	public Integer getC2() {
		return 1-c;
	}

	public Integer getN2() {
		return 1-n;
	}

	public Integer getO2() {
		return 1-o;
	}

	public Integer getZ2() {
		return 1-z;
	}
}
