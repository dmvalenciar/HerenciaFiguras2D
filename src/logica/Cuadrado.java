package logica;


public class Cuadrado extends Figuras2D {
	
	private float lado;

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		area=lado*lado;
		return area;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		perimetro=4*lado;
		return perimetro;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
	
	
	
	

}
