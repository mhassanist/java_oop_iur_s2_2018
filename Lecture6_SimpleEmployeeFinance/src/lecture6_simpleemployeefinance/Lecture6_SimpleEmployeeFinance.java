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
        System.out.println("Name = " + e1.getName());
        
        Employee e2 = new Employee();
        Employee e3 = new Employee("Abdulrahman", "a@abdurahman.com",1480);
        
        System.out.println("Counter" + Employee.getEmpCounter());
        
        ParttimeEmployee p1 = new ParttimeEmployee();
        p1.setName("Yasser");
        p1.setEmail("yasser@yasser.com");
        p1.setDaySalary(300);
        
        p1.addWorkDay();
        p1.addWorkDay(3);
        
        
        ParttimeEmployee p2 = new ParttimeEmployee("Omar", "omar@omar.com", 255);
        p2.addWorkDay();
        p2.addWorkDay();
        p2.addWorkDay(2);
        
        System.out.println("Yasser's Salary= " + p1.calculateSalary());
        
        System.out.println("Omar's Salary= " + p2.calculateSalary());
    }
    
}
