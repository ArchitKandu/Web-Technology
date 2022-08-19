import java.util.Scanner;

class student {
    int roll;
    String name;
    float cgpa;
}
class nstudents {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter n: ");
        int n = input.nextInt();
        student[] s;
        s = new student[n];
        for(int i=0;i<n;i++)
            s[i] = new student();
        for(int i=0;i<n;i++) {
            System.out.println("-----STUDENT " + (i+1) + " -----");
            System.out.print("Enter RollNo.: ");
            s[i].roll = input.nextInt();
            System.out.print("Enter Name: ");
            s[i].name = input.next();
            System.out.print("Enter CGPA: ");
            s[i].cgpa = input.nextFloat();
        }
        float min=s[0].cgpa;
        int count=0;
        for(int i=1;i<n;i++) {
            if(s[i].cgpa < min) {
                min = s[i].cgpa;
                count=i;
            }           
        }
        System.out.println("\n" + s[count].name +" has lowest cgpa of " + s[count].cgpa + "\n");
        input.close();
    }
}
