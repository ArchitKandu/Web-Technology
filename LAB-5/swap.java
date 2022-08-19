import java.util.Scanner;

class swap {
    int arr[],n,min,max,pmin,pmax;
    void read() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter total number of elements: ");
        n = input.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = input.nextInt();
        }
        input.close();
    }
    void swapping() {
        int temp;
        min=arr[0];
        max=arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        for(int i=0;i<n;i++) {
            if(arr[i]==max)
                pmax=i;
        }
        for(int i=0;i<n;i++) {
            if(arr[i]==min)
                pmin=i;
        }
        temp = arr[pmax];
        arr[pmax] = arr[pmin];
        arr[pmin] = temp;
    }
    void display() {
        System.out.print("Array is: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        swap obj = new swap();
        obj.read();
        System.out.println("\nORIGINAL: ");
        obj.display();
        obj.swapping();
        System.out.println("\nSWAPPED: ");
        obj.display();
        System.out.println("\n");
    }
}
