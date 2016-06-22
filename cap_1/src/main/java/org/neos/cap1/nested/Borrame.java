package org.neos.cap1.nested;

public interface Borrame {
	
	void shh();

	public static void miMetodoStatic(){
			System.out.println("En el metodo static- inner classes");
	}
	public default void mensajeMetoth(String mensaje){
			System.out.println("HOLA MUNDO " +mensaje);
	} 

}