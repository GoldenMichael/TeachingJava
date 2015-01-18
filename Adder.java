/* This program will show you the basics of mathematical functions
 * in java. Things like adding and multiplying
 * */

public class Adder { ///creates the class with the name Adder
    
    public static void main(String args[]) { ///constructs the main method
        
     int x = 16; ///declares an int with a value of 16 to the variable x
     int y = 4; ///declares an int with a value of 4 to the variable y
     
     int sum = x + y; ///this adds x and y together and stores it in the int sum
     int difference = x - y; ///this subtracts and stores in difference
     int product = x * y; ///this multiplies x and y storing in product
     int quotient = x / y; /// this devides x by y and stores in quotient
     
     System.out.println("The SUM of x and y is: " + sum); ///prints the sum
     System.out.println("The DIFFERENCE of x and y is: " + difference); ///prints difference
     System.out.println("The PRODUCT of x and y is: " + product); /// prints product
     System.out.println("The QUOTIENT of x and y is: " + quotient); /// prints quotient
     
    } /// closes main method
    
} ///closes Adder class


/* FOOTNOTES:
 * 
 * 
 * 
 * INT: An int is a declaration of a whole number and is commonly used.
 * 
 * OPERATIONS: 
 *     + adds the two numbers arround the symbol
 *     - subtracts the first number from the seccond
 *     * multiplies the two numbers
 *     / will devide the first number by the seccond
 * 
 * EXPLINATION OF THE PRINT STATEMENT:
 *     LN: This time in our print statement we used println meaning that after
 * it is printed out the next output will go on the next line
 *     When you want to include a variable in your output you need to close your
 * quote and add a "+" sign to show to combign them. (be careful to add spaces)