import java.util.Scanner;
public class Maximum_GCD {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),res,n;
        while(count < testCase){
            n = s.nextInt(); res = n / 2;
            System.out.println(res);
            count++;
        }
    }
}