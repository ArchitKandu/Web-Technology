package Marketing;
import java.util.*;
import General.employee;
public class sales extends employee {
    public double tallowence(double e) {
        double t;
        t = 0.05*e;
        return t;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bp;
        double ea,ta;
        sales obj = new sales();
        System.out.print("\nEnter EmployeeID: ");
        obj.empID = input.nextInt();
        System.out.print("Enter Basic Pay: ");
        bp = input.nextInt();
        ea = obj.earnings(bp);
        ta = obj.tallowence(ea);
        System.out.println("Total Earnings: " + ea);
        System.out.println("Total Travelling Allowances: " + ta +"\n");
        input.close();
    }
}
