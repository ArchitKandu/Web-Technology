import java.util.*;
import java.lang.*;
class stringoperation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str1;
        String str2;
        System.out.print("\nString 1: ");
        str1 = input.next();
        System.out.print("String 2: ");
        str2 = input.next();
        int len1=str1.length();
        int len2=str2.length();
        System.out.println("\nOriginal String: "+str1);
        char[] c1 = str1.toCharArray();
        for(int i=0;i<len1;i++)
            c1[i] = Character.toLowerCase(c1[i]);
        StringBuffer strbuffer1 = new StringBuffer(len1);
        strbuffer1.append(c1);
        System.out.print("UPPER to lower: "+strbuffer1);
        char[] c2 = str2.toCharArray();
        for(int i=0;i<len2;i++)
            c2[i] = Character.toUpperCase(c2[i]);
        StringBuffer strbuffer2 = new StringBuffer(len2);
        strbuffer2.append(c2);
        System.out.print("\nlower to UPPER: "+strbuffer2);
        StringBuffer rstr = new StringBuffer(str1);
        rstr.reverse();
        System.out.println("\nReversed str1: "+rstr);
        System.out.println("str1.equals(str2) = "+str1.equals(str2));
        strbuffer1.append(strbuffer2);
        System.out.println("Inserting strbuffer2 in strbuffer1 = "+strbuffer1+"\n");
        input.close();
    }
}
