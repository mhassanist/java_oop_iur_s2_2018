package lecture6_simpleemployeefinance;

public class ParttimeEmployee extends Employee{
    
    
    private  double daySalary;
    private double  workDaysCount;

    public ParttimeEmployee(){
        
    }
    public ParttimeEmployee(String name, String email, double daySalary){
        this.name = name;
        this.email = email;
        this.daySalary = daySalary;
    }
    
    public void     addWorkDay(){
        workDaysCount++;
    }
    public void     addWorkDay(double workDays){
        workDaysCount += workDays;
    }
    @Override
    public double   calculateSalary(){
        
        return workDaysCount * daySalary;
    }
    
    public double getDaySalary() {
        return daySalary;
    }
    public void     setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }
}
