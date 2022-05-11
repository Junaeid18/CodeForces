/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
public class InterestingDrink {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int n = s.nextInt(),ar[] = new int[100008],count=0,c=0,max = 100000,q;     
        while(c < n){ ar[s.nextInt()]++; ++c;}
        for (int i = 1; i < 100001; i++) {
            if(ar[i] != 0)count+=ar[i];
            ar[i] = count;
        }
        q = s.nextInt();
        while(q-- > 0){
            c = s.nextInt();
            if(c > max)out.append(String.valueOf(count)+'\n');
            else out.append(String.valueOf(ar[c])+'\n');
        }s.close();
        System.out.print(out);
    }
}
