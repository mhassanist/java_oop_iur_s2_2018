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
//Parent class / Super class / Base class
public class Employee {
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected String nationalId;
    
    
    public double   calculateSalary(){
        
        return 0.0;
    }
    
    public String getnationalId() {
        return nationalId;
    }
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
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
