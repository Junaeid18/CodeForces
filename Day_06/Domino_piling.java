package Day_06;

import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m =0 ,n=0,area,result;
        while(m < 1 && n < 1 ){
            m = s.nextInt();
            n = s.nextInt();
        }
        area = m * n;
        result = area / 2;
        System.out.println(result);
    }
}
