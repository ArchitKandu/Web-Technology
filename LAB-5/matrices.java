import java.util.Scanner;

class matrices {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arr[] [] = new int [3] [3];
        int rsum,lsum=0;
        System.out.print("\n");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print("Enter arr[" + (i+1) +"][" + (j+1) + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        lsum = arr[0][0] + arr[1][1] + arr[2][2];
        rsum = arr[0][2] + arr[1][1] + arr[2][0];
        System.out.println("\nSum of left diagonal: " + lsum + "\nSum of right diagonal: " + rsum +"\n");
        input.close();
    }
}
