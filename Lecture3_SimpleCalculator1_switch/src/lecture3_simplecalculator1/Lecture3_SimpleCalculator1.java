package lecture3_simplecalculator1;

import java.util.Scanner;

public class Lecture3_SimpleCalculator1 {
    
    public static void main(String[] args) {
        float choice;
        float firstNumber;
        float secondNumber;
        float result;
        Scanner s = new Scanner(System.in);
        
        //Print menu
        System.out.println("1- Add");
        System.out.println("2- Sub");
        System.out.println("3- Mul");
        System.out.println("4- Divide");
        System.out.println("Please enter number between 1 and 4:");
        
        //Accept input from user
        choice = s.nextFloat();
        
        if (choice > 4 || choice < 1  ) {
            System.out.println("invlaid input");
            
            System.exit(0); //Exit the java application.
        }
        
        
        System.out.println("Please enter first number:");
        firstNumber  = s.nextFloat();
        
        System.out.println("Please enter second number:");
        secondNumber = s.nextFloat();
        
        switch((int)choice) {
            case 1:
                result = firstNumber + secondNumber;
                System.out.println("The result = " + result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println("The result = " + result);
                break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println("The result = " + result);
                break;
            case 4:
                if(secondNumber != 0){
                    result = firstNumber / secondNumber;
                    System.out.println("The result = " + result);
                    
                }
                else{
                    System.out.println("Can't divide by 0");
                }
                break;
            default:
                //If none of the above cases valid
                break;
        }
        
    }
}
