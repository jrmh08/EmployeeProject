/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private double totalHoursWorked;
    private double ratePerHour;
    
    public HourlyEmployee(int id, int hours, int rate){
        super(id);
        super.setEmpID(id);
        this.setTotalHoursWorked(hours);
        this.setRatePerHour(rate);
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    
    
}
