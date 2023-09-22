/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.text.DecimalFormat;

/**
 *
 * @author jerem
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired = new Date();
    private Date empBirthDate = new Date();
    private double totalHoursWorked;
    private double ratePerHour;
    
    public HourlyEmployee(int id, int hours, int rate){
        this.empName = "Undefined";
        this.setEmpID(id);
        this.setTotalHoursWorked(hours);
        this.setRatePerHour(rate);
        
    }
                
    public HourlyEmployee(int id, String name, Date hired, Date bday, double hours, double rate){
        this.empID = id;
        this.empName = name;
        this.empDateHired = hired;
        this.empBirthDate = bday;
        this.totalHoursWorked = hours;
        this.ratePerHour = rate;
    }
    
    
    
    public int getEmpID(){
        return empID;
    }
    
    public void setEmpID(int empID){
        this.empID = empID;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public void setEmpName(String empName){
        this.empName = empName;
    }
    
    public Date getEmpDateHired(){
        return empDateHired;
    }
    
    public void setEmpDateHired(Date empDateHired){
        this.empDateHired = empDateHired;
    }
    
    public Date getEmpBirthDate(){
        return empBirthDate;
    }
    
    public void setEmpBirthDate(Date empBirthDate){
        this.empBirthDate = empBirthDate;
    }
    
    public double getTotalHoursWorked(){
        return totalHoursWorked;
    }
    
    public void setTotalHoursWorked(int totalHoursWorked){
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public double getRatePerHour(){
        return ratePerHour;
    }
    
    public void setRatePerHour(int ratePerHour){
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
        return 
                "EmpID: "+this.empID+"\n"+
                "EmpName: "+this.empName+"\n"+
                "EmpDateHired: "+this.empDateHired+"\n"+
                "EmpBirthDate: "+this.empBirthDate+"\n"+
                "Hours Worked: "+this.totalHoursWorked+"\n"+
                "Rate per Hour: "+this.ratePerHour+"\n"+
                "Salary: "+df.format(this.computeSalary());
    }
    
    
}
