import java.util.Scanner;

class oddeven{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num[];
        num = new int[10];
        int even=0;
        int odd=0;
        System.out.print("\n");
        for(int i=0;i<10;i++){
            System.out.print("Enter number " + (i+1) + ": ");
            num[i] = input.nextInt();
        }
        for(int i=0;i<10;i++){
            if(num[i]%2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("There are total " + even + " even numbers and " + odd + " odd numbers\n");
        input.close();
    }
}
