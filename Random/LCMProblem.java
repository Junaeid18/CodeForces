/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
public class LCMProblem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt(),l,r,x=0,y=0;   
        while(testCase-- > 0){
            l = s.nextInt();    r = s.nextInt(); if(l == 0)++l;
            if(r%l == 0){x = l; y = r;}
            else if(r/l > 1){x = l; y = 2 * x;}
            else{x = -1; y = -1;}
            System.out.println(x+" "+y);
        }
    }
}
