package br.com.fiap;

import br.com.fiap.exception.DivisaoPorZeroException;

public class TestException {

	public static void main(String[] args) throws DivisaoPorZeroException {
		
		try {
			int val = 10 / 0;
			System.out.println(val);
		} catch (Exception e) {
			
			throw new DivisaoPorZeroException();
			
		}

	}

}
