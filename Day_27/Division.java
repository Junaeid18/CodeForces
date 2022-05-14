/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(), n;
        while(testCase-- > 0){
            n = s.nextInt();
            if(n >= 1900)out.append("Division 1"+"\n");
            else if(n >= 1600 && n < 1900)out.append("Division 2"+"\n");
            else if(n >= 1400 && n < 1600)out.append("Division 3"+"\n");
            else out.append("Division 4"+"\n");
        }   s.close();
        System.out.print(out);
    }
}
