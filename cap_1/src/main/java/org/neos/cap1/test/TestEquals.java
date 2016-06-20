package org.neos.cap1.test;
import org.neos.cap1.business.IPersona;
import org.neos.cap1.domain.Persona;

public class TestEquals {

    public static void main(String[] args){

        IPersona persona1= new Persona("HUGO","hhugohm@gmail.com",39);
        IPersona persona2= new Persona("HECTOR","hhugohm@hotmail.com",39);
        IPersona persona3= new Persona("HECTOR","hhugohm@hotmail.com",39);

        System.out.println(persona1==persona2);
        System.out.println(persona1.equals(persona2));
        System.out.println(persona2.equals(persona3) +
                                          " hashCode2: " + persona2.hashCode()+
                                          " hashCode3: " + persona3.hashCode());

    }

}
