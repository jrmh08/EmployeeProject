/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

import java.text.DecimalFormat;

/**
 *
 * @author jerem
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(int id, double sales, double bsalary){
        super(id, sales);
        this.setEmpID(id);
        this.setTotalSales(sales);
        this.setBaseSalary(bsalary);
    }
    
    public BasePlusCommissionEmployee(int id, Name name, Date hired, Date bday, double sales, double bsalary){
        super(id, name, hired, bday, sales);
        this.empID = id;
        this.empName = name;
        this.empDateHired = hired;
        this.empBirthDate = bday;
        this.totalSales = sales;
        this.baseSalary = bsalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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
        return salary + this.baseSalary;
    }
    
    private static DecimalFormat df = new DecimalFormat("0.00");
    
    @Override
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
           append("Base Salary: ").append(this.baseSalary).append("\n").
           append("Salary: ").append(df.format(this.computeSalary()));
        
        return sb.toString();
    }
    
}
