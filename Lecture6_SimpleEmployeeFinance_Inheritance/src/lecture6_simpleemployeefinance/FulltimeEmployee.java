
package lecture6_simpleemployeefinance;

//Subclass / child class 
public class FulltimeEmployee extends Employee{
       
    private static double tax = 0.02;
    private  double basicSalary;
    private  int absenceDays;
    private  double bonus;
    
    
    public FulltimeEmployee(){
    }
    public FulltimeEmployee(String name, String email, double basicSalary){
        this.name = name;
        this.email = email;
        this.basicSalary = basicSalary;
    }
    
    public void     addBonus (double bonus){
        this.bonus += bonus;
    }
    public  void    addAbsenceDay (){
        absenceDays ++;
        
    }
    @Override
    public double   calculateSalary(){
        double netSalary =  basicSalary + bonus - (absenceDays * (basicSalary/30));
        
        return netSalary;
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
    
}
