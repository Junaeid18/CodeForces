package Day_10;

import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t = s.nextInt(),count = 0,turn = 0;
        String in = s.next();
        char[] ar = in.toCharArray();
        char s1,s2;
        int size = n;
        while(turn < t) {
            while (count < size - 1) {
                int i = count, j = count+1;
                s1 = ar[i];
                s2 = ar[j];
                if (s1 == 'B' && s2 == 'G') {
                    ar[i] = s2;
                    ar[j] = s1;
                    count++;
                    count++;
                } else count++;
            }
            turn++;
            count = 0;
        }
        in = new String(ar);
        System.out.println(in);
    }
}
