package Day_07;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 1,n = 0,count =0 ,value = 0;
        while(size <= 1){
            n = s.nextInt();
            size = n;
        }
        int [][] ar = new int[n][2];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2 ; j++) {
                ar[i][j] = s.nextInt();
                if(j  == 0){
                    count -= ar[i][j];
                }else count += ar[i][j];
            }
            if(count >= value){
                value = count;
            }
        }
        System.out.println(value);
    }
}
