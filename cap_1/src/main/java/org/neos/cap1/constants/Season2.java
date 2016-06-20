
package  org.neos.cap1.constants;

public enum Season2 {

    WINTER("low"),SPRING("medium"),SUMMER("high"),FALL("medium");

    private final String expectedVisitors;
    private Season2(String expectedVisitors){
      this.expectedVisitors=expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}
