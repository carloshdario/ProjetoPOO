package br.com.carlos.projetogit;

public class ClasseConta {
	
	int atributoNumeroConta; // 0
	double atributoSaldoConta; // 0.0
	Pessoa atributoPessoaConta;
	
	void metodoDepositar(double parametroValor) {
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * 0.1);
		
	}
	

}
