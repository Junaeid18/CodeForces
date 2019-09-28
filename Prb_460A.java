import java.util.Scanner;

public class Prb_460A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt(),res=0,i,j;
        i = n / m;
        res = n+i; j = res / m;
        while (j > i){
            res += (j-i);
            i = j ; j = res / m;
        }
        System.out.println(res);
    }
}
