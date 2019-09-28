package Contest_1;

import java.util.Scanner;

public class Complete_the_Projects {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), r = s.nextInt(),i=0;   int[] ar = new int[n];  int[] ar2 = new int[n];
        while(i < n){
            ar[i] = s.nextInt();
            ar2[i] = s.nextInt(); i++;
        }
        int p = n + r;
        for (int j = 0; j < n; j++) {
            for (int k = 1; k < (n-j); k++) {
                 if(ar[k-1] >= ar[k]){
                     int t3 = ar[k-1];    int t4 = ar2[k-1];
                     ar[k-1] = ar[k];    ar2[k-1] = ar2[k];
                     ar[k] = t3;          ar2[k] = t4;
                 }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int k = 1; k < (n-j); k++) {
               /* if(){

                }
                */
            }
        }
        for (int j = 0; j < n ; j++) {
            System.out.println(ar[j]+" "+ar2[j]);
        }
    }
}
