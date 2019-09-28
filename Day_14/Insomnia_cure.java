package Day_14;

import java.util.Scanner;

public class Insomnia_cure {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt(), l = s.nextInt(), m = s.nextInt(), n  = s.nextInt() ,d = s.nextInt(),i=1,j=0;
        while(i<=d){
            if(i%k==0 || i%l==0 || i%m==0 ||i%n==0 ){j++;}
            i++;
        }
        System.out.println(j);
    }
}
