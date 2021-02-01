package numberindaysinmonth;

/**
 * Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false. 

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
* otherwise return false. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:

* isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)

* isLeapYear(1600); → should return true since 1600 is a leap year

* isLeapYear(2017); → should return false since 2017 is not a leap year

* isLeapYear(2000); → should return true because 2000 is a leap year 

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the 
* isLeapYear method. You can use that solution if you wish.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years 
* they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:

* getDaysInMonth(1, 2020); → should return 31 since January has 31 days.

* getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 
* is a leap year.

* getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year
* and 2018 is not a leap year.

* getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.

* getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.


HINT: Use the switch statement.
 */

/**
 *
 * @author kristiyan
 */
public class NumberOfDaysInMonthTask {
    
    /** Main method. */
    public static void main(String[] args) {
        System.out.println("2000 is a leap year?: " + isLeapYear(2000));
        System.out.println("2007 is a leap year?: " + isLeapYear(2007));
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println(getDaysInMonth(-1, 2000));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(1, 2020));
    }
    
    /** Method to check whether a year is a leap year. */
    public static boolean isLeapYear(int year) {
        if (year <= 1 && year <= 9999) {
            return false;
        }
        boolean isLeap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        if (isLeap) {
            return true;
        } else {
            return false;
        }
    }
    
    /** Method to check how many days have in a month. */
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        int days = 365;
        switch (month) {
            case 1: case 12:
                days = 31;
                break;
            case 2:
                days = (year % 4 == 0) ? 28 : 29;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5: case 6: case 7: case 8:
                days = 31;
                break;
            case 9: case 11:
                days = 30;
                break;
        }
        return days;
    }
}
