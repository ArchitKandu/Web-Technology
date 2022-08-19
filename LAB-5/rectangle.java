import java.util.Scanner;

class rectangle {
    float length,breadth,area,perimeter;
    void read() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Length and Breadth: ");
        length = input.nextFloat();
        breadth = input.nextFloat();
        input.close();
    }
    void calculate() {
        perimeter = 2*(length + breadth);
        area = length * breadth;
    }
    void display() {
        System.out.print("\nLENGTH: " + length + "\nBREADTH: " + breadth);
        System.out.println("\nPERIMETER: " + perimeter + "\nAREA: " + area + "\n");
    }
    public static void main(String args[]) {
        rectangle obj = new rectangle();
        obj.read();
        obj.calculate();
        obj.display();
    }
}
