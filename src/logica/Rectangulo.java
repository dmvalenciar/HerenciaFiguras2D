package logica;


public class Rectangulo extends Figuras2D{
	
	private float base,altura;
	//private float altura;

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		area=base*altura;
		return area;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		perimetro= 2*base+2*altura;
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
