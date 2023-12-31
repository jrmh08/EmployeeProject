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
public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired = new Date();
    private Date empBirthDate = new Date();
    private double totalSales;
    
    public CommissionEmployee(int id, Date hired, double sales){
        this.empName = "Undef";
        this.setEmpID(id);
        this.setEmpDateHired(hired);
        this.setTotalSales(sales);
    }
    
    public CommissionEmployee(int id, String name, Date hired, Date bday, double sales){
        this.empID = id;
        this.empName = name;
        this.empDateHired = hired;
        this.empBirthDate = bday;
        this.totalSales = sales;
    }

    public int getEmpID(){
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double sales = this.totalSales;
        double salary;
        
        if(sales < 50000){
            salary = (sales * 0.05);
        }else if(sales >= 50000 && sales < 100000){
            salary = (sales * 0.2);
        }else if(sales >= 100000 && sales < 500000){
            salary = (sales * 0.3);
        }else{
            salary = (sales * 0.5);
        }
        return salary;
    }
    
    private static DecimalFormat df = new DecimalFormat("0.00");
    
    public void displayInfo(){
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("EmpID: ").append(this.empID).append("\n").
           append("EmpName: ").append(this.empName).append("\n").
           append("EmpDateHired: ").append(this.empDateHired).append("\n").
           append("EmpBirthDate: ").append(this.empBirthDate).append("\n").
           append("Total Sales: ").append(this.totalSales).append("\n").
           append("Salary: ").append(df.format(this.computeSalary()));
        
        
        return sb.toString();
    }
    
}
