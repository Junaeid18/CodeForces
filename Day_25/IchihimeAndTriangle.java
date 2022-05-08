/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
public class IchihimeAndTriangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(),a,b,c,d;
        while(testCase-- > 0){
            a = s.nextInt();    b = s.nextInt();    c = s.nextInt();    d = s.nextInt();
            out.append(b+" "+c+" "+c+"\n");
        }s.close();
        System.out.print(out);   
    }
}
