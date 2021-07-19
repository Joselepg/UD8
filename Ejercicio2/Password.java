/**
 * @author Jose Luis Padilla Gonzalez
 * @version 14-07-2021
 */
public class Password {
	private int longitud;
	private String contraseņa;
	
	public Password(){
		this.longitud=8;
		this.contraseņa="";
	}
	public Password(int longitud){
		this.longitud=longitud;
		String numRandom="";
		for(int i = 1; i<=longitud; i++) {
			int random= (int)Math.random()*(9-0+1)+0;
			numRandom+=(String.valueOf(random));
		}
		this.contraseņa=numRandom;
	}
}
