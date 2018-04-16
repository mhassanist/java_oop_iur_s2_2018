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
public class FreelanceEmployee extends BaseEmployee{
    
    double workingHours;
    double hourRate;
    
    @Override
    public double calculateSalary() {
        return hourRate * workingHours;
    }
    
    @Override
    public String getEmployeeInfo() {
        return name;
    }
    
}
