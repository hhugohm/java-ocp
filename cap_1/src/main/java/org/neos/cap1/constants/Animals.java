package  org.neos.cap1.constants;

public enum Animals {

  DOG(true), CAT(true), JIRAFE(true), BIRD(false), FROG(false);

  private final boolean mammal;
  private Animals(final boolean mammal){
    this.mammal=mammal;
  }
  public boolean isMammal(){
    return mammal;
  }

}
