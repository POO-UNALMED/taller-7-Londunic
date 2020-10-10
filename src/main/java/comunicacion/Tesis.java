package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Tesis extends Escrito{
	private String idea;
	private static List<String> argumentos= new ArrayList<>();
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public static int getArgumentos() {
		return argumentos.size();
	}
	public static void setArgumentos(List<String> argumentos) {
		Tesis.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
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
		return getOrigen()+"\n"+
				getTitulo()+"\n"+
				getAutor()+"\n"+
				getPaginas()+"\n"+
				idea+"\n"+
				conclusion+"\n"+
				referencias;
	}
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*palabrasPagina*5;
	}

}
