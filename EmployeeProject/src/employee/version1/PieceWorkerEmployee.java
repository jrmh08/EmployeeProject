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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired = new Date();
    private Date empBirthDate = new Date();
    private int totalPiecesFinished;
    private double ratePerPiece;
    
    public PieceWorkerEmployee(int id, int finished, double rate){
        this.empName = "Undefined";
        this.setEmpID(id);
        this.setTotalPiecesFinished(finished);
        this.setRatePerPiece(rate);
    }
    
    public PieceWorkerEmployee(int id, String name, Date hired, Date bday, int finished, double rate){
        this.empID = id;
        this.empName = name;
        this.empDateHired = hired;
        this.empBirthDate = bday;
        this.totalPiecesFinished = finished;
        this.ratePerPiece = rate;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        double salary;
        double bonus = (this.totalPiecesFinished > 100)? this.totalPiecesFinished / 100 : 0;
        salary = (this.totalPiecesFinished * this.ratePerPiece) + (bonus*(this.ratePerPiece*10));
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
           append("Total Sales: ").append(this.totalPiecesFinished).append("\n").
           append("Rate/Piece: ").append(this.ratePerPiece).append("\n").
           append("Salary: ").append(df.format(this.computeSalary()));
        
        
        return sb.toString();
    }
    
    
}
