/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
public class AlternatingSubsequence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long testCase = s.nextInt(),num,a,len=0,neg,pos,sum;  
        boolean n;
        while(testCase-- > 0){
            num = s.nextLong(); len = pos = 0;  sum = 0l;   neg = Long.MIN_VALUE;   n = false;
            a = s.nextLong();    if(a > 0){pos = a; sum += a; n = true;} else{neg = a; sum+=a;}
            while(--num > 0){
                a = s.nextLong();
                if(n){
                    if(a > pos){
                        sum -= pos; pos = a; sum += pos;
                    }else if(a < 0){
                        neg = a;    sum += a;  n = false;
                    }
                }
                else{
                    if(a > neg && a < 0){
                        sum -= neg; neg = a; sum += neg;
                    }else if(a > 0){
                        pos = a; sum += a; n = true;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
