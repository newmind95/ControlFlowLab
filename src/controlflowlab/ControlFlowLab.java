package controlflowlab;

/**
 * The method should print diagonals to generate a rectangular pattern composed of stars (*). 
 * This should be accomplished by using loops (see examples below).


EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****


Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

* In the first or last row

* In the first or last column

* When the row number equals the column number

* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)


HINT: Use a nested loop (a loop inside of a loop).

HINT: To print on the same line, use the print method instead of println, e.g. 
* System.out.print(" "); prints a space and does not "move" to another line.

HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println();
 */

/**
 *
 * @author kristiyan
 */
public class ControlFlowLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printSquareStar(-1);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println();
        printSquareStar(5);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println();
        printSquareStar(8);
    }
    
    /** Method to print square star. */
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Input");
        }
        for (int rows = 0; rows < number; rows++) {
            for (int columns = 0; columns < number; columns++) {
                if (rows == 0 || columns == 0 || rows == columns 
                        || rows == number - 1 || columns == number - 1
                        || rows + columns == number - 1)
                    System.out.print("*");
                else 
                    System.out.print(" ");    
            }
            System.out.println();
        }
    }
}
