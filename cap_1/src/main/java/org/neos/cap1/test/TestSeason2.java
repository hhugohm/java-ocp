
package org.neos.cap1.test;

import org.neos.cap1.constants.Season2;

public class TestSeason2 {

    public static void main(String[] args) {

      System.out.println(Season2.SUMMER.name()+" "+ Season2.SUMMER.ordinal());
      Season2.SUMMER.printExpectedVisitors();

    }
}
