import java.lang.management.LockInfo;
import java.util.Scanner;
public class LongNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = 200000;
        long b = (long) a;
        long result = b * (b-1)/2;
        System.out.println(result);    
        result = 2 * 1/2;
        System.out.println(result);
    }    
}
