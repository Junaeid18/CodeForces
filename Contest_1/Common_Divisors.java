package Contest_1;

import java.util.Scanner;

public class Common_Divisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=0,count=1;
        int[] a = new int[n];
        while(i<n){
            a[i] = s.nextInt(); i++;
        }
        for (int j = 0; j < n; j++) {
            for (int k = 1; k < (n-j); k++) {
                if(a[k-1] > a[k]){
                    int t = a[k-1];
                    a[k-1] = a[k];
                    a[k] = t;
                }
            }
        }i=0;int k=2; int c = a[i];
        while (i == 0){
            int j=0;
            if(k <= c){
                int flag = 0;
                while(j < n && flag == 0){
                    if(a[j]%k == 0){
                        j++;
                    }else flag = 1;
                }
                if(flag == 0 ) count++;
            }else i = 1;
            k++;
        }
        System.out.println(count);
    }
}
