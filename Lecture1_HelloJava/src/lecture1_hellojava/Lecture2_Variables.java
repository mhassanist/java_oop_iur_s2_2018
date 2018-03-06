/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package lecture1_hellojava;

/**
 *
 * @author MSAUDI
 */
public class Lecture2_Variables {
    
    public static void main(String[] args) {
        
        boolean a = false;
        boolean b = true;
        
        a = b;
        a = !b;
        a =  a && b;
        a =  a || b;
        
        char c;
        
        byte by;
        short s;
        
        int i1, i2, i3;
        
        long l;
        float floatNumber;
        double d;
        
        i1 = 5;
        i2 = 7;
        
        i3 = i1+i2; // - * /
        
        
        i1 = i1 +1 ;
        i1 += 1 ;
        i1++;
        
        
        i1 = i1 +2 ;
        i1 += 2 ;
        i1++;
        i1++; // 14 
        
             
        System.out.println(++i1);//15
        
        System.out.println(i1++);//15
        
        i1--;
        --i1;
        
        i1 -= 6;
        System.out.println(i1);

        i1 = i1>>2;
        
        System.out.println(i1);
            
        i1 = i2 %2;
        
    }
}
