package Day_06;

import java.util.Scanner;

public class Word_capitalization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 0;
        String in = null;
        while(size < 1 || size > 1000){
            in = s.next();
            size = in.length();
            char c = Character.toUpperCase(in.charAt(0));
            String b = Character.toString(c);
            in = in.replaceFirst(Character.toString((in.charAt(0))),b);
        }
        System.out.println(in);
    }
}
