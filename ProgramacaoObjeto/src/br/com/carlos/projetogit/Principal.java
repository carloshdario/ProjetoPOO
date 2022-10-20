package br.com.carlos.projetogit;

public class Principal {

	public static void main(String[] args) {
		
		
		
		ClasseConta objetoConta1 = new ClasseConta(); //Instancia o Objeto 
		
		objetoConta1.atributoPessoaConta = new Pessoa();
		objetoConta1.atributoPessoaConta.atributoNome = "Vitor Hugo";
		objetoConta1.atributoNumeroConta = 1234;
		objetoConta1.metodoDepositar(45000.00);
		System.out.println(objetoConta1.atributoPessoaConta.atributoNome);
		System.out.println(objetoConta1.atributoNumeroConta);
		System.out.println(objetoConta1.atributoSaldoConta);
		

		ClasseConta objetoConta2 = new ClasseConta(); //Instancia o Objeto 
		objetoConta2.atributoPessoaConta = new Pessoa();
		objetoConta2.atributoPessoaConta.atributoNome = "Handreya";
		objetoConta2.atributoNumeroConta = 12345;
		objetoConta2.metodoDepositar(1.00);
		
		System.out.println(objetoConta2.atributoPessoaConta.atributoNome);
		System.out.println(objetoConta2.atributoNumeroConta);
		System.out.println(objetoConta2.atributoSaldoConta);
	}

}
