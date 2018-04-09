/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package lecture6_simpleemployeefinance;

/**
 *
 * @author MSAUDI
 */
public class Lecture6_SimpleEmployeeFinance {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        
        System.out.println("Tax = " + Employee.getTax());
                
        e1.setName("Mohammed");
        e1.setEmail("m@yahoo.com");
        e1.setBasicSalary(2750);

        e1.addAbsenceDay();
        e1.addAbsenceDay();
        e1.addAbsenceDay();
        
        e1.addBonus(100);
        e1.addBonus(50);
        
        double salary = e1.calculateSalary();
        System.out.println("Salary = " + salary);
        
      
        
        
    }
    
}
