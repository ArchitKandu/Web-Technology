import java.util.Scanner;

class threenumbers{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int arr[];
        arr = new int[3];
        System.out.print("\n");
        for(int i=0;i<3;i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        if((arr[0]>arr[1]) && (arr[0]>arr[2])) 
            System.out.println("The largest is: " + arr[0] + "\n");
        else if((arr[1]>arr[0]) && (arr[1]>arr[2])) 
            System.out.println("The largest is: " + arr[1] + "\n");
        else
            System.out.println("The largest is: " + arr[2] + "\n");
        input.close();
    }
}
