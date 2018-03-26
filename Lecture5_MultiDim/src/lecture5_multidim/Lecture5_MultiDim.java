package lecture5_multidim;

import java.util.Scanner;

public class Lecture5_MultiDim {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*int [][] arr2d = new int[3][4];
        
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
        arr2d[i][j] = s.nextInt();
        }
        }*/
        
        int[][] arr2d = {{1,2,3,5}, {2,3,4,5} , {2,3,4,5}};
        
        System.out.println("=================");
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[0].length; j++) {
                System.out.print(arr2d[i][j]+  " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < arr2d.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2d[0].length; j++) {
                sum +=arr2d[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("----------------");
        
        
        for (int i = 0; i < arr2d[0].length; i++) {
            int sum =0;
            for (int j = 0; j < arr2d.length; j++) {
                sum +=arr2d[j][i];
            }
            System.out.println(sum);
        }
        
        
    }
    
}
