package lecture6_simpleemployeefinance;

public class Lecture6_SimpleEmployeeFinance {
    
    public static void main(String[] args) {
        
        FulltimeEmployee e1 = new FulltimeEmployee();
        e1.setName("Mohammed");
        e1.setEmail("m@yahoo.com");
        e1.setPhoneNumber("+9012780089");
        
        
        System.out.println(e1);
        
        e1.setNationalId("154875466");
        
        e1.setBasicSalary(2750);
        
        e1.addAbsenceDay();
        e1.addAbsenceDay();
        e1.addAbsenceDay();
        
        e1.addBonus(100);
        e1.addBonus(50);
        
        
        
        double salary = e1.calculateSalary();
        System.out.println("Salary = " + salary);
        System.out.println("Name = " + e1.getName());
        
        
        System.out.println("Tax = " + FulltimeEmployee.getTax());
        
        
        FulltimeEmployee e2 = new FulltimeEmployee();
        FulltimeEmployee e3 = new FulltimeEmployee("Abdulrahman", "a@abdurahman.com",1480);
        
                
        ParttimeEmployee p1 = new ParttimeEmployee();
        p1.setName("Yasser");
        p1.setEmail("yasser@yasser.com");
        p1.setPhoneNumber("+90123456789");
        p1.setDaySalary(300);
        p1.setNationalId("789456454");
        
        
        p1.addWorkDay();
        p1.addWorkDay(3);
        
        ParttimeEmployee p2 = new ParttimeEmployee("Omar", "omar@omar.com", 255);
        p2.addWorkDay();
        p2.addWorkDay();
        p2.addWorkDay(2);
        
        System.out.println("Yasser's Salary= " + p1.calculateSalary());
        System.out.println("Omar's Salary= " + p2.calculateSalary());
        
        System.out.println("===== Inheitance =======");
        
        printEmployeeInfo(e1);
        printEmployeeInfo(p1);
        
        
    }
    
    public static void printEmployeeInfo(Employee e){
        
        System.out.println("Name: " + e.getName() );
        System.out.println("Email: " + e.getEmail());
        System.out.println("Phone Number: " + e.getPhoneNumber());
        System.out.println("Salary: " + e.calculateSalary());
        
        if(e instanceof ParttimeEmployee){
            System.out.println("PART ");
        }else  if(e instanceof FulltimeEmployee){
            System.out.println("FULL ");
        }
        
    }
    
    public static void PrintPtEmployee(ParttimeEmployee e){
        
        System.out.println("Name: " + e.getName() );
        System.out.println("Email: " + e.getEmail());
        System.out.println("Phone Number: " + e.getPhoneNumber());
    }
    
    public static void PrintFtEmployee(FulltimeEmployee e){
        System.out.println("Name: " + e.getName() );
        System.out.println("Email: " + e.getEmail());
        System.out.println("Phone Number: " + e.getPhoneNumber());
    }
    
}
