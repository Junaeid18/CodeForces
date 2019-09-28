import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Prb_4C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector<String> v = new Vector<String>();
        int n = s.nextInt(),i=1,j;
        String in = s.next(); v.add(in);
        System.out.println("OK");
        while (i < n){
            in = s.next();
            if(v.contains(in)){
                j = Collections.frequency(v,in); v.add(in);
                in = in.concat(String.valueOf(j)); System.out.println(in);
            }else{
                v.add(in);
                System.out.println("OK");
            }i++;

            /* not solved */

        }
    }
}
