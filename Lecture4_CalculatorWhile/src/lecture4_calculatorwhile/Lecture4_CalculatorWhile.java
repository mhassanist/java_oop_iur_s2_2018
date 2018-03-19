package lecture4_calculatorwhile;

import java.util.Scanner;

public class Lecture4_CalculatorWhile {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float choice = 1;
        float firstNumber;
        float secondNumber;
        float result;
        Scanner s = new Scanner(System.in);
        
        do{
            //Print menu
            System.out.println("1- Add");
            System.out.println("2- Sub");
            System.out.println("3- Mul");
            System.out.println("4- Divide");
            System.out.println("0- Exit");
            System.out.println("Please enter number between 1 and 4:");
            
            //Accept input from user
            choice = s.nextFloat();
            
            if (choice > 4 || choice < 0  ) {
                System.out.println("invlaid input");
                continue;
            }
            
            switch((int)choice) {
                case 1:
                    System.out.println("Please enter first number:");
                    firstNumber  = s.nextFloat();
                    
                    System.out.println("Please enter second number:");
                    secondNumber = s.nextFloat();
                    result = firstNumber + secondNumber;
                    System.out.println("The result = " + result);
                    break;
                case 2:
                    System.out.println("Please enter first number:");
                    firstNumber  = s.nextFloat();
                    
                    System.out.println("Please enter second number:");
                    secondNumber = s.nextFloat();
                    result = firstNumber - secondNumber;
                    System.out.println("The result = " + result);
                    break;
                case 3:
                    System.out.println("Please enter first number:");
                    firstNumber  = s.nextFloat();
                    
                    System.out.println("Please enter second number:");
                    secondNumber = s.nextFloat();
                    result = firstNumber * secondNumber;
                    System.out.println("The result = " + result);
                    break;
                case 4:
                    System.out.println("Please enter first number:");
                    firstNumber  = s.nextFloat();
                    
                    System.out.println("Please enter second number:");
                    secondNumber = s.nextFloat();
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
            } //End switch
        }while (choice != 0);
    }//End Main
    
}//End Class
