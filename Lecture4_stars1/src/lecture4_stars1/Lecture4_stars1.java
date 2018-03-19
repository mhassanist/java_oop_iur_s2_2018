/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4_stars1;

import java.util.Scanner;

/**
 *
 * @author MSAUDI
 */
public class Lecture4_stars1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lines, stars;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter lines");
        lines = s.nextInt();
        
        System.out.println("Enter stars");
        stars = s.nextInt();
        
        for (int i = 0; i < lines; i++) {
            
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
                
            }
            System.out.println("");  
        }
        
        
    }
    
}
