package clase1;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] a) {
		System.out.println("Hola Mundo!!!! ");
		int a1=123;
		long l1 = 123l;
		System.out.println("Este es un entero " + a1);
		float f1 = 123.53f;
		double d1 = 123.53d;
		System.out.println("Este es un decimal " + f1);
		String texto = "Pepe";
		System.out.println("Hola \"" + texto + "\"");
		System.out.printf("Hola \"%s\" - El numero es: %d\n", texto, a1);
		System.out.printf("%s\n", texto);
		String textoFormateado = String.format("Hola \"%s\" - El numero es: %d\n", texto, a1);
		System.out.println(textoFormateado);
		
		int numero = 1;
		boolean flag = numero == 1;
		
		String t = (numero == 1) ? "Es uno" : "No es uno";
		
		if (!(numero == 1)) {
			System.out.println("No es uno");
		} else {
			System.out.println("Es uno");
		}
		
		for (int i = 10; i > 0; i--) {
			System.out.println("Iteracion " + i);
		}
		
		int x = 3;
		
		flag = true;
		while(flag) {
			if (x != 10) {
				System.out.println("Iteracion While " + x);
			} else {
				flag = false;
			}
			x++;
		}
		
		do {
			 System.out.println("Iteracion do while");
		} while(flag);
		
		int[] lista = {12, 56, 98};
		int[] lista100 = new int[100];
		
		for (int i = 0; i < lista100.length; i++)
			System.out.println(lista100[i]);
		
		lista100[0] = 1233;
		lista100 [ 19 ] = 8585;
		for (int i = 0; i < lista.length; i++) {
//			System.out.printf("lista[%d]=%d\n", i, lista[i]);
			System.out.println("lista[" + i + "]=" + lista[i]);
		}

		List<String> listaString = new LinkedList<String>();
		listaString.add("Pepe");
		listaString.add("Paco");
		listaString.add("Luis");
		for (int i = 0; i < listaString.size(); i++) {
			System.out.println(listaString.get(i));
		}
		
	}
}
