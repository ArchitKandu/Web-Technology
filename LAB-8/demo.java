import java.util.*;
class NegativeNumberException extends Exception
{
    public String toString() {
        return "\nException: Given Number is Negative\n";
    }
}
class demo {
    static void processInput(int a) throws NegativeNumberException {
        if(a<0) 
            throw new NegativeNumberException();
        else
            System.out.println("\nResult: " + (2*a) +"\n");
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Number: ");
        int a = input.nextInt();
        try {
            processInput(a);
        }
        catch(NegativeNumberException e) {
            System.out.println(e);
        }
        input.close();
    }
}
