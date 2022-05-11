/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
public class IIyaAndQueries {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        String inp = s.nextLine();
        int m = s.nextInt(),l,r,result;
        while(m-- > 0){
            l = s.nextInt() - 1;    r = s.nextInt() - 1;    result = 0;
            while(l < r){
                if(inp.charAt(l) == inp.charAt(l+1))++result;   ++l;
            }
            out.append(result+"\n");
        }
        System.out.print(out);
    }
}
