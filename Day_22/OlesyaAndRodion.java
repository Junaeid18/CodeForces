/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-22
*/
import java.util.Scanner;
public class OlesyaAndRodion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t = s.nextInt();
        StringBuilder out = new StringBuilder();
        if(n==1){
            if(t==10){out.append("-1");}else{out.append(String.valueOf(t));} }
        else{
            out.append(String.valueOf(t));
            int i = (t == 10)? 2 : 1;
            for (; i < n; i++) {   out.append(String.valueOf(0));}
        }   System.out.println(out);    s.close();
    }
}
