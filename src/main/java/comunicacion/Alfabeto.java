package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public static String[] getLetras() {
		return letras;
	}
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString(){
		String cadena = "";
		for(int i = 0; i < Alfabeto.letras.length; i++) {
			if(i < Alfabeto.letras.length - 1) {
			cadena += Alfabeto.letras[i]+ ", ";
			}
			else {
				cadena += Alfabeto.letras[i];
			}
		}
		return cadena;
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.length;
	}
	
}




