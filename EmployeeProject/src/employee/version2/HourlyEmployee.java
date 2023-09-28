/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private double totalHoursWorked;
    private double ratePerHour;
    
    public HourlyEmployee(int id, double hours, double rate){
        super(id);
        super.setEmpName("Undefined");
        this.setEmpID(id);
        this.setTotalHoursWorked(hours);
        this.setRatePerHour(rate);
    }
    
    public HourlyEmployee(int id, String name, Date hired, Date bday, double hours, double rate){
        super(id, name, hired, bday);
        this.totalHoursWorked = hours;
        this.ratePerHour = rate;
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
    
    public double computeSalary(){
        double salary;
        double overtime = (this.totalHoursWorked > 40)? this.totalHoursWorked % 40 : 0;
        salary = (this.totalHoursWorked * this.ratePerHour)+(overtime*1.5);
        return salary;
    }
    
    private static DecimalFormat df = new DecimalFormat("0.00");
    
    public void displayInfo(){
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("EmpID: ").append(super.empID).append("\n").
           append("EmpName: ").append(super.empName).append("\n").
           append("EmpDateHired: ").append(super.empDateHired).append("\n").
           append("EmpBirthDate: ").append(super.empBirthDate).append("\n").
           append("Total Hours Worked: ").append(this.totalHoursWorked).append("\n").
           append("Rate Per Hour: ").append(this.ratePerHour).append("\n").
           append("Salary: ").append(df.format(this.computeSalary()));

        return sb.toString();
    }
    
}
