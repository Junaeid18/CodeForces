/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-28
*/
import java.util.Scanner;
public class ArithmaticArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(),n,sum,c;
        while(testCase-- > 0){
            n = s.nextInt();    sum = 0;    c = n;
            while (c-- > 0) sum += s.nextInt();
            if(n == sum)out.append("0"+"\n");
            else if(n > sum)out.append("1"+"\n");
            else out.append(String.valueOf(sum-n)+"\n");
        }   s.close();
        System.out.print(out);
    }
}
