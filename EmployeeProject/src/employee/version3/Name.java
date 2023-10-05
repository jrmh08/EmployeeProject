/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

/**
 *
 * @author jerem
 */
public class Name {
    protected String Fname;
    protected String MI;
    protected String Lname;
    
    public Name(){
        this.Fname = "Undefined";
        this.MI = "U";
        this.Lname = "Undef";
    }
    
    public Name(String fname, String mi, String lname){
        this.Fname = fname;
        this.MI = mi;
        this.Lname = lname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getMI() {
        return MI;
    }

    public void setMI(String MI) {
        this.MI = MI;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }
    
    public void displayName(){
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.Fname).append(" ")
          .append(this.MI).append(". ")
          .append(this.Lname);
        
        return sb.toString();
                
    }
    
}
