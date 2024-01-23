package br.com.fiap.entity;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente {
	
	protected double saldo;
	public static final int BANCO = 33;
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}

	public double verificarSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
