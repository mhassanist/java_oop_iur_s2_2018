package trials;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;

public class Trials {
    
    public static void main(String[] args) {
           int sum = 0;
		int i = 0;			
		while (i < 5)	
		{						
			sum += i;		
			i++;				
		}						
		System.out.print(sum);
                
                sum = 0;
                for (int j = 0; j < 5; j++) 
                    sum+=j;
                    
                    		System.out.print(sum);

               
                
        }
    public static void double_t (int X, int Y)
    {
        X = X *2 ;
        Y = Y *2 ;
        System.out.println(X + " " + Y);
    }

}