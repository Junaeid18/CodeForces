import java.util.Scanner;

public class Prb_379A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),b = s.nextInt(),res=0,sum=a,rem=0;
        while (a >= b){
            res = a/b;     sum += res;     rem = a%b;      a = res+rem;
        }
        System.out.println(sum);
    }
}
