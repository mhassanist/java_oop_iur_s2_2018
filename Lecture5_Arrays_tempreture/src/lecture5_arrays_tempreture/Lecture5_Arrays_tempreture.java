package lecture5_arrays_tempreture;
import java.util.Scanner;

public class Lecture5_Arrays_tempreture {
    
    public static void main(String[] args) {
        float tempreture[] = new float[7];
        /*
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter tempteture of day 1");
        
        tempreture [0] = s.nextFloat();
        */
        tempreture [0] = 17;
        tempreture [1] = 12;
        tempreture [2] = (float)14.5;
        tempreture [3] = 13;
        tempreture [4] = 11.5f;
        tempreture [5] = 17;
        tempreture [6] = 27;
        
        float avg = tempreture[0] + tempreture[1]
                + tempreture[2] + tempreture[3] + tempreture[4]
                + tempreture[5]+ tempreture[6];
        
        avg = avg / tempreture.length;
        
        System.out.println(avg);
        
        printArray(tempreture);
       
        
        float sum = 0;
        for (int i = 0; i < tempreture.length; i++) {
            
            sum += tempreture[i];
        }
        
        System.out.println("Average tempreature = " + (sum/tempreture.length));
         
    }
    
    
    public static void printArray(float [] tempreture){
    
     for (int i = 0; i < tempreture.length; i++) {
            System.out.println(tempreture[i]);
        }
    }
    
    
}
