import java.util.Scanner;
public class Practice_demo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = gcd(20,40);

        System.out.println(a);

    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
