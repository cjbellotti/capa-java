package clase1;

public class MainClase {

	public static void main(String[] args) {
		MiPrimerClase p = new MiPrimerClase();
		p.setNombre("Jose");
		String juan = p.getNombre();
		System.out.println(juan);
		
		Calculadora c = new Calculadora(10);
		
		c.sumar(10);
		System.out.println(c.getResultado());
		c.restar(5);
		System.out.println(c.getResultado());
		c.multiplicar(6);
		System.out.println(c.getResultado());
		
		HolaRendererConAdmiracion r = new HolaRendererConAdmiracion();
		Mansaje m = new Mansaje();
		m.setRenderer(r);
		m.saludar("Claudio");
	}

}
