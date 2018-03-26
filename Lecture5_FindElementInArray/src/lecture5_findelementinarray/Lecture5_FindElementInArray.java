package lecture5_findelementinarray;

import java.util.Scanner;

public class Lecture5_FindElementInArray {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        boolean found = false;
        
        int count;
        System.out.println("Enter how many numbers you have");
        count = s.nextInt();
        
        double [] numbers = new double[count];
        
        System.out.println("Enter the numbers");
        
        //Read numbers from user
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextDouble();
        }
        //printArray(numbers);
        
        System.out.println("Enter a number to search for: ");
        double num = s.nextDouble();
        
        
        for (int i = 0; i < count; i++) {
            if(numbers[i] == num){
                found = true;
                break;
                
            }
        }
        /*
        int j =0;
        for (; j< count; j++) {
            if(numbers[j] == num){
                break;
            }
        }
        if(j==count)
            System.out.println("Not Found");
        else
            System.out.println("Found");
        */
        
        printArray(numbers);
        if (found) {
            System.out.println("Found");
        }else
            System.out.println("Not Found");
        
    }
    
    
    public static void printArray(double [] tempreture){
        
        for (int i = 0; i < tempreture.length; i++) {
            System.out.print(tempreture[i] + "-");
        }

    }
    
   
}
