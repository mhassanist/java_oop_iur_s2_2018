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
public class ParttimeEmployee extends BaseEmployee{
    private  double daySalary;
    private double workDaysCount;
    
    @Override
    public double calculateSalary(){
        return workDaysCount*daySalary;
    }
    
    @Override
    public String getEmployeeInfo(){
        
        return name +" - " + email +" - "+ daySalary ;  
    }
    public void addWorkDay(){
        workDaysCount++;
    }
    
    public void addWorkDay(double workDays){
        workDaysCount += workDays;
    }
    
    public double getDaySalary() {
        return daySalary;
    }
    
    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }
    
}
