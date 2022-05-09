/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
import static java.lang.Math.max;
public class Boredom {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), ar[] = new long[100009];int max = 1,num,c = 0;
        while(c < n){
            num = s.nextInt();
            ar[num]++;  ++c;    max = max(max,num);
        }
        long[] arr = new long[max+1]; arr[0] = 0l; arr[1] = ar[1];
        for (int i = 2; i <= max; i++) {
            arr[i] = max(arr[i-1], arr[i-2]+ar[i]*i);
        }
        System.out.println(arr[max]);
    }
}
