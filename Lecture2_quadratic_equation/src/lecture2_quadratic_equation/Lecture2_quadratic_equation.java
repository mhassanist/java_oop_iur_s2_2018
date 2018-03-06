/*
The Quadratic Formula uses the "a", "b", and "c" from
"ax2 + bx + c", where "a", "b", and "c" are just numbers;
they are the "numerical coefficients" of the quadratic equation
they've given you to solve.
After solving use the below sample data with answers
to make sure your answer is correct.
Sample Data
a b c      x1    x2
5 6 1   -> -2 ,  -1
5 2 1   -> NO Real Answer
1 3 -4  -> 1  ,  -4
1 -4 -3 -> 2.58, X2:-0.58
*/

package lecture2_quadratic_equation;


import java.util.Scanner;

public class Lecture2_quadratic_equation {
    public static void main(String[] args) {
        
        int a,b,c;
        double x1, x2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a");
        a = sc.nextInt();
        
        System.out.println("Please enter b");
        b = sc.nextInt();
        
        System.out.println("Please enter c");
        c = sc.nextInt();
                  
        double root = Math.sqrt((b*b)-(4*a*c));
        
        x1 = (-b + root )/(2*a);
        x2 = (-b - root)/(2*a);
        
        //You can output result in separate lined
        System.out.println("X1:");
        System.out.println(x1);
        
        //You can output result in 1 lines (better look)
        System.out.println("X2:" + x2);
        
    }
    
}
