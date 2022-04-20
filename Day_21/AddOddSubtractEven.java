/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class AddOddSubtractEven {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(), a, b,step;
        while(count < testCase){
            a = s.nextInt(); b = s.nextInt();
            if(a==b){System.out.println(0);}
            else if(a > b){
                if((a-b)%2==0){System.out.println(1);}  else{System.out.println(2);}
            }else{
                if((b-a)%2!=0){System.out.println(1);} else{System.out.println(2);}
            }
            ++count;
        }
    }
}
