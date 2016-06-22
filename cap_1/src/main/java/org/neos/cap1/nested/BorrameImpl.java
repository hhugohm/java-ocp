package org.neos.cap1.nested;

public class BorrameImpl implements Borrame {

	public void shh(){
			System.out.println("No le digas a la interface");
	}

	public static void main(String[] args) {
		new BorrameImpl().mensajeMetoth("JAVA");
		new BorrameImpl().shh();
		
	}
}