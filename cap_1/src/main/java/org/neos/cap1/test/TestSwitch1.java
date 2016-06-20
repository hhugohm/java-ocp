package org.neos.cap1.test;

import org.neos.cap1.constants.Season;


public class TestSwitch1 {
    public static void main(String[] args) {

      Season season= Season.WINTER;
      switch(season){
          case WINTER: System.out.println("Temporada de Frio!!");
                        break;
          case SUMMER: System.out.println("Temporada de Frio!!");
                        break;

          default: System.out.println("Temporada default");
        }

      }

}
