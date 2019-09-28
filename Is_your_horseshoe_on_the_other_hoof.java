import java.util.Arrays;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[4]; int count = 0;
        a[0] = s.nextInt(); a[1] = s.nextInt(); a[2] = s.nextInt(); a[3] = s.nextInt();
        Arrays.sort(a);
        if(a[0] == a[1]) count++;
        if(a[1] == a[2]) count++;
        if(a[2] == a[3]) count++;
        System.out.println(count);
    }
}
