/**
 * @author Jose Luis Padilla Gonzalez
 * @version 14-07-2021
 */
public class Serie {
	protected String titulo;
	protected int numTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	public Serie() {
		this.titulo="";
		this.numTemporadas=3;
		this.entregado=false;
		this.genero="";
		this.creador="";
	}
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.numTemporadas=3;
		this.entregado=false;
		this.genero="";
		this.creador=creador;
	}
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo=titulo;
		this.numTemporadas=numTemporadas;
		this.entregado=false;
		this.genero=genero;
		this.creador=creador;
	}
}
