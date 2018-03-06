package lecture2_inputoutput;
import java.util.Scanner ;
public class Lecture2_InputOutput {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1;
        int number2;
        int result;
        
        //Ask user to input first  number
        System.out.println("Please enter first number: ");
        
        double d = Math.sqrt(144);

        Scanner s = new Scanner(System.in);
        
        number1 = s.nextInt();
        
        //Ask user to input second numbers
        System.out.println("Please enter second number: ");
        
        //Scanner s2 = new Scanner(System.in);
        
        number2 = s.nextInt();
         
        result = number1+number2;
        
        System.out.println("Result of addition is: ");
        System.out.println(result);
        
        System.out.println("Result of addition is: " + result);
        
        
    }
    
}
