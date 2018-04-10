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
public class ParttimeEmployee {
    
    private String name;
    private String email;
    private String phoneNumber;
    private  double daySalary;
    private double workDaysCount;

    public ParttimeEmployee(){
        
    }
    
    public ParttimeEmployee(String name, String email, double daySalary){
        this.name = name;
        this.email = email;
        this.daySalary = daySalary;
    }
    
    public void addWorkDay(){
        workDaysCount++;
    }
    
    public void addWorkDay(double workDays){
        workDaysCount += workDays;
    }
    public double calculateSalary(){
        
        return workDaysCount * daySalary;
    }
    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
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
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
