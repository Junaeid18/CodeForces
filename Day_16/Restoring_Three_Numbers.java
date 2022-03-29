import java.util.Scanner;
import java.util.Arrays;
public class Restoring_Three_Numbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = new int[4];
        int count = 0, a,b,c;
        while(count < 4){
            ar[count] = s.nextInt();    ++count;
        }
        Arrays.sort(ar);
        //System.out.println(Arrays.toString(ar));
        c = ar[3] - ar[0];  b = ar[2] - c; a = ar[0] - b;
        System.out.println(a+" "+b+" "+c);
    }
}
