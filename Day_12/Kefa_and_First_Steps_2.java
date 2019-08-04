package Day_12;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Kefa_and_First_Steps_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt(),i =0,count=0,c=0;
        Vector v = new Vector(n);
        Vector v2 = new Vector();
        for (int j = 0; j < n; j++) {
            v.add(s.nextInt());
        }
        while (i < n){
            int k  = (int) v.elementAt(i);
            if(k >= c){
                i++;
                count++;
                c = k;
            }else {
                v2.add(count);
                count = 1;
                c = k;
                i++;
            }
        }
        v2.add(count);
        Collections.sort(v2);
        System.out.println(v2.lastElement());
    }
}
