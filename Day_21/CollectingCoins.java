/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class CollectingCoins {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),max,need,rem,polycoin,a,b,c;
        while(count < testCase){
            a=s.nextInt(); b=s.nextInt(); c=s.nextInt(); polycoin = s.nextInt();
            max = Math.max(a,Math.max(b,c));    need = (max *3) - (a+b+c);
            if(need <= polycoin){
                rem = polycoin - need;
                if(rem==0){System.out.println("YES");}
                else if(rem%3==0){System.out.println("YES");}
                else{System.out.println("NO");}
            }else{System.out.println("NO");}    ++count;
        }
    }
}
