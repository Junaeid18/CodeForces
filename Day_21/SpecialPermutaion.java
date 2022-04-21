/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
   -----<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class SpecialPermutaion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder();    String a;
        int count = 0, testCase = s.nextInt(),n,f,l,inc;
        while(count < testCase){
            n = s.nextInt();   
            if(n%2 == 0){
                for (int i = 2; i <= n; i+=2) { str.append(i+" ");}
                for (int i = 1; i <= n; i+=2) { str.append(i+" ");}
            }else{
                for (int i = 2; i <=n-1; i+=2) { str.append(i+" ");}
                str.append(n+" ");
                for (int i = 1; i <=n-1; i+=2) { str.append(i+" ");}
            }
            System.out.println(str);  str.setLength(0);  count++;
        }
    }
}
