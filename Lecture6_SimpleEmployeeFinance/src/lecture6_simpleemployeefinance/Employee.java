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
public class Employee {
    private String name;
    private String email;
    private String phoneNumber;
    private static double tax = 0.2;
    private  double basicSalary;
    
   
    private  int absenceDays;
    private  double bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static double getTax() {
        return tax;
    }

   
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getAbsenceDays() {
        return absenceDays;
    }

    public void setAbsenceDays(int absenceDays) {
        this.absenceDays = absenceDays;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
   
    
    public void addBonus (double bonus){
        this.bonus += bonus;
    }
     
    public void addAbsenceDay (){
       absenceDays ++; 
       
    }
    
    public double calculateSalary(){
        
       double netSalary =  basicSalary + bonus - (absenceDays * (basicSalary/30));
       
       return netSalary;
    }
            
    
    
}
