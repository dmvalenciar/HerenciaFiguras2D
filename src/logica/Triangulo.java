package logica;


public class Triangulo extends Figuras2D {
	
	private float base;
	private float altura;

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		area=(base*altura)/2;
		return area;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		perimetro=3*base;
		return perimetro;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	
}
