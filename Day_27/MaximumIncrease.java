/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.Scanner;
public class MaximumIncrease {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), pnum,num, prevLen = 0, curLen = 1;  
        pnum = s.nextInt();
        while(n-- > 1){
            num = s.nextInt();
            if(num > pnum){
                ++curLen;
            }else{
                if(curLen > prevLen){
                    prevLen = curLen; 
                }
                curLen = 1;
            }
            pnum = num;
        }   s.close();
        if(curLen > prevLen)System.out.println(curLen);
        else System.out.println(prevLen);
    }
}
