package comunicacion;

public class Alfabeto extends Pictograma{
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] l,String interpretacion) {
		super(origen);
		Alfabeto.letras=l;
		this.interpretacion = interpretacion;
	}

	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
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
		String aux="";
		int c=0;
		for (String a : letras) {
			if(c==letras.length-1) {
				aux+=a;
			}
			else{
				aux+=a+", ";
				c+=1;
			}
		}
		return aux;
	}
	public static int cantidadLetras() {
		return letras.length;
	}
	
}
