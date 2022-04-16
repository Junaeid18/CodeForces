/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class PloycarpAndCoin {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),n,res;
        while(count < testCase){
            n = s.nextInt();    res = n % 3;
            if(res == 0){System.out.println((n/3)+" "+(n/3));}    
            else if(res == 1){System.out.println((n/3+1) +" "+n/3);}
            else{System.out.println(n/3+" "+(n/3+1));}
            ++count;
        }
    }
}
