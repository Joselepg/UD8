/**
 * @author Jose Luis Padilla Gonzalez
 * @version 14-07-2021
 */
public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	

	public Persona() {
	this.nombre="";
	this.edad=0;
	this.dni="";
	this.sexo='H';
	this.peso=0.0;
	this.altura=0.0;
	}

	public Persona (String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso=0.0;
		this.altura=0.0;
	}
	
	public Persona (String nombre, int edad ,String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso=peso;
		this.altura=altura;
	}

}
