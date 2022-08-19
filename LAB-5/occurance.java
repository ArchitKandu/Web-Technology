import java.util.Scanner;

class occurance {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n,temp=0,rep=0,count=0;
        System.out.print("\nEnter Size: ");
        n = input.nextInt();
        int arr[];
        arr = new int[n];
        int visited[];
        visited = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        for(int i=0;i<n;i++) {
            temp=arr[i];
            rep=0;
            count=0;
            for(int j=0;j<n;j++) {
                for(int k=0;k<i;k++) {
                    if(temp==visited[k])
                        count=count+1;
                }
                if(count==0){
                    if(temp==arr[j]) {
                        rep=rep+1;
                        visited[i]=temp;
                    }
                }
                else
                    continue;
            }
            if(count==0)
                System.out.print("\n" + temp + " occured " + rep + " times");
        }
        System.out.println("\n");
        input.close();
    }
}
