package br.com.fiap.view;

public class TestException {

	public static void main(String[] args) throws DivisaoPorZeroException {
		
//		try {
//			// Trecho onde a exceção pode ocorrer
//			int val = 10 / 0;
//			System.out.println(val);
//		} catch (Exception e) { // Captura da exceção
//			// Tratamento da exceção
//			e.printStackTrace();
//		}
		
		// Exceções Unchecked
		try {
			
//			int val = 10 / 0;
			
			int [] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
		//} catch (ArithmeticException e) {
		//	
		//	System.out.println("Não é possível realizar uma divisão por zero!");
		//	
		//	// Mensagem com a lista de erros
		//	System.out.println(e.getMessage());
		//	// Imprime a pilha de erro da exceção
		//	e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Não é possível acessar a posição 4 do array !");
			
		} catch (NullPointerException e) {
			
			System.out.println("Não foi possível retornar o length, variávelnome não intanciada !");
			
		} catch (NumberFormatException e) {
			
			System.out.println("Não foi possível realizar aconversão !");
			
		} catch (Exception e) {
			
			System.out.println("Erro na execução do programa!");
			
		} finally {
			System.out.println("Sempre passará aqui!");
		}

	}

}
