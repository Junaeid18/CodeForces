/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
import java.util.Arrays;
public class Twins {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int n = s.nextInt(), ar[] = new int[n],c=0,sum=0,target=0;  
        while(c < n){ ar[c] = s.nextInt(); sum += ar[c]; ++c;}
        sum /= 2;   Arrays.sort(ar);   --n; c = 0; 
        while(target <= sum){
            target += ar[n];    --n;    ++c;
        }s.close();
        System.out.println(c);
    }
}
