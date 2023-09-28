/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

/**
 *
 * @author jerem
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HourlyEmployee h1 = new HourlyEmployee(18103280, "Jeremiah", new Date(2, 31, 2021), new Date(12, 15, 2000), 42, 350.50);
        PieceWorkerEmployee p1 = new PieceWorkerEmployee(28437284, "Angelou", new Date(9, 22, 2021), new Date(10, 22, 2002), 102, 500.75);
        CommissionEmployee c1 = new CommissionEmployee(19384726, "Angelo", new Date(2,29,2021), new Date(1, 28, 1998), 62500.25);
        CommissionEmployee c2 = new CommissionEmployee(18393823, new Date(1, 28, 2019), 75450.50);
        BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee(19384726, "Angelo", new Date(2,29,2021), new Date(1, 28, 1998), 62500.25, 10500);
        
//        h1.displayInfo();
//        p1.displayInfo();
//          c1.displayInfo();
//          c2.displayInfo();
//          b1.displayInfo();
    }
    
}
