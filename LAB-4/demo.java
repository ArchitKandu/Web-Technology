import java.util.Scanner;

class box {
    double length;
    double width;
    double height;
    void volume()
    {
        System.out.println("\nVolume is: " + (length*width*height));
        System.out.println("Length: " + length + "\nWidth: " + width + "\nHeight: " + height + "\n");
    }
}
class demo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        box obj = new box();
        System.out.print("\nEnter Length: ");
        obj.length = input.nextDouble();
        System.out.print("Enter Width: ");
        obj.width = input.nextDouble();
        System.out.print("Enter height: ");
        obj.height = input.nextDouble();
        obj.volume();
        input.close();
    }
}
