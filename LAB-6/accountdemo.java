import java.util.Scanner;
class account {
    int accno;
    float balance;
    void disp() {
        System.out.println("\nAccount No.: " + accno);
        System.out.println("Balance: " + balance);
    }
}
class person extends account {
    String name;
    int aadhar;
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar: " + aadhar +"\n");
    }
}
class accountdemo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        person[] obj;
        obj = new person[3];
        for(int i=0;i<3;i++) {
            obj[i] = new person();
            System.out.println("\n-----PERSON " + (i+1) +"-----");
            System.out.print("\nEnter Account No.: ");
            obj[i].accno = input.nextInt();
            System.out.print("Enter Balance: ");
            obj[i].balance = input.nextFloat();
            System.out.print("Enter Name: ");
            obj[i].name = input.next();
            System.out.print("Enter Aadhar: ");
            obj[i].aadhar = input.nextInt();
        }
        for(int i=0;i<3;i++)
            obj[i].disp();
        input.close();
    }    
}
