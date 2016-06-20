package org.neos.cap1.domain;
import  org.neos.cap1.business.IPersona;

public class Persona implements IPersona {

  private String nombre;
  private String email;
  private int edad;
  public Persona(){
  }
  public Persona(String nombre,String email,int edad){
    this.nombre=nombre;
    this.email=email;
    this.edad=edad;
  }
  @Override
  public void miMetodo(){
      System.out.println("HOLA MUNDO");
  }
  @Override
  public void miMetodo(String mensaje){
        System.out.println("HOLA MUNDO " + mensaje);
  }
  public String getEmail(){
    return this.email;
  }
  @Override
  public String toString(){
    return "nombre: " +this.nombre+" email: " + this.email+ " edad: "+ this.edad;
  }
  @Override
  public boolean equals(Object obj){
    boolean bandera=false;
    if(obj instanceof Persona){
        Persona persona=(Persona)obj;
        if(this.email.equals(persona.getEmail()))
          bandera=true;
    }
    return bandera;
  }
  @Override
  public int hashCode(){
    return 6*this.email.hashCode();
  }


}
