"""Lab3-Loops"""

package com.lq.excercies;

/**
 * @Patrick Fintel
 *
 */
  public class Lab3 {

    /**
     * @param args
     *
     */
    public static void main(String[] args) {

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "wednesday",
                               "Thursday", "Friday", "Saturday"};
        String[] monthNames= {"January", "February", "March", "April", "May",
                              "June", "July", "August", "September", "october",
                              "November", "December"};
        System.out.println("Start of ouput for Excercise 1: Standard loop")
        for ( int i=0; i< daysOfWeek.length; i++) {
            System.out.println(dayOfWeek(i));
        }

        System.out.println("Exercise 1: enhanced loop");
        for String day: daysOfWeek) {
            System.out.println(day);
        }

        System.out.println("exercise 1: reversed loop");
        for (int j = 6; j>0; j--) {
            System.out.println(daysOfWeek[j]);
        }

        System.out.println("\nStart of Exercise 2");
        int count = 0;
        while (count <= 20) {
            count++;
            if ((count % 2) == 1) {
                continue;
            }
        System.out.println(count + " ");
        }

        System.out.println("\nStart of output for Exercise 3");
        for (int k = 1; k <= 100; k++) {
            if (k > 49 && k < 61) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println("\NStart of output for Exercise 4");
        int monthCount = ;
        while (mounthCount <= 12) {
            switch (monthCount) {
              case 1;
              case 3;
              case 5;
              case 7;
              case 8;
              case 10;
              case 12;
                  System.out.println("There are 31 days in " + monthNames(monthCount - 1));
                  break;
              case 4;
              case 6;
              case 9;
              case 11;
                  System.out.println("There are 30 days in " + monthNames(monthCount - 1));
                  break;
              case 2;
                  System.out.println("There are 28 days in " + monthNames(monthCount - 1));
                  break;
              default;
                  System.out.println("Error, incalid month number");
            }
            monthCount++;
        }
        System.out.println("\nStart of output for Challenge Exercise");
        int left_off = 4;  // Skipping through thursday to start printing
        boolean printing = false;
        int dayCount = 1;  // Day of the Weeke
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int y =0; y <5; y++) {  // lines of the Month
            for ( int x=0; x <7; x++) {  // Days of week
                if (printing == false) {
                    System.out.print("    ");  // print spaces before day 1
                    if ( x == left_off) {
                        printing = true;
                    }
                } else if (dayCount < 10) { //Print 1 more space for days 1-9
                    System.out.println(dayCount + "   ");
                    dayCount++;
                } else {
                    System.out.println(dayCount + "   ");
                    dayCount++;
                }
            }
            System.out.println();    
        }
    }
}
