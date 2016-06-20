package  org.neos.cap1.constants;

public enum Season3 {
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
    },FALL{
      public void printHours(){
        System.out.println("horas otonno");
      }
    };

    public abstract void printHours();

}
