package Contest_1;

import java.util.Scanner;

public class Circle_of_Students {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt(),n,i,j,l;
        while(q > 0){
            n = s.nextInt();i=0;j=0;l=0;
            int[] p = new int[n];
            while(i < n){
                p[i]  = s.nextInt();
                if(i > 0){
                    if((p[i]-p[i-1] == 1)&& l ==0){ }
                    else if(p[i]-p[i-1] >= 1){l=1;}
                }i++;
            }
            if(j == 0) System.out.println("YES");
            else System.out.println("NO");
            q--;
        }
    }
}
