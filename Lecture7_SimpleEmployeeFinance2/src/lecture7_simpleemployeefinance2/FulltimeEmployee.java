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
public class FulltimeEmployee extends BaseEmployee{
    
    private static double tax = 0.2;
    private  double basicSalary;
    private  int absenceDays;
    private  double bonus;
    
    @Override
    public double calculateSalary(){
        double netSalary =  basicSalary + bonus - (absenceDays * (basicSalary/30));
        return netSalary;
    }
    @Override
    public String getEmployeeInfo(){
        String data = name +" - " + basicSalary;
        return  data;
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
    public  void addAbsenceDay (){
        absenceDays ++;
        
    }
}
