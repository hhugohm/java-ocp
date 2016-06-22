package org.neos.cap1.nested;

/**
 Member inner classes
*/
public class Outer2 {
	

	private String greeting= "HOLA ";

	//puede ser public private, protected o default
	//puede ser abstract o final
	public abstract class Inner {
		public int repeat = 3;
		//no se puden declarar metodos ni variables static
		//public static String mensaje=" MUNDO ";
		public void go(){
			for(int i= 0;i<repeat;i++){
				System.out.println(greeting);
			}
		}
	}
	public final class  InnerExtendida extends Inner{
		private String greeting= " JAVA ";

		public void go(){
			System.out.println(greeting);
			super.go();
		}

	}

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		InnerExtendida innerExt = outer.new InnerExtendida();
		innerExt.go();

		
	}

}