package Day_06;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n < 1 && n > 1000){
             n = s.nextInt();
        }
        int[][] ar = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i <n ; i++) {
            int c = 0;
            for (int j = 0; j <3 ; j++) {
                if(ar[i][j] == 1){
                    c++;
                }
            }
            if(c >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
