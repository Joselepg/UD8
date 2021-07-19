/**
 * @author Jose Luis Padilla Gonzalez
 * @version 14-07-2021
 */
public class Electrodomestico {
	protected final double PRECIOBASE=100;
	protected final String COLOR="blanco";
	protected final char CONSUMO='F';
	protected final double PESO=5;
	protected double preciobase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	
	public Electrodomestico(){
		this.preciobase=PRECIOBASE;
		this.color=COLOR;
		this.consumo=CONSUMO;
		this.peso=PESO;
	}
	
	public Electrodomestico(double preciobase, double peso){

		this.preciobase=preciobase;
		this.color=COLOR;
		this.consumo=CONSUMO;
		this.peso=peso;
	}
	
	public Electrodomestico(double preciobase, String color, char consumo, double peso) {
		
		this.preciobase=preciobase;
		this.color=ComprovadorColor(color);
		this.consumo=consumo;
		this.peso=ComprovadorConsumo(consumo);
	}
	
	public static String ComprovadorColor (String color) {
		color=color.toLowerCase();
		String resultadoColor="";
		switch(color) {
		case "blanco":
			resultadoColor="blanco";
			break;
		case "negro":
			resultadoColor="negro";
			break;
		case "rojo":
			resultadoColor="rojo";
			break;
		case "azul":
			resultadoColor="azul";
			break;
		case "gris":
			resultadoColor="gris";
			break;
		}
		return resultadoColor;
	}
	public static char ComprovadorConsumo (char consumo) {
		char resultadoConsumo=' ';
		switch(consumo) {
		case 'A':
			resultadoConsumo='A';
			break;
		case 'B':
			resultadoConsumo='B';
			break;
		case 'C':
			resultadoConsumo='C';
			break;
		case 'D':
			resultadoConsumo='D';
			break;
		case 'E':
			resultadoConsumo='E';
			break;
		case 'F':
			resultadoConsumo='F';
			break;
		}
		return resultadoConsumo;
	}
}
