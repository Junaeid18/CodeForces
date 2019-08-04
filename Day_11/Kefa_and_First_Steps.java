package Day_11;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Kefa_and_First_Steps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int si = s.nextInt();
        int i =0,count=0,c=0,com=0,size =0;
        String in = s2.nextLine();
        size = in.length();
        Vector v = new Vector();
        while (i < size){
            c = Integer.parseInt(String.valueOf(in.charAt(i)));
            if(c >= com){
                i= i+2;
                count++;
                com = c;
            }else{
                v.add(count);
                i = i+2;
                count = 1;
                com = c;
            }
        }
        v.add(count);
        Collections.sort(v);
        System.out.println(v.lastElement());
    }
}
