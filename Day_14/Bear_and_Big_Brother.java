package Day_14;

import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), i = 0;
        while(true){
            if(a > b) break;
            else{
                a = a*3; b = b * 2;
            }i++;
        }
        System.out.println(i);
    }
}
