package Day_14;

import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(),k = s.nextLong();
        long i,j,p=0;int e=0;
        if(n%2==0)e++;
        if(e>0){
            p = n/2;
            if(k <= p){
                i = 1;
                j = (2*k)+(-1);
            }else{
                k = k-p;
                j = (2*k);
            }
        }else{
            p = n/2;
            p++;
            if(k <= p){
                i = 1;
                j = (2*k)+(-1);
            }else{
                k = k-p;
                j = (2*k);
            }
        }
        System.out.println(j);

    }
}
