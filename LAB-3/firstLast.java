import java.util.Scanner;

class firstLast {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter First Name: ");
        String fn = input.next();
        System.out.print("Enter Last Name: ");
        String ln = input.next();
        System.out.println("\nName: "+ln+" "+fn+"\n");
        input.close();
    }
}
