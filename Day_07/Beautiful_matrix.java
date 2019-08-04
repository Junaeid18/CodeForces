package Day_07;

import java.util.Scanner;

public class Beautiful_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,m=0,n=0,diff;
        int[][] ar = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                ar[i][j] = s.nextInt();
                if(ar[i][j] == 1){
                   m = i; n = j;
                }
            }
        }
        m = m + 1 ; n = n + 1 ;
        if(m >= 3) diff = m-3;
        else diff = 3 - m;
        if(n >= 3) diff += n - 3;
        else diff += 3-n;
        System.out.println(diff);
    }
}
