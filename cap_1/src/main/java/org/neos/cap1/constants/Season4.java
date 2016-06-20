package  org.neos.cap1.constants;

public enum Season4 {
    WINTER{
        public void printHours(){
          System.out.println("horas winter");
        }
    },SPRING{
      public void printHours(){
        System.out.println("horas primavera");
      }
    },SUMMER{
      public void printHours(){
        System.out.println("horas verano");
      }
    },FALL{  //se comenta este metodo
      /*public void printHours(){
        System.out.println("horas otonno");
      }*/
    };
    // al notener el metodo abstracto no es obligatorio para los enums
    //public abstract void printHours();

}
