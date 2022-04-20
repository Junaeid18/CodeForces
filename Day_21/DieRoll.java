/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class DieRoll {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int y = s.nextInt(), w = s.nextInt(),max,prob,deno=6;
        max = Math.max(y, w);
        prob = 6 - max + 1;
        if(prob==6){prob=1;deno=1;}
        else if(prob%3==0){prob/=3;deno/=3;}
        else if(prob%2==0){prob/=2;deno/=2;}
        System.out.println(prob+"/"+deno);
    }    
}
