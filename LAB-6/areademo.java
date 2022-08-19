import java.util.Scanner;
class shape {
    float area;
    void showarea() {
        System.out.println("\nArea is: " + area +"\n");
    }
}
class circle extends shape {
    float r;
    void calc() {
        area = (float)3.14*r*r;
        showarea();
    }
}
class rectangle extends shape {
    float l,b;
    void calr() {
        area = (float)l*b;
        showarea();
    }
}
class areademo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        circle obj1 = new circle();
        System.out.println("\n-----CIRCLE-----");
        System.out.print("Enter Radius: ");
        obj1.r = input.nextFloat();
        obj1.calc();
        rectangle obj2 = new rectangle();
        System.out.println("\n-----RECTANGLE-----");
        System.out.print("Enter Length and Breadth: ");
        obj2.l = input.nextFloat();
        obj2.b = input.nextFloat();
        obj2.calr();
        input.close();
    }
}
