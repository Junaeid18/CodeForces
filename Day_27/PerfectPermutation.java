/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.Scanner;
public class PerfectPermutation {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int n = s.nextInt(),c=1; s.close();
        if(n%2 == 0){
            while(c <= n){
                out.append(String.valueOf(c+1)+" "+String.valueOf(c)+" ");  c += 2;
            }out.append("\n");
            System.out.print(out);
        }else System.out.println("-1");
    }
}
