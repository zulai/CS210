/* 
 * CS210 Assignment 01 (Methods - Sequencing)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.11 - Winter quarter
 * I use the static methods to combine the different methods. Since we can't change the main, I add a 
 * "second method" under my first static method, and "first method" under my third static method.
 * This program is a short puzzle.
 */

public class Assg01_A_Methods {

    public static void first() {
        System.out.println("first method");
        second();
        
    }

    public static void second() {
        System.out.println("second method");
        
        
    }
 
    public static void third() {
        System.out.println("third method");
        first();
        
        
        
    } 
 
    public static void main(String[] args) {
    // DO NOT change this main method
       first();
       third();
       second();
       third();
    // DO NOT change this main method
    }

}


// output
// first method
// second method
// third method
// first method
// second method
// second method
// third method
// first method
// second method