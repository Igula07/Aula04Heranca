package entidade;

import entidade.enums.Cores;

public class Conta { 

	private String nome;
	private int Numero;
	protected double Saldo;
	private Cores cor;
	
	

	public Conta(String nome, int numero, double saldo, Cores cor) {
		super();
		this.nome = nome;
		this.Numero = numero;
		this.Saldo = saldo;
		this.cor = cor;
	}

	public double depositar(double add) {
		return Saldo += add;
	}
	
	public double removerSaldo(double remover) {
		return Saldo -= remover + 5;
	}
	public double getSaldo() {
		return Saldo;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String agua() {
		// TODO Auto-generated method stub
		return null;
	}


	public String to() {
		return "Conta nome=" + nome + ", Numero=" + Numero + ", Saldo=" + Saldo + ", cor=" + cor + " " ;
	}


}
