package lecture3_simplecalculator1;

import java.util.Scanner;

public class Lecture3_SimpleCalculator1 {
    
    public static void main(String[] args) {
        int choice;
        int firstNumber;
        int secondNumber;
        
        Scanner s = new Scanner(System.in);
        
        //Print menu
        System.out.println("1- Add");
        System.out.println("2- Sub");
        System.out.println("3- Mul");
        System.out.println("4- Divide");
        System.out.println("Please enter number between 1 and 4:");
        
        //Accept input from user
        choice = s.nextInt();
        
        if (choice > 4 || choice < 1  ) {
            System.out.println("invlaid input");
            
            System.exit(0); //Exit the java application.
        } 
        
        System.out.println("Please enter first number:");
        firstNumber  = s.nextInt();
        
        System.out.println("Please enter second number:");
        secondNumber = s.nextInt();
        
        if(choice == 1) {
            int sum = firstNumber + secondNumber;
            System.out.println("The sum = " + sum);
        }
        else if(choice == 2){
            System.out.println("The sub = " + (firstNumber - secondNumber));
        }
        
        else if(choice == 3){
        }
        
        else if(choice == 4){
        }
        /*
        else if (choice > 4 || choice < 1  ) {
            System.out.println("invlaid input");
        } */
        
        else {
            System.out.println("invlaid input");
        } 
        
        
        
    }
}
