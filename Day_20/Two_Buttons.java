/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Two_Buttons {
    public static int m;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        boolean dontStop = false;
        int n = s.nextInt(), step = 0,latest = 0; m = s.nextInt();
        if(n > m){  step  = n-m;    System.out.println(step);}
        else{
            int a = n,pos,neg; step = Integer.MAX_VALUE;
            while(!dontStop){
                pos = pushButton(a);
                neg = pushButton(a-1);
                System.out.println(pos +" "+ neg);
                if(pos < 0 || neg+1 < 0){
                    if(pos < 0 && neg+1 < 0){dontStop = true;}
                    else if(pos < 0){latest = neg+1+n-a; --a;}
                    else{ latest = pos+a-n; ++a;}
                }else if(pos < neg+1){latest  = pos+a-n; ++a;}
                else{   latest = neg+n-a; --a;}
                if(latest >= 0){
                    if(latest < step){step = latest;    li.add(step);}
                    else{dontStop = true;}
                }else{  dontStop = true;}
                System.out.println("latest : "+ latest);
                latest++;
            }
            Collections.sort(li);
            System.out.println(li.get(0));
        }
    }
    public static int pushButton(int a){
        int step = 0,diff1,diff2;
        System.out.println("value of a = "+a);
        if(a > 0){
            while(!(a >= m)){
                a *= 2; step++;
            }
        }
        diff1 = a-m;    diff2 = m-(a/2);
        if(a == m){ return step;}
        step += (diff1 <= diff2)? diff1 :  diff2;
        System.out.println("Stepped from here : "+step);
        return step;
    }    
}
