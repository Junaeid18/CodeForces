package Day_14;

import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(),k = s.nextLong();
        long i =1,j=1,l=0,p=0;int e=0;
        if(n % 2 == 0)e++;
        if(e > 0){
            p = n / 2;
            if(k <= p)l=0;
            else{
                i = p;
                l=1;
                j =0;
            }
        }else{
            p = n / 2;
            p++;
            if(k <= p)l=0;
            else{
                i = p;
                l = 1;
                j =0;
            }
        }
        System.out.println(e+" "+l+" "+j);
        while(i < k){
            if(l == 0){
                if(j+2 <= n){
                    j = j + 2;
                    i++;
                }
            }else{
                if(j+2 <= n){
                    j = j+2;
                    i++;
                }
            }
        }
        System.out.println(j);
    }
}
