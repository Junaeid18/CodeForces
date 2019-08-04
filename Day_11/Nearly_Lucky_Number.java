package Day_11;

import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int a = 0 ,b = 0, count  = in.length(), c = 0,lucky = 0;
        while (c < count){
            int n = Integer.parseInt(String.valueOf(in.charAt(c)));
            if(n == 4 || n == 7){
                lucky++;
            }c++;
        }
        if(lucky == 4 || lucky == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
