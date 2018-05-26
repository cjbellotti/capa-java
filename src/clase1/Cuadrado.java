package clase1;

public class Cuadrado extends Figura {

	private float x;
	private float y;
	
	public Cuadrado(float px, float py) {
		x = px;
		y = py;
	}
	
	@Override
	public float getArea() {
		return x * y;
	}
}
