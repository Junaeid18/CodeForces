import java.util.*;

public class Cut_Ribbon_189A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a ,b,c, sum1=0,sum2=0,i,j,k;
        Vector v  = new Vector();
        v.add(s.nextInt());v.add(s.nextInt());v.add(s.nextInt());
        Collections.sort(v);
        a = (int) v.elementAt(0); b = (int) v.elementAt(1); c = (int) v.elementAt(2);
        if(n%a == 0){
            sum1 = n/a;
        }else{
            while (true){
                sum2 = n - b;
                sum1++;
                if(sum2%a == 0){
                    sum1 += sum2/a;
                }
            }
        }
        /*

           problem not solved

             */

    }
}
