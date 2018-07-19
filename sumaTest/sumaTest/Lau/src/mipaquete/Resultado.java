package mipaquete;

public class Resultado {
	private int numeroUno= 5;
	private int numeroDos = 15;
		
	public int getNumeroUno() {
		return numeroUno;
	}
	public void setNumeroUno(int numeroUno) {
		this.numeroUno = numeroUno;
	}
	public int getNumeroDos() {
		return numeroDos;
	}
	public void setNumeroDos(int numeroDos) {
		this.numeroDos = numeroDos;
	}
	
	public int suma() {
		int a  = getNumeroUno();
		int b = getNumeroDos();
		
		int resultado = a+b;

		if (a>=0 && b >= 0)
		return resultado;
		return resultado;
		
	}
	
}
