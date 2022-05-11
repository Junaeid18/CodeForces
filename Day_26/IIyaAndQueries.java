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
public class IIyaAndQueries {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        String inp = s.nextLine();
        int m = s.nextInt(),l,r,result = 0,count = 1;
        int[] ar = new int[inp.length()];
        while(count < inp.length()){
            if(inp.charAt(count-1) == inp.charAt(count)){
                ++result;   ar[count] = result;
            }else ar[count] = result;    ++count;
        }
        while(m-- > 0){
            l = s.nextInt() - 1;    r = s.nextInt() - 1;  result = 0;
            result = ar[r] - ar[l];  
            out.append(result+"\n");
        }
        System.out.print(out);
    }
}
