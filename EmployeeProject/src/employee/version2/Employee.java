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
public class Employee {
    protected int empID;
    protected String empName;
    protected Date empDateHired = new Date();
    protected Date empBirthDate = new Date();
    
    public Employee(int id){
        this.empID = id;
    }
    
    public Employee(int id, Date hired){
        this.empID = id;
        this.empDateHired = hired;
    }
    
    public Employee(int id, String name, Date hired, Date bday){
        this.empID = id;
        this.empName = name;
        this.empDateHired = hired;
        this.empBirthDate = bday;
    }

    public int getEmpID() {
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
      
}
