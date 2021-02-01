package numberinworld;

/**
 * Write a method called printNumberInWord. The method has one parameter number which is the whole number. 
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" 
* if the int parameter number is 0, 1, 2, .... 9 
or other for any other number including negative numbers. 
* You can use if-else statement or switch statement whatever 
is easier for you.
 */

/**
 *
 * @author kristiyan
 */
public class NumberInWorldTask {
    
    /** Main method. */
    public static void main(String[] args) {
        printNumberInWord(3);
        printNumberInWord(10);
        printNumberInWord(11);
    }
    
    /** Method to print number in word. */
    public static void printNumberInWord(int number) {
        String word = "";
        switch (number) {
            case 0:
                word = "ZERO";
                break;
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6: 
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            case 10:
                word = "TEN";
                break;
            default:
                word = "OTHER";
        }
        System.out.println("Number: " + number + ", WORD: " + word);
    }
}
