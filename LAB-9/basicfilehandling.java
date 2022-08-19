import java.util.*;
import java.lang.*;
import java.io.*;
class basicfilehandling {
    public static void main(String args[]) throws IOException {
        char ch1[] = new char[50];
        FileInputStream file1 = new FileInputStream("file1.txt");
        FileWriter fin = new FileWriter("file2.txt");
        InputStreamReader input1 = new InputStreamReader(file1);
        input1.read(ch1);
        System.out.print("\nData in File1: ");
        System.out.println(ch1);
        StringBuffer str = new StringBuffer();
        str.append(ch1);
        str.reverse();
        String tstr = str.toString();
        String rstr = tstr.trim();
        fin.write(rstr);
        fin.close();
        input1.close();
        char ch2[] = new char[50];
        FileInputStream file2 = new FileInputStream("file2.txt");
        InputStreamReader input2 = new InputStreamReader(file2);
        input2.read(ch1);
        System.out.print("\nData in File2: ");
        System.out.println(ch1);
        System.out.println("");
        input2.close();
    }
}
