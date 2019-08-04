package Day_10;

import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),sum = 0,e;
        double d;
        int[] ar = new int[n];
        for (int i = 0; i < n ; i++) {
            ar[i] = s.nextInt();
            sum += ar[i];
        }
        d = sum/n;
        e = sum/n;
        if(d > e) e = (int)d + 1;
        else e = (int)d;
        while(e < sum){

        }
    }
}
