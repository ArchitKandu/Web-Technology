import java.util.Scanner;
class overloaddemo {
    int sub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }
    float sub(float a,float b)
    {
        float sub=a-b;
        return sub;
    }
    int sub(int b)
    {
        int a=10;
        int sub=a-b;
        return sub;
    }
}
class overload {
    public static void main(String args[]) {
        int iia,iib,ib,iisub,isub;
        float fa,fb,fsub;
        Scanner input = new Scanner(System.in);
        System.out.println("\n-----Int and Int-----");
        System.out.print("Enter two integer: ");
        iia = input.nextInt();
        iib = input.nextInt();
        overloaddemo ob1 = new overloaddemo();
        iisub = ob1.sub(iia,iib);
        System.out.println("Sub of " + iia + " & " + iib + " is: " + iisub);
        System.out.println("\n-----float and float-----");
        System.out.print("Enter two float: ");
        fa = input.nextFloat();
        fb = input.nextFloat();
        overloaddemo ob2 = new overloaddemo();
        fsub = ob2.sub(fa,fb);
        System.out.println("Sub of " + fa + " & " + fb + " is: " + fsub);
        System.out.println("\n-----Int-----");
        System.out.print("Enter one integer: ");
        ib = input.nextInt();
        overloaddemo ob3 = new overloaddemo();
        isub = ob3.sub(ib);
        System.out.println("Sub of 10 & " + ib + " is: " + isub +"\n\n");
        input.close();
    }
}
