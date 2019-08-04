package Day_13;

import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt(),res=Integer.MAX_VALUE;
        int a = n-1;
        int[] ar = new int[m];
        for (int l = 0; l < m; l++) {
            ar[l] = s.nextInt();
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < m-1; j++) {
                if(ar[j] > ar[j+1]){
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i <(m-a); i++) {
            if(ar[i+a] - ar[i] < res){
                res = ar[i+a] - ar[i];
            }
        }
        System.out.println(res);
    }
}
