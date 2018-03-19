/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4_loop2;

import java.util.Scanner;

/**
 *
 * @author MSAUDI
 */
public class Lecture4_Loop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount;
        final double BOOK_PRICE = 20;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter amount of money you have: $");
        amount = s.nextDouble();
        
        int numberOfBooks = (int)(amount / BOOK_PRICE);
        
        double remainingMoney = amount - numberOfBooks*BOOK_PRICE ;
        
        System.out.println("You can buy:" + numberOfBooks );
        System.out.println("Remaining Money: $" + remainingMoney );
        
        
    }
    
}
