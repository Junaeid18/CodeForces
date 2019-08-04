package Day_08;

import java.util.Scanner;

public class Young_physicist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n < 1 && n> 100){
            n = s.nextInt();
        }
        int[][] ar = new int[n][3];
        int sum1=0,sum2=0,sum3=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0){
                    sum1 += s.nextInt();
                }else if (j == 1){
                    sum2 += s.nextInt();
                }else sum3 += s.nextInt();
            }
        }
        if(sum1 == 0 && sum2 == 0 && sum3 == 0 ) System.out.println("YES");
        else System.out.println("NO");
    }
}
