/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-24
*/
import java.util.Scanner;
public class OddSet {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),oddCount,n,num,inC;    
        while(count < testCase){
            n = s.nextInt();    oddCount = inC = 0;
            while(inC < 2*n){     if(s.nextInt()%2 == 1){ ++oddCount;}    ++inC;}
            if(oddCount == n){  System.out.println("YES");}
            else{   System.out.println("NO");}  ++count;
        }
    }
}
