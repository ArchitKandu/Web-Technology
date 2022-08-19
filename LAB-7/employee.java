package General;
import java.util.*;
public class employee {
    protected int empID;
    private String empName;
    public double earnings(int bp) {
        double e,da,hra;
        da=0.8*bp;
        hra=0.15*bp;
        e=bp+da+hra;
        return e;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bp;
        double ea;
        employee obj = new employee();
        System.out.print("\nEnter EmployeeID: ");
        obj.empID = input.nextInt();
        System.out.print("Enter Employee Name: ");
        obj.empName = input.next();
        System.out.print("Enter Basic Pay: ");
        bp = input.nextInt();
        ea = obj.earnings(bp);
        System.out.println("Total Earnings: " + ea);
        input.close();
    }
}
