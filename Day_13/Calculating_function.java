package Day_13;

import java.util.Scanner;

public class Calculating_function {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long i,j,sum =0,tsum = 0,n = s.nextLong();
        if(n % 2 == 0){
            i = n / 2;
            j = i;
            tsum  = (i * ((-1+(-1*(n-1))) /2 ));
            sum += tsum;tsum =0;
            tsum = (j * ((2+n) /2 ));
            sum += tsum;
        }else{
            i = (n / 2) + 1;
            j = n - i;
            tsum  = (i * ((-1+(-1*(n))) /2 ));
            sum += tsum;tsum =0;
            tsum = (j * ((2+(n-1)) /2 ));
            sum += tsum;
        }
        System.out.println(sum);
    }
}


