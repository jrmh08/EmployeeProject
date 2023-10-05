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
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    
    public PieceWorkerEmployee(int id, int finished, double rate){
        super(id);
        this.setEmpID(id);
        this.setTotalPiecesFinished(finished);
        this.setRatePerPiece(rate);
    }
    
    public PieceWorkerEmployee(int id, Name name, Date hired, Date bday, int finished, double rate){
        super(id, name, hired, bday);
        this.totalPiecesFinished = finished;
        this.ratePerPiece = rate;
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
        
        sb.append("EmpID: ").append(super.empID).append("\n").
           append("EmpName: ").append(super.empName).append("\n").
           append("EmpDateHired: ").append(super.empDateHired).append("\n").
           append("EmpBirthDate: ").append(super.empBirthDate).append("\n").
           append("Total Sales: ").append(this.totalPiecesFinished).append("\n").
           append("Rate/Piece: ").append(this.ratePerPiece).append("\n").
           append("Salary: ").append(df.format(this.computeSalary()));
        
        return sb.toString();
    }
    
    
}
