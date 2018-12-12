class Month {

   private int monthNumber; // this variable stores the month number. January would be 1, February would be 2, and so forth

  

   // This array will for the months.

   private static final String[] monthNames = {"January", "February", "March", "April", "May", "June",

           "July", "August", "September", "October", "November", "December"};

   // A no-arg constructor TOOK FOREVER TO FIND.

   public Month() {

       monthNumber = 1;

   }

  

   // A constructor that accepts the number of the month as an argument.

   // It should set the monthNumber field to the value passed as the argument.

   // If a value less than 1 or greater than 12 is passed, the constructor should set monthNumber to 1.

   public Month(int month) {

       if(month < 1 || month > 12)

           monthNumber = 1;

       else

           monthNumber = month;

   }

   // A constructor that accepts the name of the month, such as "January" or "February" as an argument.

   // It should set the monthNumber field to the correct corresponding value.

   public Month(String monthName) {

       for(int i=0; i<monthNames.length; i++) {

           // if the given month is found in the array, set month number to i + 1 as i starts from 0.

           if(monthNames[i].equalsIgnoreCase(monthName)) {

               monthNumber = i + 1;

               break;

           }

       }

   }

   // setMonthNumber() method that accepts an int argument,

   // which is assigned to the monthNumber field.

   // If a value less than 1 or greater than 12 is passed, the method should set monthNumber to 1.

   public void setMonthNumber(int month) {

       if(month < 1 || month > 12)

           monthNumber = 1;

       else

           monthNumber = month;

   }

   // getMonthNumber() method that returns the value in the monthNumber field.

   public int getMonthNumber() {

       return monthNumber;

   }

   // getMonthName() method that returns the name of the month.

   public String getMonthName() {

       return monthNames[monthNumber - 1];

   }

   // toString() method that returns the same value as the getMonthName method.

   public String toString() {

       return getMonthName();

   }

   // method that accepts a Month object as an argument.

   // If the argument object holds the same data as the calling object,

   // this method should return true. Otherwise, it should return false.

   public boolean equals(Month m) {

       return monthNumber == m.getMonthNumber();

   }

   // convertNumberToName method, which accepts an int argument representing the month number,

   // and returns a String for the corresponding month’s name.

   public static String convertNumberToName(int month) {

       return monthNames[month - 1];

   }

}

public class MonthDemo {

   public static void main(String[] args) {

      

       // lets create two objects of Month using different 1-arg constructor

       Month m1 = new Month("March");

       Month m2 = new Month(3);

      

       // use toString() to print m1 and m2

       System.out.println("m1 -> Month name = " + m1);

       System.out.println("m2 -> Month name = " + m2);

      

       // use getMonthNumber() to get the month number for m1

       System.out.println("Month number of March is : " + m1.getMonthNumber());

       // use equals() to compare m1 and m2

       System.out.println("Result of m1.equals(m2) = " + m1.equals(m2));

       System.out.println("Modified the month number of m2 to 7!!");

       // use setMonthNumber() to set the month number for m2

       m2.setMonthNumber(7);

       // use getMonthName() to get the month name for m2

       System.out.println("Name for month number 7 is: " + m2.getMonthName());

       // use equals() to compare m1 and m2

       System.out.println("Result of m1.equals(m2) = " + m1.equals(m2));

      

       // use convertNumberToName() to get month name for a number

       System.out.println("Getting name for month number 5 using convertNumberToName(): "

                       + Month.convertNumberToName(5));

   }

}

