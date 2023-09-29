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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Employee e1 = new HourlyEmployee(18103280, 45, 453.23);
        HourlyEmployee e1 = new HourlyEmployee(18103281, "JReece", new Date(9,25,2020), new Date(12,15,2000), 45, 500.25);
        PieceWorkerEmployee p1 = new PieceWorkerEmployee(19238596, "James", new Date(2, 26, 2019), new Date(3, 11, 2001), 150, 653.75);
        CommissionEmployee c1 = new CommissionEmployee(19283743, "Precious", new Date(2, 30, 2021), new Date(5, 12, 2002), 55600.00);
        BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee(19283743, "Tyrone", new Date(12, 25, 2021), new Date(7, 12, 2001), 90100.75, 525.00);
        
        e1.displayInfo();
        System.out.println("\n");
        p1.displayInfo();
        System.out.println("\n");
        c1.displayInfo();
        System.out.println("\n");
        b1.displayInfo();
    }
    
}
