package evendigit;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.


EXAMPLE INPUT/OUTPUT:

* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

* getEvenDigitSum(-22); → should return -1 since the number is negative


NOTE: The method getEvenDigitSum should be defined as public static like 
we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */

/**
 *
 * @author kristiyan
 */
public class EvenDigitTask {
    
    /** Main method. */
    public static void main(String[] args) {
        System.out.println(getEvenDgitiSum(-22));
        
    }
    
    /** Method to sum the even digits within the number. */
    public static int getEvenDgitiSum(int number) {
        int sum = 0;
        int lastDigit = 0;
        if (number < 1) {
            return -1;
        }
        while (number != 0) {
            // find last digit
            lastDigit = number % 10;
            // check wheter number is an even.
            if (number % 2 == 0) {
                // add it to the sum
                sum += lastDigit;
                number /= 10;
            }
        }
        return sum;
    }
    
}
