package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Alfabeto extends Pictograma{
	private static List<String> letras= new ArrayList<>();
	private String interpretacion;
	
	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}

	public static List<String> getLetras() {
		return letras;
	}

	public static void setLetras(List<String> letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		 return interpretacion;
	 }
	public String toString() {
		String aux=null;
		int c=0;
		for (String a : letras) {
			if(c==letras.size()) {
				aux+=a;
				c+=1;
			}
			else{
				aux+=a+" , ";
				c+=1;
			}
		}
		return aux;
	}
	public static int cantidadLetras() {
		return letras.size();
	}

	
	
}
