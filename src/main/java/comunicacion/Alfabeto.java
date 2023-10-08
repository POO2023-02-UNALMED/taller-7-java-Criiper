package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	
	private static ArrayList<String> letras = new ArrayList<>();
	private String interpretacion;
	
	public Alfabeto(String origen, ArrayList<String> letras, String interpretacion) {
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
	public static ArrayList<String> getLetras() {
		return letras;
	}
	public static void setLetras(ArrayList<String> letras) {
		Alfabeto.letras = letras;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString(){
		String cadena = "";
		for(int i = 0; i < Alfabeto.letras.size(); i++) {
			if(i < Alfabeto.letras.size() - 1) {
			cadena += Alfabeto.letras.get(i) + ", ";
			}
			else {
				cadena += Alfabeto.letras.get(i);
			}
		}
		return cadena;
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.size();
	}
	
}




