package Day_09;

import java.util.Scanner;

public class Soldier_Bananas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt(),sum=0,count=1,need,sum1=0;
        int n = s.nextInt();
        int w = s.nextInt();
        while(k < 1 && w >=1000 && n < 0 && n > 1000000000){
            k = s.nextInt();
            n = s.nextInt();
            w = s.nextInt();
        }
        while(count <= w){
            sum += count*k;
            sum1 += sum;
            count++;
        }
        need = sum - n;
        if(need > 0) System.out.println(need);
        else System.out.println(0);
    }
}
