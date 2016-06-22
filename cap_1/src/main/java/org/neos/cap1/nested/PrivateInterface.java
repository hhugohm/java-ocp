package org.neos.cap1.nested;

public class PrivateInterface {
	
	private interface Secret {
		void shh();

		public static void miMetodoStatic(){
			System.out.println("En el metodo static- inner classes");
		}
		public default void mensajeMetoth(String mensaje){
			System.out.println("HOLA MUNDO " +mensaje);
		}
	}
	public class DontTell implements Secret{

		public void shh(){
			System.out.println("No le digas a la interface");
		}
	}

	public static void main(String args[]){
		PrivateInterface privateInterface= new PrivateInterface();
		Secret secret = privateInterface.new DontTell();

		secret.shh();
		Secret.miMetodoStatic();
		secret.mensajeMetoth("JAVA");

	}

}