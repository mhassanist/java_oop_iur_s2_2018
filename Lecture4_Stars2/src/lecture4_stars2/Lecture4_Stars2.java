package lecture4_stars2;

import java.util.Scanner;

public class Lecture4_Stars2 {

    public static void main(String[] args) {
        int lines;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter lines");
        lines = s.nextInt();

        for (int i=5, j=13; lines>9 ;i++,j-- ) {
            
        }
        
        for (int i = 0; i < lines; i++) {
            //Spaces loop
            for (int k = lines-i-1; k > 0; k--) {
                System.out.print(" ");
            }
            //Stars loop
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
                
            }
           
            System.out.println("");  
        }
        
        
    }
    
}

/*
package lecture4_stars2;

import java.util.Scanner;

public class Lecture4_Stars2 {

    public static void main(String[] args) {
        int lines, stars=1;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter lines");
        lines = s.nextInt();
        
        
        for (int i = 0; i < lines; i++) {
            
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
                
            }
            stars++;
            System.out.println("");  
        }
        
        
    }
    
}*/
