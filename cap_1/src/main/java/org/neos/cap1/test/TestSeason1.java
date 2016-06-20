
package org.neos.cap1.test;

import org.neos.cap1.constants.Season;

public class TestSeason1 {

    public static void main(String[] args) {

      Season summer= Season.SUMMER;
      System.out.println(summer);
      System.out.println(summer.SUMMER);
      System.out.println(summer==summer.SUMMER);

      for(Season season : Season.values()){
          System.out.println(season.name()+ " " + season.ordinal());

      }
      Season verano = Season.valueOf("WINTER");
      System.out.println(verano.name() + " "+ verano.ordinal());
    }

}
