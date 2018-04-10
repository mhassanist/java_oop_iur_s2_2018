package lecture7_simpleemployeefinance2;

/**
 *
 * @author MSAUDI
 */
public class Lecture7_SimpleEmployeeFinance2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FulltimeEmployee e1 = new FulltimeEmployee();
        
        System.out.println("Tax = " + FulltimeEmployee.getTax());
        
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
        
        FulltimeEmployee e2 = new FulltimeEmployee();
        
        
        ParttimeEmployee p1 = new ParttimeEmployee();
        p1.setName("Yasser");
        p1.setEmail("yasser@yasser.com");
        p1.setDaySalary(300);
        
        p1.addWorkDay();
        p1.addWorkDay(3);
        
        //BaseEmployee e = new BaseEmployee();
        
        ParttimeEmployee p2 = new ParttimeEmployee();
        p2.setName("Radwa");
        p2.addWorkDay();
        p2.addWorkDay();
        p2.addWorkDay(2);
        
        p2.setDaySalary(451);
        
        p2.getEmployeeInfo();
        
        
        printEmployeeInfo(p2);
        printEmployeeInfo(e1);

        //System.out.println("Yasser's Salary= " + p1.calculateSalary());
        
        //System.out.println("Omar's Salary= " + p2.calculateSalary());
        
        
    }
    
    public static void printEmployeeInfo(BaseEmployee p){
        System.out.println(p.getEmployeeInfo());
        
    }
    
    
}
