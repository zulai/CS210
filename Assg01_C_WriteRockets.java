/* 
 * CS210 Assignment 01 (Methods - Rockets)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.11 - Winter quarter
 * I use the methods to combine the rocket easily, I put same figure in one method to make it more convenient to combination. 
 * This program draws a picture of rockets.
 */

public class Assg01_C_WriteRockets {

      public static void main(String[] args) {
  triangle();
  square();
  number();
  square();
  triangle();
      }
      public static void triangle() {
            System.out.println("   /\\     \\    /");
            System.out.println("  /  \\     \\  /");
            System.out.println(" /    \\     \\/");
            }
      public static void square() {
            System.out.println("+------+ +------+ ");
            System.out.println("|      | |      | ");
            System.out.println("|      | |      | ");
            System.out.println("+------+ +------+ ");
            }
      public static void number() {
            System.out.println("| 9999 | | 6666 | ");
      }
      
      }
  