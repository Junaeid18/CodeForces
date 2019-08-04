package Day_07;

import java.util.Scanner;

public class Stones_on_Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String in = s.next();
        int count = 0;
        for (int i = 0; i < a-1; i++) {
            if(in.charAt(i) == in.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
