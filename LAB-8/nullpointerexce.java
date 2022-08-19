import java.util.*;
class nullpointerexce
{
    public static void main(String args[]) {
        String ptr = null;
        try
        { 
            System.out.println(ptr.length());
        }
        catch (NullPointerException e) 
        {
            System.out.println("\nNullPointerException caught\n");
        }
    }
}
