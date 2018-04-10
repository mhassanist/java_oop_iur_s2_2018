/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture7_simpleemployeefinance2;

/**
 *
 * @author MSAUDI
 */
public class PrintManager {
    
    public static void printEmployee(FulltimeEmployee emp){
        
        System.out.println("Employee info:" + emp.getEmployeeInfo());
    }
    
    public static void printEmployee(ParttimeEmployee emp){
        
        System.out.println("Employee info:" + emp.getEmployeeInfo());
    }
}
