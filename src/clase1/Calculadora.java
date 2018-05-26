package clase1;

public class Calculadora {

	private int resultado;
	
	public Calculadora(int valorInicial) {
		resultado = valorInicial;
	}
	
	public void sumar(int valor) {
		// cantidad = cantidad + valor
		resultado += valor;
	}
	
	public void restar(int valor) {
		resultado -= valor;
	}
	
	public void multiplicar(int valor) {
		resultado *= valor;
	}
	
	public int getResultado() {
		return resultado;
	}
}
