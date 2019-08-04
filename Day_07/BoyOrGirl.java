package Day_07;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int n = (int) in.chars().distinct().count();
        if(n % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else System.out.println("IGNORE HIM!");
    }
}
