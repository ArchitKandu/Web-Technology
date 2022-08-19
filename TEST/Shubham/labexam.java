import java.util.*;
import java.lang.*;
class NoTriangleFormException extends Exception {
    public String toString() {
        return "\nNo Triangle Form Exception found!!";
    }
}
class Triangle {
    double a,b,c;
    Triangle(double x, double y, double z)
    {
        a=x;
        b=y;
        c=z;
    }
    public double perimeter()
    {
        double p;
        p = a+b+c;
        return p;
    }
    public double area()
    {
        double p,s,temp,rarea;
        p = perimeter();
        s=p/2;
        temp = s*(s-a)*(s-b)*(s-c);
        rarea = Math.sqrt(temp);
        return rarea;
    }
    static void processInput(double a, double b, double c, Triangle eobj) throws NoTriangleFormException {
        if(((a+b)<c) || ((b+c)<a) || ((a+c)<b))
            throw new NoTriangleFormException();
        else
        {
            double aresult = eobj.area();
            double presult = eobj.perimeter();
            System.out.println("\nPerimeter is: " + presult);
            System.out.println("Area is: " + aresult + "\n");
        }
    }
}
class labexam {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double x,y,z;
        System.out.print("\nEnter Sides a,b,c: ");
        x=input.nextDouble();
        y=input.nextDouble();
        z=input.nextDouble();
        Triangle obj = new Triangle(x,y,z);
        try 
        {
            Triangle.processInput(x,y,z,obj);
        }
        catch (NoTriangleFormException e)
        {
            System.out.println(e);
        }
        input.close();
    }
}
