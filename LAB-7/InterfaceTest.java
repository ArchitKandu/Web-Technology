import java.util.*;
interface A {
    void earnings(int bp);
    void deductions(int bp);
    void bonus(int bp);
}
abstract class Manager implements A {
    public void earnings(int bp) {
        double e,da,hra;
        da=0.12*bp;
        hra=0.15*bp;
        e=bp+da+hra;
        System.out.println("Earnings is: "+e);
    }
    public void deductions(int bp) {
        double d;
        d=0.12*bp;
        System.out.println("Deductions is: "+d);
    }
}
class Substaff extends Manager {
    public void bonus(int bp) {
        double b;
        b=0.5*bp;
        System.out.println("Bonus is: "+b+"\n");
    }
}
public class InterfaceTest{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bp;
        System.out.print("\nEnter Basic Pay: ");
        bp = input.nextInt();
        Substaff obj = new Substaff();
        obj.earnings(bp);
        obj.deductions(bp);
        obj.bonus(bp);
        input.close();
    }
}
