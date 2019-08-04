package Day_12;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),step = 0;
        if( n >= 5){
            int r = n/5;
            n = n - (r *5);
            step += r;
        }if (n >= 4){
            int r = n/4;
            n = n - (r * 4);
            step += r;
        }if (n >= 3){
            int r = n/3;
            n = n - (r * 3);
            step += r;
        }if (n >= 2){
            int r = n/2;
            n = n - (r * 2);
            step += r;
        }if(n >= 1){
            step++;
        }
        System.out.println(step);
    }
}
