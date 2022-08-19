import java.util.*;
import java.lang.*;
class stringoutput {
    public static void main(String args[]) {
        String str = "EW AAJV VOEL";
        String s1 = str.substring(0,3);
        String s2 = str.substring(3,8);
        String s3 = str.substring(8,12);
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        char c3[] = s3.toCharArray();
        StringBuffer rs1 = new StringBuffer(s1.length());
        StringBuffer rs2 = new StringBuffer(s2.length());
        StringBuffer rs3 = new StringBuffer(s3.length());
        StringBuffer result = new StringBuffer();
        System.out.println("\nINPUT: " +str);
        char t1,t21,t22,t23,t31,t32;
        t1=c1[1];
        c1[1]=c1[0];
        c1[0]=t1;
        rs1.append(c1);
        t21=c2[2];
        t22=c2[0];
        t23=c2[3];
        c2[3]=c2[1];
        c2[0]=t21;
        c2[1]=t22;
        c2[2]=t23;
        rs2.append(c2);
        t31=c3[0];
        t32=c3[2];
        c3[0]=c3[3];
        c3[2]=t31;
        c3[3]=t32;
        rs3.append(c3);
        result.append(rs1);
        result.append(rs3);
        result.append(" ");
        result.append(rs2);
        System.out.println("OUTPUT: " +result+"\n");
    }
}
