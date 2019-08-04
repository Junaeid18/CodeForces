
package Day_01;

import java.util.Scanner;

public class Problem_4A {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        byte a = s.nextByte();
        if((a>2) && (a % 2 == 0))
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
