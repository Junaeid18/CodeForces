package Day_11;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next(),ou= s.next();
        int count = in.length(), c = count - 1,i = 0,j = 0,count2 = ou.length();
        if (count != count2) System.out.println("NO");
        else {
            while (c >= 0) {
                if (in.charAt(c) == ou.charAt(i)) {
                    c--;
                    i++;
                } else {
                    j = 1;
                    break;
                }
            }
            if (j == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
