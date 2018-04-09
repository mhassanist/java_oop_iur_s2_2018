/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package lecture5_methods;

import java.awt.Color;



public class Lecture5_Methods {
    
    private  class Car {
        private String model;
        private String make;
        private Color color;
        double  maxSpeed;
        boolean hasNitrousEngine;
        
        
        public void start(){
            
        }
        
        public void stop(){
            
        }
    }
    public static void main(String[] args) {
        
        int[] numbers = {2,3,4,5,5,56};
        printLineOfStars();
        
        printArray(numbers);
        
        int x = 13, y = 14;
        
        int result = sum2Numbers(x,y);
        System.out.println("Result= " + result);
        
        
        double result2 = sum2Numbers(14.5,18.65);
        System.out.println("Result= " + result2);
        
        System.out.println("Result= " + sumNumbers(3,4,5,6,6,7,7,8,7,8,98,9,9,0,0,0));
    }
    
    
    public static void printLineOfStars(){
        System.out.println("******************");
    }
    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int sum2Numbers(int a, int b){
        int result = a + b;
        return  result;
    }
    /*
    public static double sum2Numbers(int a, int b){
    double result = a + b;
    return  result;
    }*/
    public static int sum2Numbers(int a){
        int result = a;
        return  result;
    }
    public static int sumNumbers(int ... args){
        int sum=0;
        for(int i=0; i< args.length ; i++)
            sum+= args[i];
        return  sum;
    }
    
    public static double sum2Numbers(double a, double b){
        double result = a + b;
        return  result;
    }
    
}
