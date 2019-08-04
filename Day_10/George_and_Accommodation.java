package Day_10;

import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),p=0,q=0,sum,count=0;
        int[][] ar = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 ; j++) {
                ar[i][j] = s.nextInt();
                if(j == 0){
                    p = ar[i][j];
                }else q = ar[i][j];
            }
            sum = q-p;
            if(sum >= 2) count++;
        }
        System.out.println(count);
    }
}
