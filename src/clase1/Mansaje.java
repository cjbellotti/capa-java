package clase1;

public class Mansaje {

	private Renderer renderer;

	public void saludar(String nombre) {
		System.out.println(renderer.format(nombre));
	}
	
	public Renderer getRenderer() {
		return renderer;
	}

	public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}
	

}
