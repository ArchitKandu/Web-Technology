import java.util.Scanner;
import java.lang.Math;
class areamenu {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int ch;
        double l,x,y,z,r,s;
        double temp,area=0;
        while(0<1) {
            System.out.print("\n1. Circle\n2. Square\n3. Triangle\n0. Exit\nEnter choice: ");
            ch = input.nextInt();
            if(ch==0) break;
            else {
                switch(ch) {
                    case 1:
                        System.out.print("Enter radius: ");
                        r = input.nextDouble();
                        area = 3.1416*r*r;
                        System.out.print("Area of Circle: " + area + "\n");
                        break;
                    case 2:
                        System.out.print("Enter length: ");
                        l = input.nextDouble();
                        area = l*l;
                        System.out.print("Area of Square: " + area + "\n");
                        break;
                    case 3:
                        System.out.print("Enter three sides: ");
                        x = input.nextDouble();
                        y = input.nextDouble();
                        z = input.nextDouble();
                        s = x+y+z;
                        temp = s*(s-x)*(s-y)*(s-z);
                        area = Math.sqrt(temp);
                        System.out.print("Area of Triangle: " + area + "\n");
                        break;
                    default:
                        System.out.println("Invalid Choice!!\n");
                }
            }
        }
        input.close();
    }
}
