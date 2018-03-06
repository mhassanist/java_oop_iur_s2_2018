/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture1_hellojava;

/**
 *
 * @author MSAUDI
 */
public class Lecture_Variables_1 {
     public static void main(String[] args) {
             
         boolean b;
         byte by;
         char c;
         short s;
         int i;
         long l;
         float floatNumber;
         double d;
         
         b= true;
         b= false;
         System.out.println(b);

         by = 127;
        
         c = 'b';
         c = 48; //unicode
         System.out.println(c);
         
         
         c = 'أ';
         System.out.println(c);

         floatNumber = 24.8f;
         System.out.println(floatNumber);

         
         
     }
}
