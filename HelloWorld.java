/* Everything in green is a comment.
 * 
 * comments are important to help organize your thoughts and code.
 * comments are also useful when reading others code.
 * There are two ways to make a comment.
 * 
 * 1) open with a "/" then a "*". close with a "*" then a "/".
 * ^the type of comment above is used for long comments taking up multiple lines.
 * 2) open with "//" and there is no need to close because it is only for one 
 * line of code. 
 * */

public class HelloWorld {///construction of class.
    
    public static void main(String args[]) {///main method construction
        
        System.out.print("Hello World!");///prints out to the console
        
    }///closes main method
    
}///closes class

///read footnotes for explinations of all the words and functions vvvv.






/* FOOTNOTES
 * 
 * PUBLIC: means that the method is visible and can be called from other 
 * objects of other types
 * 
 * CLASS: specifies that this is the creation of the class
 * (Classes should be named with capital letters and will also be the name
 * of the file)
 * 
 * STATIC: means that the method is associated with the class, not a specific
 * instance (object) of that class. This means that you can call a static 
 * method without creating an object of the class.
 * 
 * VOID: means that the method has no return value. If the method returned 
 * an int you would write int instead of void.
 * (This does not mean that it will not print... just that the method itself 
 * will not return anything)
 * 
 * MAIN: this is just a common name for the main method that holds the most
 * important functions.
 * 
 * STRING: A string is a sequence of characters such as words numbers or a paragraph
 * 
 * ARRAY: An array is a collection of something.
 * (think of a deck of cards. each card is its own thing but together they become
 * a deck. Your string is the individual thing and the string array is the deck)
 * 
 * STRING ARGS[]: what this means is that it is taking in an array of strings
 * from the console. This is in parenthesis because the main method is recieveing
 * what is inside and the String args[] is what is going in.
 * 
 * SYSTEM.OUT.PRINT(): this is a function in the java library that you can 
 * use to print things out easily. All you need to do is put System.out.println()
 * and inside the parenthasis you put what should be printed in quotes "hello".
 * 
 * IMPORTANT INFO!!!: at the end of every function of code it is imperative to 
 * end that line with a semicolon ";". this tells java to go ahead and run that
 * line without getting mixed up.
 * */
  
  