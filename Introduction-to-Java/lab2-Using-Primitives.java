/**
package com.lq.excercises;

/**
 * @param args
 */
 public static void main(String[] args) {

   int width;
   int height;
   int area;
   double radius = 10.0;
   double pi = 3.14;
   boolean result = true;

   int[] daysInMonths = new int[12];
   String[] monthNames = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};
   width = 8;
   height = 12;
   area = 96;

   daysInMonths[0] = 31;
   daysInMonths[1] = 28;
   daysInMonths[2] = 31;
   daysInMonths[3] = 30;
   daysInMonths[4] = 31;
   daysInMonths[5] = 30;
   daysInMonths[6] = 31;
   daysInMonths[7] = 31;
   daysInMonths[8] = 30;
   daysInMonths[9] = 31;
   daysInMonths[10] = 30;
   daysInMonths[11] = 31;

   System.out.println("Hello World!");

   System.out.println("The value of width is " + width);
   System.out.println("The value of height is " + height);
   System.out.println("The value of area is " + area);
   System.out.println("The value of radius is " + radius);
   System.out.println("The value of pi is " + pi);
   System.out.println("The value of result is " + result + "\n");

   System.out.println("The number of days in " + monthNames[0] + " is " +
      daysInMonths[0]);
   System.out.println("The number of days in " + monthNames[1] + " is " +
      daysInMonths[1]);
   System.out.println("The number of days in " + monthNames[2] + " is " +
      daysInMonths[2]);
   System.out.println("The number of days in " + monthNames[3] + " is " +
      daysInMonths[3]);
   System.out.println("The number of days in " + monthNames[4] + " is " +
      daysInMonths[4]);
   System.out.println("The number of days in " + monthNames[5] + " is " +
      daysInMonths[5]);
   System.out.println("The number of days in " + monthNames[6] + " is " +
      daysInMonths[6]);
   System.out.println("The number of days in " + monthNames[7] + " is " +
      daysInMonths[7]);
   System.out.println("The number of days in " + monthNames[8] + " is " +
      daysInMonths[8]);
   System.out.println("The number of days in " + monthNames[9] + " is " +
      daysInMonths[9]);
   System.out.println("The number of days in " + monthNames[10] + " is " +
      daysInMonths[10]);
   System.out.println("The number of days in " + monthNames[11] + " is " +
      daysInMonths[11]);

}
